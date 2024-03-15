I tried to stay within the 2-3 hours for everything, but I didn't do everything in one stretch, so I'm not exactly sure how much time I spent.

I chose to make a console demo all the code for which is in the class "main".

Compromises:

1) The way I implemented the time for meetings were just an integer between 0 and 100, were 0 is the present. 
I did it this way mainly because I thought that inputing a date on the console demo would be really tedious.

2) I didn't make input error handling like submitting a string instead of a number.
But I did handle the errors that come from logical mistakes like:
Adding the same person twice, asking for the schedule of a person that doesn't exist or trying to book a meeting when one of the members is already busy.
I did that because I thought that it was more relevant to object oriented programming.

3) Java is case sensitive, and I didn't do anything about that, so "carl" and "Carl" can be two different people in the system.
