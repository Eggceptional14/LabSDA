public interface SlotComponentFactory {
	public Cabinet createCabinet();

	public Display createDisplay();

	public GPU createGPU();

	public Payment createPayment();

	public OS createOS();
}
