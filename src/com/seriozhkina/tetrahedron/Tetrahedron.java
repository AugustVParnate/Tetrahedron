package com.seriozhkina.tetrahedron;

public class Tetrahedron {
        private Point a;
        private Point b;
        private Point c;
        private Point d;


        public Tetrahedron(Point a, Point b, Point c, Point d) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
        }

        public Point getA() {
                return a;
        }

        public Point getB() {
                return b;
        }

        public Point getC() {
                return c;
        }

        public Point getD() {
                return d;
        }
}

