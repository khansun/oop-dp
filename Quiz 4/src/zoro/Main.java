package zoro;

class Main {
public static void main(String args[]) {
try {
throw 10;
}
catch(ArithmeticException e) {
System.out.println("Got the Exception " + e);
}
}
}