phrase Loading
nl
# Loads all Variables / Lists
int BF_P
int C_1
int C_2
int C_3
int C_4
int C_5
int C_S
int C_E
int C_C
int LOAD
int RUN


# Sets all the cells and files I guess
intl BF_mem 100
intl BF_code 900
intl File_begin 20
intl File_end 20
intl File_data 10000





# IMPORT YOUR PROGRAMCODES HERE:
lset File_begin 1 1
lset File_data 1 1
lset File_data 2 7
lset File_data 3 6
lset File_data 4 5
lset File_data 5 8
lset File_end 1 6




function LOAD
phrase Loading program 
outvardec LOAD
nl
lsetvvar File_begin LOAD C_S
lsetvvar File_end LOAD C_E
set C_1 1
set C_C 1
loop C_S < C_E

lsetvvar File_data C_S C_2
vvlset BF_code C_C C_2

math C_S + C_1
math C_C + C_1
if C_S < C_E loop
phrase Done.
nl
endfunc

function RUN
phrase Wiping BF CELL RAM...
nl
set C_1 1
set C_3 1
set C_4 0
set C_2 101
loop C_1 < C_2
vvlset BF_mem C_1 C_4
output #
math C_1 + C_3
if C_1 < C_2 loop

phrase Done.
nl











phrase Running program...
nl
set C_1 0
set C_2 1
set C_4 1
lsetvvar BF_code C_2 C_3
loop C_3 ≠ C_1
lsetvvar BF_code C_2 C_3

# code for an interpreter goes here






math C_2 + C_4
if C_3 ≠ C_1 loop





phrase Done.
nl
endfunc




phrase Starting...
nl

set LOAD 1
func LOAD

func RUN
















