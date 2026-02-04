class Solution {                         
    public int maxProduct(int[] nums) { 
        
        int max1 = 0, max2 = 0;          // max1 = sabse bada number, max2 = doosra sabse bada
        
        for (int n : nums) {             // Loop jo array ke har element ko check karega
            
            if (n > max1) {              // Agar current number max1 se bada ho
                max2 = max1;             // Purana max1 ko max2 bana do
                max1 = n;                // Current number ko max1 bana do
            } 
            else if (n > max2) {         // Agar number max1 se chhota ho par max2 se bada ho
                max2 = n;                // To use max2 bana do
            }
        }

        return (max1 - 1) * (max2 - 1);  // Final formula apply karke answer return
    }
}
