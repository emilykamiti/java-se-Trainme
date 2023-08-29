package com.systechafrica.Tests;

public class Grade {
    
        public char DetermineGrade(int MarkGrade){
            if (MarkGrade < 0){
                throw new IllegalArgumentException("Number grade cannot");
            }
        if (MarkGrade < 60 ){
            return 'F';
    
        }
        else if (MarkGrade < 50){
            return 'D';
    
        }
        else if (MarkGrade < 60){
            return 'C';
    
        }
        else if (MarkGrade>= 70){
            return 'B';
        }
        else {
            return 'A';
}
}
}

