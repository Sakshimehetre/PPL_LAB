college_has(mech_dept,h1).
college_has(comp_dept,h2).
college_has(instru_dept,h3).
college_has(prod_dept,h4).
college_has(elect_dept,h5).


teaches_subject(t1,math).

teaches_subject(t2,math).

teaches_subject(t3,dsa).

teaches_subject(t4,ppl).

teaches_subject(t5,dld).

teaches_subject(t6,dtl).
teaches_subject(t6,plevh).

 

has_subject(math_dept,math).

has_subject(comp_dept,dsa).

has_subject(comp_dept,ppl).

has_subject(comp_dept,dtl).

 
has_student(comp_dept,s1).
has_student(comp_dept,s2).
has_student(mech_dept,s3).
has_student(instru_dept,s4).
has_student(elect_dept,s5).


has_hod(A,B) :- has_student(X,A),college_has(X,B).
has_faculty(D,F) :- teaches_subject(F,S) , has_subject(D,S).
studies_subject(ST,SB) :- has_student(D,ST) , has_subject(D,SB).
studies_under(S,F) :- has_subject(D,SB) , has_student(D,S) , teaches_subject(F,SB).

 

 

 