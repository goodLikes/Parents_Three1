# FamilyTreeProject 2.9 🌳

## Описание

Проект "Family Tree" представляет собой приложение для управления семейным деревом. Оно позволяет добавлять членов семьи, устанавливать их отношения, редактировать информацию, а также сохранять и загружать семейное дерево из файлов.

## Структура проекта

Проект организован следующим образом:



```
family-tree-project/
│
├── app/
│   ├── model/
│   │   ├── FamilyMember.java
│   │   ├── FamilyTree.java
│   │   ├── Gender.java
│   │   ├── Relationship.java
│   │
│   ├── presenter/
│   │   ├── FamilyTreePresenter.java
│   │   ├── IPresenter.java
│   │
│   ├── view/
│   │   ├── ConsoleView.java
│   │   ├── IView.java
│   │
│   ├── Main.java
│
├── util/
│   ├── comparators/
│   │   ├── DateOfBirthComparator.java
│   │   ├── NameComparator.java
│   │
│   ├── operations/
│   │   ├── AddMemberOperation.java
│   │   ├── AddRelationshipOperation.java
│   │   ├── DeleteMemberOperation.java
│   │   ├── EditMemberOperation.java
│   │   ├── FamilyTreeOperation.java
│   │   ├── FindMemberByNameOperation.java
│   │   ├── LoadTreeOperation.java
│   │   ├── SaveTreeOperation.java
│   │   ├── ViewTreeOperation.java
│   │   ├── FilterByGenderOperation.java
│   │   ├── FilterByDateOfBirthOperation.java
│   │
│   ├── FileStorage.java
│   ├── IFamilyTreeStorage.java
│
└── README.md
```
## Особенности

- Поддержка английского и русского языков.
- Возможность поиска членов семьи по имени.
- Сохранение и загрузка семейного дерева из файла.

## Вклад

Если вы хотите внести свой вклад в проект, пожалуйста, создайте форк репозитория, внесите изменения и создайте пулл-реквест.

## Информация о разработчике 👤

- **Группа:** 6381
- **Фамилия и Имя:** Bakun Denis

