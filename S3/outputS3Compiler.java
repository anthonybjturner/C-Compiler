Output from s3 compiler

; //==========================================================
; // Add support for subtraction, division, null statement,
; // compound statement, print statement, and single-line
; // comments.
;    println((z - (x - 50)   // comment in middle of statement
; kd=  1 bL= 11 bC=  4 eL= 11 eC= 10     im=println
; kd=  6 bL= 11 bC= 11 eL= 11 eC= 11     im=(
; kd=  6 bL= 11 bC= 12 eL= 11 eC= 12     im=(
; kd=  3 bL= 11 bC= 13 eL= 11 eC= 13     im=z
; kd=  9 bL= 11 bC= 15 eL= 11 eC= 15     im=-
          p         z
; kd=  6 bL= 11 bC= 17 eL= 11 eC= 17     im=(
; kd=  3 bL= 11 bC= 18 eL= 11 eC= 18     im=x
; kd=  9 bL= 11 bC= 20 eL= 11 eC= 20     im=-
          p         x
; kd=  2 bL= 11 bC= 22 eL= 11 eC= 23     im=50
; kd=  7 bL= 11 bC= 24 eL= 11 eC= 24     im=)
          pwc       50
          sub
;         ) / 2 - x);
; kd=  7 bL= 12 bC=  9 eL= 12 eC=  9     im=)
          sub
; kd= 11 bL= 12 bC= 11 eL= 12 eC= 11     im=/
; kd=  2 bL= 12 bC= 13 eL= 12 eC= 13     im=2
; kd=  9 bL= 12 bC= 15 eL= 12 eC= 15     im=-
          pwc       2
          div
; kd=  3 bL= 12 bC= 17 eL= 12 eC= 17     im=x
; kd=  7 bL= 12 bC= 18 eL= 12 eC= 18     im=)
          p         x
          sub
          dout
          pc        '\n'
          aout
; kd=  5 bL= 12 bC= 19 eL= 12 eC= 19     im=;
;    println(2075);
; kd=  1 bL= 13 bC=  4 eL= 13 eC= 10     im=println
; kd=  6 bL= 13 bC= 11 eL= 13 eC= 11     im=(
; kd=  2 bL= 13 bC= 12 eL= 13 eC= 15     im=2075
; kd=  7 bL= 13 bC= 16 eL= 13 eC= 16     im=)
          pwc       2075
          dout
          pc        '\n'
          aout
; kd=  5 bL= 13 bC= 17 eL= 13 eC= 17     im=;
;    ;                       // null statement
; kd=  5 bL= 14 bC=  4 eL= 14 eC=  4     im=;
;    {{;                     // compound statement
; kd= 12 bL= 15 bC=  4 eL= 15 eC=  4     im={
; kd= 12 bL= 15 bC=  5 eL= 15 eC=  5     im={
; kd=  5 bL= 15 bC=  6 eL= 15 eC=  6     im=;
;       {
; kd= 12 bL= 16 bC=  7 eL= 16 eC=  7     im={
;       x = 10;
; kd=  3 bL= 17 bC=  7 eL= 17 eC=  7     im=x
; kd=  4 bL= 17 bC=  9 eL= 17 eC=  9     im==
          pc        x
; kd=  2 bL= 17 bC= 11 eL= 17 eC= 12     im=10
; kd=  5 bL= 17 bC= 13 eL= 17 eC= 13     im=;
          pwc       10
          stav
;       ;
; kd=  5 bL= 18 bC=  7 eL= 18 eC=  7     im=;
;       y = 20;
; kd=  3 bL= 19 bC=  7 eL= 19 eC=  7     im=y
; kd=  4 bL= 19 bC=  9 eL= 19 eC=  9     im==
          pc        y
; kd=  2 bL= 19 bC= 11 eL= 19 eC= 12     im=20
; kd=  5 bL= 19 bC= 13 eL= 19 eC= 13     im=;
          pwc       20
          stav
;    }};}
; kd= 13 bL= 20 bC=  4 eL= 20 eC=  4     im=}
; kd= 13 bL= 20 bC=  5 eL= 20 eC=  5     im=}
; kd=  5 bL= 20 bC=  6 eL= 20 eC=  6     im=;
; kd= 13 bL= 20 bC=  7 eL= 20 eC=  7     im=}
;    {}
; kd= 12 bL= 21 bC=  4 eL= 21 eC=  4     im={
; kd= 13 bL= 21 bC=  5 eL= 21 eC=  5     im=}
;    print(x);
; kd= 14 bL= 22 bC=  4 eL= 22 eC=  8     im=print
; kd=  6 bL= 22 bC=  9 eL= 22 eC=  9     im=(
; kd=  3 bL= 22 bC= 10 eL= 22 eC= 10     im=x
; kd=  7 bL= 22 bC= 11 eL= 22 eC= 11     im=)
          p         x
          dout
          dout
; kd=  5 bL= 22 bC= 12 eL= 22 eC= 12     im=;
;    println(x);
; kd=  1 bL= 23 bC=  4 eL= 23 eC= 10     im=println
; kd=  6 bL= 23 bC= 11 eL= 23 eC= 11     im=(
; kd=  3 bL= 23 bC= 12 eL= 23 eC= 12     im=x
; kd=  7 bL= 23 bC= 13 eL= 23 eC= 13     im=)
          p         x
          dout
          pc        '\n'
          aout
; kd=  5 bL= 23 bC= 14 eL= 23 eC= 14     im=;
;    println(1010);
; kd=  1 bL= 24 bC=  4 eL= 24 eC= 10     im=println
; kd=  6 bL= 24 bC= 11 eL= 24 eC= 11     im=(
; kd=  2 bL= 24 bC= 12 eL= 24 eC= 15     im=1010
; kd=  7 bL= 24 bC= 16 eL= 24 eC= 16     im=)
          pwc       1010
          dout
          pc        '\n'
          aout
; kd=  5 bL= 24 bC= 17 eL= 24 eC= 17     im=;
;    println(y);