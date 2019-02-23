**MojePanstwo**


Android University project thats displays list of companies in Poland based on search. Clicking item on list displays details about given company.
Application uses API from https://mojepanstwo.pl/

![1](https://user-images.githubusercontent.com/10707925/53278468-bdcbe380-3709-11e9-8ab4-4232205d6a0d.png)
![2](https://user-images.githubusercontent.com/10707925/53278469-bdcbe380-3709-11e9-9f54-eb4fb668a4d8.png)


Architecture

app uses Clean Architecture with multiple layers:
1. View - display data, it is as dumb as it can get.
2. Controller(Presenter) - glue between model and view
3. Commands(Use Cases) - wrap for a task
4. Repository - combines data from various sources
5. Provider(DataStore) - web data store, it uses DTOs to separate domain models and POJOs

RxJava2 is used for asynchronous downloads and event based operations.
Rotation is not supported for simplicity.
Single Activity architecture with Views is used because I like straightforwardness of that approach.
App is unit-tested but there are no UI-tests.
