/*TASK
A legend says that, somewhere in the East, near Hanoi, there is a temple. In the temple, there are three posts. In
the posts, there are 64 discs of 64 different sizes. When the world was created, all the discs were in the first post;
when all the discs are moved to the last post, the world will end.
The monks in the temple move the discs between posts, but they must obey two simple rules. First, only one
disc can be moved at a time, from one post to another post (it cannot be left anywhere else). Last, but not least,
a disc can only be placed on top of a bigger disc, never on top of a smaller disc. The smallest disc can be placed
on any post (all other discs are bigger); the biggest disc can only be placed on an empty post.
Create a method that calculates the number of moves necessary to move a set of n Hanoi disks from the initial
post to the last post. Hint: if you want to play monk yourself in order to better understand the problem, ask the
lecturer for a “Hanoi envelope”.*/

//A lot of help from youtube videos and alot of credit to http://www.javawithus.com/programs/towers-of-hanoi

void TOH(int n, String start, String middle, String end) {
    if (n == 1) {
        println start + " -> " + end
    } else if (n>0) {
        TOH(n-1, start, end, middle)
        println start + " -> " + end
        TOH(n-1, middle, start, end)
    }
        return;
}

println "Enter amount of disc to move: "
print "> "
int d = Integer.parseInt(System.console().readLine())
TOH(d, "A", "B", "C")
