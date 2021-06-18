class TanoshiiState extends DogState {
private static TanoshiiState s = new TanoshiiState();
private TanoshiiState() {}
public static DogState getInstance() {
return s;
}
public void tukareta(Dog moto) {
moto.changeState(FutsuuState.getInstance());
}
public void tabeta(Dog moto) {
// なにもしない
}
public String toString() {
return "楽しい状態";
}
}
class FutsuuState extends DogState {
private static FutsuuState s = new FutsuuState();
private FutsuuState() {}
public static DogState getInstance() {
return s;
}public void tukareta(Dog moto) {
	moto.changeState(IrairaState.getInstance());
	}
	public void tabeta(Dog moto) {
	moto.changeState(TanoshiiState.getInstance());
	}
	public String toString() {
	return "普通状態";
	}
	}class IrairaState extends DogState {
		private static IrairaState s = new IrairaState();
		private IrairaState() {}
		public static DogState getInstance() {
		return s;
		}public void tukareta(Dog moto) {
			// なにもしない
		}
		public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
		}
		public String toString() {
		return "いらいら状態";
		}
		}

	class NemuiState extends DogState {
		private static NemuiState s = new NemuiState();
		private NemuiState() {}
		public static DogState getInstance() {
		return s;
		}
		public void nemui1(Dog moto) {
			// なにもしない
			}
			public void nemui(Dog moto) {
			moto.changeState(TanoshiiState.getInstance());
			}
			public String toString() {
			return "寝たい状態";
			}
			@Override
			public void tukareta(Dog yobidashimoto) {
				// TODO 自動生成されたメソッド・スタブ

			}
			@Override
			public void tabeta(Dog yobidashimoto) {
				// TODO 自動生成されたメソッド・スタブ

			}
			}