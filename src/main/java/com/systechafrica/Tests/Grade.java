package com.systechafrica.Tests;

public class Grade {
    
        public char DetermineGrade(int MarkGrade){
            if (MarkGrade < 0){
                throw new IllegalArgumentException("Number grade cannot");
            }
        if (MarkGrade < 40 ){
            return 'F';
    
        }
        if (MarkGrade < 50){
            return 'D';
    
        }
        if (MarkGrade < 60){
            return 'C';
    
        }
        if (MarkGrade>= 70){
            return 'B';
        }
        else {
            return 'A';
}
}
}

// Above is without Else, its just if. Let the Test comfirm if it okay