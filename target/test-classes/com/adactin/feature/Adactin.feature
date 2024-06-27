Feature: Users Are Going To Enter Basic Details In Search Hotel Page 

Scenario: User Login The Application
Given User Launch The Joysale Web Application
When User Click The Login
And User Enter The Username In Username Field.
And User Enter The Password In Password Field
Then User Click The submit Button

Scenario: User Edit The Own Product
Given User Click Iphone Product
When User Click The Details Section
And User Click The Comments Section
And User Updating The Message in Message Box
And User Click The Comment Button
Then User Click The Edit Profile Button

Scenario: User Open The Dacathlon Application In Seprate Tab
Given User Launch The Dacathlon Application
When User Click The Tshirt Product
And User Click The Men Filter Option

