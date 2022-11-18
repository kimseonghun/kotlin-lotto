# kotlin-lotto

## 문자열 덧셈 계산기

기능 요구 사항

- 입력값 파서
  - [x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리하여 숫자 리스트를 반환한다.
  - [x] "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용하여 분리한 숫자 리스트를 반환한다.
  - [x] null이 들어오면 빈 리스트를 반환한다.
- 문자열 계산기
  - [x] 빈 숫자 리스트를 입력하면 0을 반환한다.
  - [x] 음수가 있으면 RuntimeException 예외를 던진다.
  - [x] 빈 문자열, 음수가 없으면 숫자의 합을 반환한다.
- 문자열 입력
  - [x] 콘솔로 입력받는다.
- 결과값 출력
  - [x] 콘솔로 결과값을 출력한다.

## 로또 기능

기능 요구 사항

- 로또
  - [x] 로또는 숫자 여섯자리를 관리한다.
  - [x] 로또는 중복 숫자를 가질 수 없다.
  - [x] 로또의 숫자 범위는 1에서 45 사이다.
- 숫자 생성기
  - [x] 숫자 생성기는 랜덤숫자 6자리를 생성한다. 
- 로또 일급 컬렉션
  - [ ] 로또를 입력받은 금액만큼의 갯수를 관리한다.
  - [ ] 당첨번호를 입력받아 통계를 반환한다.
