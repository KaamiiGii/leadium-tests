# Test with usage Leadium test framework 


The automated test-cases writen on *Kotlin* and based on: *Junit5, Leadium, Selenium, Selenide, Selenoid*.

For build and run uses: *Gradle*.

For reporting results of tests uses: *Allure2*.

[Documentation](https://leadex.gitlab.io/Leadium/leadium-doc/) 

## Description test
- Go to Google
- Do a search by random value
- Check that the search results are available
- If the search did nothing, the test failed

- Go to market.yandex.ru
- Go to monitor section (by search)
- Check delivery as self-carriage
- Check  Alienware и Dell vendor
- Find third
- If this price more then 100000, the test failed

Video with failed test should be [here](https://github.com/KaamiiGii/leadium-tests/tree/master/source/apps/example/video)

Test result should be [here](https://github.com/KaamiiGii/leadium-tests/blob/master/source/apps/example/build/allure-results/)
```
```
## Generating Allure Report

- Download [Allure](https://github.com/allure-framework/allure2/releases)
- For Allure report generating, we need to execute:

./allure serve /path/to/project_dir/test/apps/module_name/build/allure-results
