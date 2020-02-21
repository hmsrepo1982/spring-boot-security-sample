# spring-boot-security-sample

Spring Security is divided into 5 Parts - Almost matching every security model.

1) Authentication - 

Who am I -- Identify your self.
  Proof - Id 
  Security Question.
  
Enough? Might not be.

Send a Text Code to register your phone.

Enter the Code at second Level --- Multifactor authenticatio

2) Authorization
    - What access he wants.
    - default rule is none.
    - Define by user what access he can get.

3) Principal
    - Principal is Tied to user to remember his Account.
    - Once User and principal is tied - he can access many items allowed for that account
    - Single signon feature

4) Granted Authority - Fine Grained Rules
    - Define who can do what.
    - can be at user level but hard to maintain.
    - Every time new user comes in then you end up dealing with giving that authority.
    - But it establishes Rule what access they have.

5) Role - Coarse Grained , a Group who can has Same kind of Authority.
    - Group is created with Granted Authority
    - Can add all Users to this Group
    - Easy to maintain. 
   

