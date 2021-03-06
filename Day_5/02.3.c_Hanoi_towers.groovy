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

class TOH {
    int discs;
}
TOH input = new TOH()
println "Enter amount of disc to move:"
print "> "
input.discs = Integer.parseInt(System.console().readLine())
println "Minimum amount of moves:"
println "> " + towerMoves(input.discs)

// Method to calculate total amount of moves
int towerMoves(int n) {
    if (n < 2) {
        return 2;
    } else {
        int total = 3 * towerMoves(n-1) + 2;
        return total
    }
}