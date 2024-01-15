# 디자인 패턴의 아름다움


![디자인 패턴의 아름다움](https://contents.kyobobook.co.kr/sih/fit-in/458x0/pdt/9791192987101.jpg)

[디자인 패턴의 아름다움](https://product.kyobobook.co.kr/detail/S000202093794) 스터디에 진행하기 전 아래 방법을 꼭 읽어주세요.

## 스터디 진행 방법
### 스터디 목적

- 고품질 코드를 작성하기 위한 디자인 패턴과 설계 원칙을 학습합니다.

### 프로젝트 참여 방법
- 해당 프로젝트를 Fork 받는 방법은 [Git Repository를 Fork 하는 방법](https://github.com/jihwooon/Five-Lines-Study/issues/1)를 참고하시면 됩니다.
- PR 요청 방법은 [PR를 통해 요청하는 방법](https://github.com/jihwooon/Five-Lines-Study/issues/2)를 참고하시면 됩니다.
- Git 방법은 [Git 스타일 가이드](https://github.com/ikaruce/git-style-guide)를 참조하시면 됩니다.

### Pull Request 규칙
- 반드시 main 브랜치에서 작업하지 않습니다.
    - 새로운 브랜치를 생성 후 그 위에서 작업합니다.
- PR 요청하기 전 fetch와 rebase를 먼저 동기화를 해주세요.
    - `git fetch upstream main`
    - `git rebase upstream/main`
- 커밋 단위는 의미 단위로 쪼개주세요.
    - 수정과 리팩터링 2개 작업은 반드시 각 한 커밋으로 나눠서 올립니다.
- 커밋 그래프는 최대한 단순하게 가져갑니다
    - Git-flow 전략이 아닌 [트렁크 기반 개발](https://www.atlassian.com/ko/continuous-delivery/continuous-integration/trunk-based-development)을 사용합니다.
- 마지막 줄 공백 규칙을 따릅니다.
    - 파일 끝에 빈 줄을 추가함으로써 변경 사항을 올바르게 감지 할 수 있어 공백 규칙을 적용합니다.
- PR 요청 전 Self-Review를 합니다.
  - 코드를 작성 했을 때 고민 했던 대안, 문제점 등 전달 사항을 남깁니다.
- PR 리뷰 가능한 크기를 유지합니다
  - 리뷰 가능한 적당한 크기의 PR를 세팅해야합니다.
