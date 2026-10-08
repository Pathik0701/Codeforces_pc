package A.Counting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AntonAndPolyhedrons_785A {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        int totalFaces = 0;

        for (int i = 0; i < n; i++) {
            String polyhedron = br.readLine().trim();
            switch (polyhedron) {
                case "Tetrahedron":
                    totalFaces += 4;
                    break;
                case "Cube":
                    totalFaces += 6;
                    break;
                case "Octahedron":
                    totalFaces += 8;
                    break;
                case "Dodecahedron":
                    totalFaces += 12;
                    break;
                case "Icosahedron":
                    totalFaces += 20;
                    break;
            }
        }
        System.out.println(totalFaces);
    }
}
