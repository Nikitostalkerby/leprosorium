package mixin;

public class DeviceB extends Device implements SwitchableView {

	private Switchable switchable = new SwitchableImpl();

	@Override
	public Switchable getSwitchable() {
		return switchable;
	}
}