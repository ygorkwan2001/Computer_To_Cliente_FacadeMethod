public class ComputerFacade {
    private Cpu cpu;
    private Memoria memoria;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new Cpu();
        this.memoria = new Memoria();
        this.hardDrive = new HardDrive();
    }

    public void rodarPc(Cliente c){
        this.cpu.execute(c);
        this.cpu.start(c);
        this.memoria.load(c);
        this.memoria.free(c);
        this.hardDrive.write(c);
        this.hardDrive.read(c);
    }

}
