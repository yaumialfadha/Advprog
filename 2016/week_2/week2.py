#!/usr/bin/env python3
# Copyright 2012-13 Qtrac Ltd. All rights reserved.
# This program or module is free software: you can redistribute it
# and/or modify it under the terms of the GNU General Public License as
# published by the Free Software Foundation, either version 3 of the
# License, or (at your option) any later version. It is provided for
# educational purposes and is distributed in the hope that it will be
# useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
# General Public License for more details.

# This program has been modified from its original source
# (formbuilder.py) to fit in Advanced Programming lab exercise.

# Week 2 exercise instructions:
#
# 1. Fill in the blank methods (except add_text()) in HtmlFormBuilder
# class
# 2. Test the program to see whether it is able to create HTML- and
# Tk-based login form
# 3. Implement create_register_form() function
# 4. Modify and test the program to demonstrate that the program can
# create HTML- and Tk-based register form
# 5. Add new abstract method, add_text(), in AbstractFormBuilder class
# correctly
# 6. Implement add_text() in HtmlFormBuilder and TkFormBuilder
# 7. Design a new form and try implement the function to build it
# 8. Modify and test the program to demonstrate that the program can
# create the new form as HTML and Tk form
# 9. Modify and test the program to demonstrate that add_text() method
# is working properly (e.g. create another form/modify existing one
# where one element is created by calling add_text())

import abc
import re
import sys  # noqa
from html import escape  # noqa


def main():
    htmlFilename = "login.html"
    htmlForm = create_login_form(HtmlFormBuilder())
    with open(htmlFilename, "w", encoding="utf-8") as file:
        file.write(htmlForm)
    print("Wrote:", htmlFilename)

    tkFilename = "login.py"
    tkForm = create_login_form(TkFormBuilder())
    with open(tkFilename, "w", encoding="utf-8") as file:
        file.write(tkForm)
    print("Wrote:", tkFilename)

    # TODO Modify this program so that it can create registration
    # form using existing Builder object
    # BEGIN Write your statements to create the registration form for
    # HTML and Tk in the following area










    # END Implementation of registration form creation statements

    # TODO Modify this program so that you can demonstrate the new
    # form creating function
    # BEGIN Write your statements to create the new form for HTML and Tk
    # in the following area










    # END Implementation of new form creation statements

def create_login_form(builder):
    builder.add_title("Login")
    builder.add_label("Username", 0, 0, target="username")
    builder.add_entry("username", 0, 1)
    builder.add_label("Password", 1, 0, target="password")
    builder.add_entry("password", 1, 1, kind="password")
    builder.add_button("Login", 2, 0)
    builder.add_button("Cancel", 2, 1)
    return builder.form()


def create_register_form(builder):
    """
    Creates a registration form using given builder object.
    """
    # TODO Implement me!
    # Do not forget to remove the pass statement once you have
    # implemented this method
    pass

# TODO Design a new form according to your liking and try implement
# the function to build it. Extra credits for new form that using the
# new add_text() method from given builder object
# BEGIN Write your new function that creates new form










# END Implementation of your new function

class AbstractFormBuilder(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def add_title(self, title):
        self.title = title

    @abc.abstractmethod
    def form(self):
        pass

    @abc.abstractmethod
    def add_label(self, text, row, column, **kwargs):
        pass

    @abc.abstractmethod
    def add_entry(self, variable, row, column, **kwargs):
        pass

    @abc.abstractmethod
    def add_button(self, text, row, column, **kwargs):
        pass

    # TODO Add a new method named 'add_text' with parameters: (self,
    # text, row, column, **kwargs)
    # TODO Decorate the new method as an abstract method using correct
    # function decorator


class HtmlFormBuilder(AbstractFormBuilder):

    def __init__(self):
        self.title = "HtmlFormBuilder"
        self.items = {}

    def add_title(self, title):
        # TODO Implement me!
        # Do not forget to remove pass statement
        pass

    def add_label(self, text, row, column, **kwargs):
        # TODO Implement me!
        # Do not forget to remove pass statement
        pass

    def add_entry(self, variable, row, column, **kwargs):
        # TODO Implement me!
        # Do not forget to remove pass statement
        pass

    def add_button(self, text, row, column, **kwargs):
        # TODO Implement me!
        # Do not forget to remove pass statement
        pass

    def add_text(self, text, row, column, **kwargs):
        # TODO Implement me!
        # Do not forget to remove raise statement once you implemented
        # this method correctly
        raise NotImplementedError("Not yet implemented.")

    def form(self):
        html = ["<!doctype html>\n<html><head><title>{}</title></head>"
                "<body>".format(self.title), '<form><table border="0">']
        thisRow = None
        for key, value in sorted(self.items.items()):
            row, column = key
            if thisRow is None:
                html.append("  <tr>")
            elif thisRow != row:
                html.append("  </tr>\n  <tr>")
            thisRow = row
            html.append("    " + value)
        html.append("  </tr>\n</table></form></body></html>")
        return "\n".join(html)


class TkFormBuilder(AbstractFormBuilder):

    TEMPLATE = """#!/usr/bin/env python3
import tkinter as tk
import tkinter.ttk as ttk

class {name}Form(tk.Toplevel):

    def __init__(self, master):
        super().__init__(master)
        self.withdraw()     # hide until ready to show
        self.title("{title}")
        {statements}
        self.bind("<Escape>", lambda *args: self.destroy())
        self.deiconify()    # show when widgets are created and laid out
        if self.winfo_viewable():
            self.transient(master)
        self.wait_visibility()
        self.grab_set()
        self.wait_window(self)

if __name__ == "__main__":
    application = tk.Tk()
    window = {name}Form(application)
    application.protocol("WM_DELETE_WINDOW", application.quit)
    application.mainloop()
"""

    def __init__(self):
        self.title = "TkFormBuilder"
        self.statements = []

    def add_title(self, title):
        super().add_title(title)

    def add_label(self, text, row, column, **kwargs):
        name = self._canonicalize(text)
        create = """self.{}Label = ttk.Label(self, text="{}:")""".format(
                name, text)
        layout = """self.{}Label.grid(row={}, column={}, sticky=tk.W, \
padx="0.75m", pady="0.75m")""".format(name, row, column)
        self.statements.extend((create, layout))

    def add_entry(self, variable, row, column, **kwargs):
        name = self._canonicalize(variable)
        extra = "" if kwargs.get("kind") != "password" else ', show="*"'
        create = "self.{}Entry = ttk.Entry(self{})".format(name, extra)
        layout = """self.{}Entry.grid(row={}, column={}, sticky=(\
tk.W, tk.E), padx="0.75m", pady="0.75m")""".format(name, row, column)
        self.statements.extend((create, layout))

    def add_button(self, text, row, column, **kwargs):
        name = self._canonicalize(text)
        create = ("""self.{}Button = ttk.Button(self, text="{}")"""
                  .format(name, text))
        layout = """self.{}Button.grid(row={}, column={}, padx="0.75m", \
pady="0.75m")""".format(name, row, column)
        self.statements.extend((create, layout))

    def add_text(self, text, row, column, **kwargs):
        # TODO Implement me!
        # Do not forget to remove raise statement once you implemented
        # this method correctly
        raise NotImplementedError("Not yet implemented.")

    def form(self):
        return TkFormBuilder.TEMPLATE.format(
                title=self.title,
                name=self._canonicalize(self.title, False),
                statements="\n        ".join(self.statements))

    def _canonicalize(self, text, startLower=True):
        text = re.sub(r"\W+", "", text)
        if text[0].isdigit():
            return "_" + text
        return text if not startLower else text[0].lower() + text[1:]


if __name__ == "__main__":
    main()
