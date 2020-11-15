# LET'S EXPLODE TOGETHER!

## ??? : 함께 폭★4하자
![image](https://user-images.githubusercontent.com/64447484/99152066-e5838c00-26e2-11eb-8eb9-9f44ff5f0cc6.png)  
친구에게 트롤링하려고 만들어본 입니다.

### 설치
**GIT을 활용한 설치**
1. 다운로드할 위치에서 Git bash를 해 주세요.
2. `git clone https://github.com/playerdecuple/lets-explode-together`을 입력해 주세요.
3. 오우! FANTASTIC! 다운로드 끝!

### 적용
1. 다운로드된 디렉토리로 이동합니다.
2. 디렉토리에 있는 `lets-explode-together.exe`의 이름을 바꿉니다.
3. 이제 이 파일을 오른쪽 마우스 버튼을 눌러 클릭한 뒤 바로가기를 생성해 줍니다.
4. 바로가기에 오른쪽 마우스 버튼을 눌러 속성에 진입합니다.
5. 아이콘 변경 버튼을 누르고 원하는 아이콘으로 바꿉니다.
    - (원하는 프로그램의 아이콘이 있다면) 아이콘을 바꿀 때 창이 표시되면 `찾아보기` 버튼을 누른다음 원하는 아이콘을 가진 프로그램의 실행 파일을 찾아 더블클릭 해 주세요.

## 소개
실행 시 메모리 점유율을 99%까지 올려버립니다. 컴퓨터가 매우 느려집니다.

### 만들게 된 배경
원래 Timer 클래스를 실험하려고 만들었던 건데 실행하고 보니까 컴퓨터가 비명을 지르길래 만들어 봤습니다.

## 원리
Timer 클래스는 정해진 작업(Task)을 정해진 시간마다 진행하는 클래스입니다.  
이 클래스에 사용되는 'TimerTask'에다가 메모리를 조금 점유시키는데, 이걸 이용합니다.  
TimerTask가 상속된 클래스 내에서 Timer로 자기 자신을 반복하도록 만듭니다.

```java
class ExplodeCore extends TimerTask {

    @Override
    public void run() {
        while (true) {
            System.out.println("Check");
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new ExplodeCore(), 0, 1); // ExplodeCore 클래스를 생성, 메모리 점유율 더 할당
        }
    }
    
}
```  
이제 자기 자신을 무한대로 복제하기 시작합니다.  
어느 순간이 넘어가면 메모리 부족으로 에러가 나겠지만 그 때까지 연기 잘하면 컴퓨터를 껐다 키게 만들 수는 있습니다.


### 하꼬 프로그래머라서 설명이 틀렸을 수 있어요..

# D-E-M-O
![image](https://user-images.githubusercontent.com/64447484/99151965-3941a580-26e2-11eb-9725-9113ede8bfad.png)  
천천히 올라가긴 합니다만 어쨋든 이렇게 됩니다. 16GB 기준으로는 1분정도 걸렸읍니다..
