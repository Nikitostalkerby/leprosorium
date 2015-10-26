package mixin;

public class DeviceA extends Device implements SwitchableView {

	private Switchable switchable = new SwitchableImpl();

	@Override
	public Switchable getSwitchable() {
		return switchable;
	}
}