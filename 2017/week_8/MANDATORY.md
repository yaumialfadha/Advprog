# Exercise 8: First Part - Collaborative Work

CSCM602023 - Advanced Programming (Pemrograman Lanjut) @ Faculty of
Computer Science Universitas Indonesia, Even Semester 2016/2017

* * *

> If and only if you are teaming up with your friends, you are asked to
> do the tasks by using one project only. All team members will create
> additional branches for every feature they will implement. After they
> have implemented it well, they should `merge` their branch to the
> `master`. If you find any `merge conflict` or any Git issues, please
> resolve it together with your team. This is merely a practice to be
> accustomed with final project development.

In this part of exercise, you will follow the instructions given. The
purpose of this task is to familiarise yourself with the codebase,
workflow, testing, and other things pertaining to the project.

1. In this task each of you will be required to implement a small part of a zodiac lookup feature. You achieve this by completing the `lookup_zodiac` and `lookup_chinese_zodiac` functions in `csuibot/utils/zodiac.py` file. Please take a look at those functions and try to understand what they are doing. Samples have been implemented to help you understand.
1. The unit tests for those functions are implemented in `tests/test_utils.py`. Open the file and try to understand what those tests are all about. Samples have been written to help you understand.
1. Create a branch where you will implement your small feature.
1. If you are implementing zodiac lookup feature for Taurus, add `Taurus()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_taurus_lower_bound(self):
        res = zodiac.lookup_zodiac(4, 20)
        assert res == 'taurus'

    def test_taurus_upper_bound(self):
        res = zodiac.lookup_zodiac(5, 20)
        assert res == 'taurus'

    def test_taurus_in_between(self):
        res = zodiac.lookup_zodiac(4, 30)
        assert res == 'taurus'

    def test_not_taurus(self):
        res = zodiac.lookup_zodiac(11, 17)
        assert res != 'taurus'
    ```
1. If you are implementing zodiac lookup feature for Gemini, add `Gemini()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_gemini_lower_bound(self):
        res = zodiac.lookup_zodiac(5, 21)
        assert res == 'gemini'

    def test_gemini_upper_bound(self):
        res = zodiac.lookup_zodiac(6, 20)
        assert res == 'gemini'

    def test_gemini_in_between(self):
        res = zodiac.lookup_zodiac(6, 6)
        assert res == 'gemini'

    def test_not_gemini(self):
        res = zodiac.lookup_zodiac(11, 17)
        assert res != 'gemini'
    ```
1. If you are implementing zodiac lookup feature for Cancer, add `Cancer()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_cancer_lower_bound(self):
        res = zodiac.lookup_zodiac(6, 21)
        assert res == 'cancer'

    def test_cancer_upper_bound(self):
        res = zodiac.lookup_zodiac(7, 22)
        assert res == 'cancer'

    def test_cancer_in_between(self):
        res = zodiac.lookup_zodiac(7, 7)
        assert res == 'cancer'

    def test_not_cancer(self):
        res = zodiac.lookup_zodiac(11, 17)
        assert res != 'cancer'
    ```
1. If you are implementing zodiac lookup feature for Leo, add `Leo()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_leo_lower_bound(self):
        res = zodiac.lookup_zodiac(7, 23)
        assert res == 'leo'

    def test_leo_upper_bound(self):
        res = zodiac.lookup_zodiac(8, 22)
        assert res == 'leo'

    def test_leo_in_between(self):
        res = zodiac.lookup_zodiac(8, 8)
        assert res == 'leo'

    def test_not_leo(self):
        res = zodiac.lookup_zodiac(11, 17)
        assert res != 'leo'
    ```
1. If you are implementing zodiac lookup feature for Virgo, add `Virgo()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_virgo_lower_bound(self):
        res = zodiac.lookup_zodiac(8, 23)
        assert res == 'virgo'

    def test_virgo_upper_bound(self):
        res = zodiac.lookup_zodiac(9, 22)
        assert res == 'virgo'

    def test_virgo_in_between(self):
        res = zodiac.lookup_zodiac(9, 9)
        assert res == 'virgo'

    def test_not_virgo(self):
        res = zodiac.lookup_zodiac(11, 17)
        assert res != 'virgo'
    ```
1. If you are implementing zodiac lookup feature for Libra, add `Libra()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_libra_lower_bound(self):
        res = zodiac.lookup_zodiac(9, 23)
        assert res == 'libra'

    def test_libra_upper_bound(self):
        res = zodiac.lookup_zodiac(10, 22)
        assert res == 'libra'

    def test_libra_in_between(self):
        res = zodiac.lookup_zodiac(10, 10)
        assert res == 'libra'

    def test_not_libra(self):
        res = zodiac.lookup_zodiac(11, 17)
        assert res != 'libra'
    ```
1. If you are implementing zodiac lookup feature for Scorpio, add `Scorpio()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_scorpio_lower_bound(self):
        res = zodiac.lookup_zodiac(10, 23)
        assert res == 'scorpio'

    def test_scorpio_upper_bound(self):
        res = zodiac.lookup_zodiac(11, 21)
        assert res == 'scorpio'

    def test_scorpio_in_between(self):
        res = zodiac.lookup_zodiac(11, 11)
        assert res == 'scorpio'

    def test_not_scorpio(self):
        res = zodiac.lookup_zodiac(11, 27)
        assert res != 'scorpio'
    ```
1. If you are implementing zodiac lookup feature for Sagittarius, add `Sagittarius()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_sagittarius_lower_bound(self):
        res = zodiac.lookup_zodiac(11, 22)
        assert res == 'sagittarius'

    def test_sagittarius_upper_bound(self):
        res = zodiac.lookup_zodiac(12, 21)
        assert res == 'sagittarius'

    def test_sagittarius_in_between(self):
        res = zodiac.lookup_zodiac(12, 12)
        assert res == 'sagittarius'

    def test_not_sagittarius(self):
        res = zodiac.lookup_zodiac(11, 17)
        assert res != 'sagittarius'
    ```
1. If you are implementing zodiac lookup feature for Capricorn, add `Capricorn()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_capricorn_lower_bound(self):
        res = zodiac.lookup_zodiac(12, 22)
        assert res == 'capricorn'

    def test_capricorn_upper_bound(self):
        res = zodiac.lookup_zodiac(1, 19)
        assert res == 'capricorn'

    def test_capricorn_in_between(self):
        res = zodiac.lookup_zodiac(1, 1)
        assert res == 'capricorn'

    def test_not_capricorn(self):
        res = zodiac.lookup_zodiac(11, 17)
        assert res != 'capricorn'
    ```
1. If you are implementing zodiac lookup feature for Aquarius, add `Aquarius()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_aquarius_lower_bound(self):
        res = zodiac.lookup_zodiac(1, 20)
        assert res == 'aquarius'

    def test_aquarius_upper_bound(self):
        res = zodiac.lookup_zodiac(2, 18)
        assert res == 'aquarius'

    def test_aquarius_in_between(self):
        res = zodiac.lookup_zodiac(2, 2)
        assert res == 'aquarius'

    def test_not_aquarius(self):
        res = zodiac.lookup_zodiac(11, 17)
        assert res != 'aquarius'
    ```
1. If you are implementing zodiac lookup feature for Pisces, add `Pisces()` in the `zodiacs` list in `lookup_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestZodiac` class in `tests/test_utils.py`.

    ```python
    def test_pisces_lower_bound(self):
        res = zodiac.lookup_zodiac(2, 19)
        assert res == 'pisces'

    def test_pisces_upper_bound(self):
        res = zodiac.lookup_zodiac(3, 20)
        assert res == 'pisces'

    def test_pisces_in_between(self):
        res = zodiac.lookup_zodiac(3, 3)
        assert res == 'pisces'

    def test_not_pisces(self):
        res = zodiac.lookup_zodiac(11, 17)
        assert res != 'pisces'
    ```
1. If you are implementing Chinese zodiac lookup feature for buffalo, add `'buffalo'` in the `zodiacs` list in `lookup_chinese_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestChineseZodiac` class in `tests/test_utils.py`.

    ```python
    def test_buffalo(self):
        years = [1997, 1985, 1973, 1961, 2009, 2021]
        self.run_test('buffalo', years)
    ```
1. If you are implementing Chinese zodiac lookup feature for tiger, add `'tiger'` in the `zodiacs` list in `lookup_chinese_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestChineseZodiac` class in `tests/test_utils.py`.

    ```python
    def test_tiger(self):
        years = [1998, 1986, 1974, 1962, 2010, 2022]
        self.run_test('tiger', years)
    ```
1. If you are implementing Chinese zodiac lookup feature for rabbit, add `'rabbit'` in the `zodiacs` list in `lookup_chinese_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestChineseZodiac` class in `tests/test_utils.py`.

    ```python
    def test_rabbit(self):
        years = [1999, 1987, 1975, 1963, 2011, 2023]
        self.run_test('rabbit', years)
    ```
1. If you are implementing Chinese zodiac lookup feature for dragon, add `'dragon'` in the `zodiacs` list in `lookup_chinese_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestChineseZodiac` class in `tests/test_utils.py`.

    ```python
    def test_dragon(self):
        years = [2000, 1988, 1976, 1964, 2012, 2024]
        self.run_test('dragon', years)
    ```
1. If you are implementing Chinese zodiac lookup feature for snake, add `'snake'` in the `zodiacs` list in `lookup_chinese_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestChineseZodiac` class in `tests/test_utils.py`.

    ```python
    def test_snake(self):
        years = [2001, 1989, 1977, 1965, 2013, 2025]
        self.run_test('snake', years)
    ```
1. If you are implementing Chinese zodiac lookup feature for horse, add `'horse'` in the `zodiacs` list in `lookup_chinese_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestChineseZodiac` class in `tests/test_utils.py`.

    ```python
    def test_horse(self):
        years = [2002, 1990, 1978, 1966, 2014, 2026]
        self.run_test('horse', years)
    ```
1. If you are implementing Chinese zodiac lookup feature for goat, add `'goat'` in the `zodiacs` list in `lookup_chinese_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestChineseZodiac` class in `tests/test_utils.py`.

    ```python
    def test_goat(self):
        years = [2003, 1991, 1979, 1967, 2015, 2027]
        self.run_test('goat', years)
    ```
1. If you are implementing Chinese zodiac lookup feature for monkey, add `'monkey'` in the `zodiacs` list in `lookup_chinese_zodiac` function in `csuibot/utils/zodiac.py`. You also need to put the following methods inside `TestChineseZodiac` class in `tests/test_utils.py`.

    ```python
    def test_monkey(self):
        years = [2004, 1992, 1980, 1968, 2016, 2028]
        self.run_test('monkey', years)
    ```
1. Run the tests and lint and make sure that your changes pass all the
tests and produce no lint warning. If not, make sure you have written
down the code as instructed above.

    Tips: Follow the guide about running tests and linter written in
    [README.md](README.md).
1. If all tests and linter pass, commit and push your changes to your branch.
1. Make a merge request via GitLab Web interface to merge your branch to
the master branch.
1. Ask the repository's owner (i.e. your friend) to review and merge your
changes.
1. After all of your and your friends work are merged, proceed to the next
part of the exercise at [ADDITIONAL.md](ADDITIONAL.md).