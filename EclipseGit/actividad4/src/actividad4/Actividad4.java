package actividad4;

public class Actividad4 {
	 public static void main(String[] args) {
	        //inicializar tres asignaturas
	        Asignatura asignatura1 = new Asignatura(1);
	        Asignatura asignatura2 = new Asignatura(2);
	        Asignatura asignatura3 = new Asignatura(3);

	        //inicializar un alumno con tres asignaturas
	        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);

	        //inicializa un profesor 
	        Profesor profesor = new Profesor();
	        profesor.ponerNotas(alumno);

	        
	        double media = profesor.calcularMedia(alumno);
	        System.out.println(asignatura1);
	        System.out.println(asignatura2);
	        System.out.println(asignatura3);
	        System.out.println("La media del alumno es: " + media);
	    }
}