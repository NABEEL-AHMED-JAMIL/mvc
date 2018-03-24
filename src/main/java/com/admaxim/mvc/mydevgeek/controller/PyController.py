#
# -*- first:project:-1 -*-
print("Hello");
# -*- first:project:-2 -*-
this_world_is_flat = True;
if this_world_is_flat:
    print("Be CareFull not to fall off!");
# -*- first:project:-3 -*-
word = 'Python';
print(word[0] +"-"+ word[5]+ word[-1] +"-"+ word[-5]);
print(word[:2] + word[2:]);
# -*- first:project:-4 -*-
letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g'];
print(letters);
print(letters[2:5]);
# assign the new value
letters[2:5] = [2,4,5];
print(letters)
# remove the all
letters[:] = [];
print(letters);
# loop
# b = 0;
# while b < 1000:
#     print(b, end=', ');
x = int(input("Please enter an integer number"));
if x < 0:
    x = 0
    print("XXXXXX");
elif x == 0:
    print("Zero");
elif x == 1:
    print("Single");
else:
    print("More");
# list
a = ['Nabeel','Ahmed','Like','Little','Lamb'];
for i in range(len(a)):
    print(i, a[i]);
# ------------------
def ask_ok(prompt, retries=4, reminder='Please try again!'):
    while True:
        ok = input(prompt);
        if ok in ('y', 'ye', 'yes'):
            return True;
        if ok in ('n', 'no', 'nop', 'nope'):
            return False;
        retries = retries - 1;
        if retries < 0:
            raise ValueError('Invalid User response')
        print(reminder);
ask_ok("DODDD");
# ------------------
def function(a, L=None):
    if L is None :
        L = [];
    L.append(a);
    return L;
print(function(23));