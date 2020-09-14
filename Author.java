package ru.mirea.Lab2.Author;
import java.lang.*;
public class Author {

        private String name;
        private String email;
        private char gender;
        public Author(String n, String e, char g) {
            this.name = n;
            this.email = e;
            this.gender = g;
            if (this.gender < 77 | (this.gender > 77 & this.gender < 87) | this.gender > 87)
            {
                System.out.println("Enter your gender correctly");
                System.exit(0);
            }
        }
        public String getName()
        {

            return name;
        }
        public String getEmail()
        {
            return email;
        }
        public void setEmail(String e)
        {
            this.email = e;
        }
        public char getGender()
        {
            return gender;
        }
        public String toString() {
            return String.format(getName()+"("+getGender()+") "+"at "+getEmail());
        }

}
