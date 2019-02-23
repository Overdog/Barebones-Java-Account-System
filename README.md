# Barebones-Java-Account-System
Util for attempting to create an account system for servers and other applications in Java. This is extremely outdated, so it really isn't the best, however I update it. This is only the login system, not register.

Hello!

My name is Overdog and I made a simple util for you to easily develop a login system! I didn't include a registration system in this as there are so many ways, some people don't like people registering in applications, so I only included a login system. In order to implement your website registration you can change the variables in the MySQL and Login class to your website's database info, and follow the installation guide.

Installation:

1. Install the source code and insert it into your source folder.
2. In your main method, make two input strings (However you want.), and put the following method when the user puts in the info and is ready.
Login.login(<string1>, <string2>);

Then, the login method will check the MySQL database to see if the username and password are valid, and then is sent a message in the output stream. You can of course change this!

Questions:

Question: How can I implement this to other ways, such as frames?
Answer: Just modify the Login method around, and just do Login.login();

Question: How do I modify what happens when a login is correct or not correct?
Answer: Go into the Login class and modify the fields required.

Question: Will there be updates for this?
Answer: Yes! I always try to update my projects every few weeks. Please do not expect a bug to be patched ASAP, I usually like making my updates either Bug Updates or Quality Updates.

Question: Where can I contact you?
Answer: Send me an email at overdog.business@gmail.com or a Discord message at Overdog#4603.

Question: Is there an auto update system?
Answer: No. There is no need for just a util. Just check back every few weeks.
