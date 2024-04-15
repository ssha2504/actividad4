package actividad4;
import java.util.Random;

class Profesor {
	 private Random random;

	    public Profesor() {
	        random = new Random();
	    }

	    public void ponerNotas(Alumno alumno) {
	        alumno.getAsignatura1().setCalificacion(generarCalificacionAleatoria());
	        alumno.getAsignatura2().setCalificacion(generarCalificacionAleatoria());
	        alumno.getAsignatura3().setCalificacion(generarCalificacionAleatoria());
	    }

	    public double calcularMedia(Alumno alumno) {
	        return (alumno.getAsignatura1().getCalificacion() + alumno.getAsignatura2().getCalificacion() +
	                alumno.getAsignatura3().getCalificacion()) / 3.0;
	    }

	    private double generarCalificacionAleatoria() {
	        return random.nextDouble() * 10; // calificación aleatoria entre 0 y 10
	    }


	    
}