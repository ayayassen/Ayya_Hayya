package home;

public class LeaseLengthSpec implements GeneralSpec{

	private LeaseLength leaseLength;

	public LeaseLengthSpec(LeaseLength leaseLength) {
		this.leaseLength = leaseLength;
	}

	public LeaseLength getLeaseLength() {
		return leaseLength;
	}

	public boolean isMatchingSpec(Home h) {
		return h.getLeaseLength()==getLeaseLength().getLeseLength();
	}

}
