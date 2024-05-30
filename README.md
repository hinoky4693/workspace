# GIT 설정 방식
1. GIT bash 64bit for window download 한다.
2. 레포지토리(TIL)랑 연결을 원하는 폴더에서 마우스 우측 클릭 후 'open git bash' 클릭
3. 아래와 같이 초기설정을 진행한다.
```
$ git init
$ git config user.name hinoky4693 # username설정
$ git config user.email roghk1204@naver.com # github email 추가
$ git remote add origin https://github.com/hinoky4693/workspace.git
```
4. 파일 추가 후 올리는 법(연결된 폴더 제일 상단에서 진행)
```
$ git add .
$ git commit -m'원하는 커밋 메세지 작성'
$ git push origin master
```
5. 파일을 받는 법(연결된 해당 폴더에서 진행)
```
$ git pull origin master
```
6. 현재 상태에 변화가 있는지 확인
```
$ git status
```
7. (주의) 만약 깃을 되돌리고 싶을때
> git 커밋ID는 TIL 레포지토리의 우측에 commits 클릭 하고 돌아가고 싶은 커밋의 ID를 복사해서 가져온다.
```
$ git reset --hard  커밋ID
```
