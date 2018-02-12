# Collections Practice/Understanding

## What is a Collection?
Collections is the root interface of the collection hierarchy.  A collection just represents a group of objects. The collection can do different things with the objects (or elements) based on
which of the subinterfaces are implemented. <br>

Some examples of subinterfaces include List, Set, and Queue.  Map doesn't implement the Collection interface, but is also a structure for keeping collections of data. <br>

### List
This interface implements Collection, and has some common classes implementing it such as LinkedList, ArrayList, and Vector.<br>
The better way to implement an ArrayList or LinkedList would be to do the following:
```
List<String> list = new ArrayList<>();
```
This is better than:
```
ArrayList<String> list = new ArrayList<>();
```
That is because it helps decouple the codebase.  If you realized you needed a LinkedList instead of an ArrayList, and have already used it throughout the program, then you just need to
change one line of code, and use this instead:
```
List<String> list = new LinkedList<>();
```

Also, you don't need to put the class type in the right-side diamond operator.<br>
With the list object made, you can use any method implemented from the List interface, but nothing from ArrayList itself. 
