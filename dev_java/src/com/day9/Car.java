package com.day9;

public class Car {
	int wheelNum = 0;

	public void stop() {
	}
//a is a b가 성립되면 상속이다. 
//자동차는 소나타이다. x 소나타는 자동차이다. O
//상속은 결합도가 높다.
//오버라이딩
	class sonata extends Car {
		@Override
		public void stop() {
		}

		public int stop(int i) {
			return 0;
		}

		public double stop(double i) {
			return 0.0;
		}
	}
}