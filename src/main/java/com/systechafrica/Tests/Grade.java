package com.systechafrica.Tests;

public class Grade {
    
        public char DetermineGrade(int MarkGrade){
        if (MarkGrade >= 70){
            return 'A';
    
        }
        else if (MarkGrade >= 60){
            return 'B';
    
        }
        else if (MarkGrade >= 50){
            return 'C';
    
        }
        else if (MarkGrade>= 40){
            return 'D';
        }
        else {
            return 'F';
}
}
}

