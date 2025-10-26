# java-racingcar-precourse

# 기능 요구 사항
- 자동차 이름 입력 기능
  - 프로그램 시작시 자동차 이름을 문자열로 입력받는다.
  - 제약: 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용한다.
- 시도 횟수 입력 기능
  - 사용자가 몇 번의 이동을 할 것인지 입력받는다.
  - 제약: 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용한다.
- 입력값 검증 기능
  - 입력된 이름과 시도 횟수가 유효한지 검증
  - 유효하지 않은경우 IllegalArgumentException 발생
  - 조건
    - 이름
      - 공백 불가
      - 5자 초과 불가
      - 중복 이름 불가
      - 쉼표 연속 불가
    - 시도 횟수
      - 양의 정수만 허용
      - 숫자 이외의 문자 불가
      - 소수 불가
      - 빈 값 불가
- 자동차 이동 기능
  - 입력받은 시도 횟수 동안 자동차는 전진 및 멈출 수 있다.
    - 전진 조건: 0에서 9사이의 무작위 값이 4 이상일 경우 전진
    - 제약: Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용한다.
- 차수별 경주 결과 출력 기능
  - 각 차수별로 자동차 이름과 현재 위치 출력
  - 위치는 하이픈(-)으로 표현 (예: pobi : --)
- 최종 우승자 출력 기능
  - 우승자는 한 명 이상일 수 있다.
  - 우승자가 여러 명일 경우 쉼표(,)로 구분하여 출력

# INPUT
```text
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,woni,jun
시도할 횟수는 몇 회인가요?
5
```

# OUTPUT
```text
실행 결과
pobi : -
woni :
jun : -

pobi : --
woni : -
jun : --

pobi : ---
woni : --
jun : ---

pobi : ----
woni : ---
jun : ----

pobi : -----
woni : ----
jun : -----

최종 우승자 : pobi, jun
```