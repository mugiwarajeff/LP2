package src;

public class TodosOcupados extends Exception {
    
    public TodosOcupados(){
        super("Todas as posições estão ocupados");
    }
}
