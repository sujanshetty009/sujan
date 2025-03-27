// Java Program to add two numbers without using arithmetic operators 

class GfG {

    // function to add two numbers without using arithmetic operators
    static int sum(int a, int b) {
        
        // Iterate till there is no carry 
        while (b != 0) { 
            
            // carry contains common set bits of a and b, left shifted by 1
            int carry = (a & b) << 1;

            // Update a with (a + b without carry)
            a = a ^ b;
          
            // Update b with carry
            b = carry; 
        } 
        return a;
    } 

    public static void main(String[] args) {
        int a = -1, b = 2;
      
        System.out.println(sum(a, b));
    } 
}
