---
title: "Code Coverage"

excerpt: "https://woowacourse.github.io/javable/post/2020-10-24-code-coverage/"

categroies:
  - Blog
tags:
  - Blog
---

# Code Coverage
## Code Coverage 측정
Code Coverage 는 테스트를 진행했을때 코드 자체가 얼마나 실행되었는지 측정하는 것이다.
코드는 구문(Statement), 조건(Condition), 결정(Decision) 으로 이루어진다. 이 세가지 항목을 얼마나 커버했느냐에 따라 측정값이 달라진다. 일반적으로 많이 사용되는 커버리지는 구문(Statement)커버리지이며, 실행 코드라인이 한번 이상 실행 되면 충족된다. 조건(Condition)커버리지는 각 내부 조건이 참 혹은 거짓을 가지면 충족된다. 결정(Decision) 커버리지는 각 분기의 내부 조건자체가 아닌 이러한 조건으로 인해 전체 결과가 참 혹은 거짓이면 충족된다. 

## JaCoCo
JaCoCo 는 Java Code Coverage 를 측정하는 오픈소스 라이브러리다. 테스트 결과에 따라 xml, html 형태로 보고서가 작성된다. 또한 목표하는 커버리지를 설정하고, 이를 만족하는지 확인 할 수 있다.