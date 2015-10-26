package mixin;

public class SwitchableImpl implements Switchable {

	private boolean active;

	@Override
	public boolean isActive() {
		return active;
	}

	@Override
	public void setActive(boolean active) {
		this.active = active;
	}
}