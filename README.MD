# Test Spring boot 2 App

A simple spring boot 2 app to demonstrate complex
spring properties bindings via ENVIRONMENT variables

```bash
export TEST_LST_0_ID=3234
export TEST_LST_1_ID=1234
export TEST_LST_0_NAME=hello
export TEST_A=a,2,3,4
export test_lst_0_name=hello
export TEST_DOMAINS_C_ID=000998877
export TEST_DOMAINS_C_NAME=fromenv

./gradlew bootRun
```

or

```bash
./run.sh
```

#### To test

```bash
curl localhost:8080/ | jq .
```

#### Correct Output:
```JSON
[
  {
    "name": "hello",
    "id": 3234
  },
  {
    "name": null,
    "id": 1234
  }
]
[
  "a",
  "2",
  "3",
  "4"
]
{
  "a": {
    "name": "lucy",
    "id": 2
  },
  "b": {
    "name": "jack",
    "id": 4
  },
  "c": {
    "name": "fromenv",
    "id": 998877
  }
}
```

##### Reference

|Property|Note|
|--------|----|
|acme.my-project.person.first-name|Kebab case, which is recommended for use in .properties and .yml files.|
|acme.myProject.person.firstName|Standard camel case syntax.|
|acme.my_project.person.first_name|Underscore notation, which is an alternative format for use in .properties and .yml files.|
|ACME_MYPROJECT_PERSON_FIRSTNAME|Upper case format, which is recommended when using system environment variables.|
|MY_ACME_1_OTHER|MY_ACME_1_OTHER same as *my.acme\[1\].other*|
|MY_ACME_A_NAME|MY_ACME_A_NAME same as *my.acme\[A\].name* if `a` property defined as Map Type|

We recommend that, when possible, properties are stored in lower-case kebab format, such as `my.property-name=acme`

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config-relaxed-binding