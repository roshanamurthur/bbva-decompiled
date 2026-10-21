import{z as t,a8 as e,ab as a,aa as o,be as r,an as i,cE as n,dv as l,ak as c,da as s,h as d,dw as b,aV as u,aZ as f,J as m,L as v,ac as h,ad as y,cR as p,bF as g,aq as _,bw as S,av as P,aI as k,aX as C,b3 as A,bS as x,cv as T,ck as D,H as $}from"./952f98a9.js";import{R,D as w,T as I,v as E,x as B,G as L,S as O,h as M,H,z as F,M as q,K as N,Q as j,N as U}from"./216055dc.js";import"./7f3d7ca9.js";import"./c0a2f832.js";import"./cae0f1de.js";var z={colorPrimarySurfaceAmbientDefault:"#f4f4f4",colorPrimarySurfaceAmbientPressed:"#ffffff",colorPrimarySurfaceAmbientPreloading:"#ffffff",colorPrimarySurfaceAmbientOverlay:"#043263",colorPrimarySurfaceAlternativeDefault:"#ffffff",colorPrimarySurfaceAlternativePressed:"#f4f4f4",colorPrimarySurfaceAlternativePreloading:"#e9e9e9",colorPrimarySurfaceContrastDefault:"#004481",colorPrimarySurfaceContrastPressed:"#043263",colorPrimarySurfaceInfoDefault:"#d4edfc",colorPrimarySurfaceInfoPreloading:"#ffffff",colorPrimarySurfaceSuccessDefault:"#d9efe0",colorPrimarySurfaceSuccessPreloading:"#ffffff",colorPrimarySurfaceWarningDefault:"#fef5dc",colorPrimarySurfaceWarningPreloading:"#ffffff",colorPrimarySurfaceErrorDefault:"#fcdfdf",colorPrimarySurfaceErrorPreloading:"#ffffff",colorPrimarySurfaceSustainabilityDefault:"#eaf9fa",colorPrimarySurfaceSustainabilityPreloading:"#ffffff",colorPrimarySupportInfoDefault:"#004481",colorPrimarySupportSuccessDefault:"#277a3e",colorPrimarySupportWarningDefault:"#685219",colorPrimarySupportErrorDefault:"#b92a45",colorPrimarySupportPendingDefault:"#666666",colorPrimarySupportSustainabilityDefault:"#028484",colorPrimaryBadgeInfoBackground:"#004481",colorPrimaryBadgeInfoText:"#ffffff",colorPrimaryBadgeSuccessBackground:"#277a3e",colorPrimaryBadgeSuccessText:"#ffffff",colorPrimaryBadgeWarningBackground:"#685219",colorPrimaryBadgeWarningText:"#ffffff",colorPrimaryBadgeErrorBackground:"#b92a45",colorPrimaryBadgeErrorText:"#ffffff",colorPrimaryBadgeOffBackground:"#666666",colorPrimaryBadgeOffText:"#ffffff",colorPrimaryBadgeSustainabilityBackground:"#028484",colorPrimaryBadgeSustainabilityText:"#ffffff",colorPrimaryNotificationAlertBackground:"#b92a45",colorPrimaryNotificationAlertText:"#ffffff",colorPrimaryNotificationInfoBackground:"#ffffff",colorPrimaryNotificationInfoText:"#043263",colorPrimaryTextUncovered:"#b92a45",colorPrimaryTextIncome:"#1464a5",colorPrimaryText01Default:"#121212",colorPrimaryText01Inverse:"#ffffff",colorPrimaryText02Default:"#666666",colorPrimaryText02Inverse:"#f4f4f4",colorPrimaryFormatDivider:"#d3d3d3",colorPrimaryFormatBullet:"#1464a5",colorPrimaryRatingStars:"#8e7022",colorPrimaryCategoriesExpectedExpenses:"#5bbeff",colorPrimaryCategoriesExpectedIncome:"#d8be75",colorPrimaryCategoriesTransportation:"#b79e5e",colorPrimaryCategoriesOtherIncomes:"#b79e5e",colorPrimaryCategoriesLeisure:"#c49735",colorPrimaryCategoriesHome:"#d8732c",colorPrimaryCategoriesFinancing:"#d8732c",colorPrimaryCategoriesPublicAdministration:"#c0475e",colorPrimaryCategoriesEducation:"#d44b50",colorPrimaryCategoriesHealthBeauty:"#b92a45",colorPrimaryCategoriesSalariesRentsSubsidies:"#c569b9",colorPrimaryCategoriesTravel:"#c569b9",colorPrimaryCategoriesSaving:"#c569b9",colorPrimaryCategoriesInvestment:"#7c6ac7",colorPrimaryCategoriesShopping:"#7c6ac7",colorPrimaryCategoriesNgoAssociations:"#6754b8",colorPrimaryCategoriesSustainability:"#02a5a5",colorPrimaryCategoriesCashFinancialServices:"#006c6c",colorPrimaryCategoriesCashTransfersChecks:"#006c6c",colorPrimaryCategoriesCollectionInvoicesRemittances:"#277a3e",colorPrimaryCategoriesOthers:"#666666",colorPrimaryCategoriesPoints:"#006c6c",colorPrimaryCategoriesOfferDiscountRefound:"#c569b9",colorPrimaryCategoriesFinancingSkipPayments:"#b79e5e",colorPrimaryCategoriesCombinedPromotions:"#7c6ac7",colorPrimaryProcessPending:"#666666",colorPrimaryProcessInProgress:"#02a5a5",colorPrimaryProcessAlert:"#b92a45",colorPrimaryProcessWarning:"#685219",colorPrimaryProcessCompleted:"#277a3e",colorPrimaryRiskLevelOne:"#d44b50",colorPrimaryRiskLevelTwo:"#d8732c",colorPrimaryRiskLevelThree:"#9c6c01",colorPrimaryRiskLevelFour:"#388d4f",colorPrimaryRiskLevelFive:"#277a3e",colorPrimaryDataAxis01:"#d3d3d3",colorPrimaryDataAxis02:"#666666",colorPrimaryLocationsUser:"#d44b50",colorPrimaryLocationsPinsIcon:"#ffffff",colorPrimaryLocationsPinsBackgroundDefault:"#004481",colorPrimaryLocationsPinsBackgroundPressed:"#043263",colorPrimaryLocationsPinsBackgroundSelected:"#ffffff",colorPrimaryLocationsPinsBackgroundSelectedPressed:"#f4f4f4",colorPrimaryLocationsPinsTextDefault:"#ffffff",colorPrimaryLocationsPinsTextPressed:"#d4edfc",colorPrimaryLocationsPinsTextSelected:"#000000",colorPrimaryLocationsPinsTextSelectedPressed:"#666666",colorPrimaryEmergentMainText:"#ffffff",colorPrimaryEmergentMainBackgroundDefault:"#1464a5",colorPrimaryEmergentMainBackgroundPressed:"#004481",colorPrimaryEmergentMainLinkDefault:"#ffffff",colorPrimaryEmergentMainLinkPressed:"#d4edfc",colorPrimaryCtaMainBackgroundDefault:"#1464a5",colorPrimaryCtaMainBackgroundPressed:"#004481",colorPrimaryCtaMainTextDefault:"#ffffff",colorPrimaryCtaMainTextPressed:"#ffffff",colorPrimaryCtaMainTextPreloading:"#004481",colorPrimaryCtaComplementaryBackgroundPressed:"#ffffff",colorPrimaryCtaComplementaryTextDefault:"#1464a5",colorPrimaryCtaComplementaryTextPressed:"#004481",colorPrimaryCtaComplementaryBorderDefault:"#d3d3d3",colorPrimaryCtaPositiveBackgroundDefault:"#028484",colorPrimaryCtaPositiveBackgroundPressed:"#006c6c",colorPrimaryCtaPositiveTextDefault:"#ffffff",colorPrimaryCtaPositiveTextPressed:"#ffffff",colorPrimaryCtaNegativeBackgroundDefault:"#b92a45",colorPrimaryCtaNegativeBackgroundPressed:"#c0475e",colorPrimaryCtaNegativeTextDefault:"#ffffff",colorPrimaryCtaNegativeTextPressed:"#ffffff",colorPrimaryCtaNegativeTextPreloading:"#c0475e",colorPrimaryCtaDisabledBackground:"#e9e9e9",colorPrimaryCtaDisabledText:"#bdbdbd",colorPrimaryCtaMultistepBackgroundDefault:"#1464a5",colorPrimaryCtaMultistepBackgroundPressed:"#004481",colorPrimaryCtaMultistepTextDefault:"#ffffff",colorPrimaryCtaMultistepTextPressed:"#ffffff",colorPrimarySelectionInteraction01BackgroundSelected:"#004481",colorPrimarySelectionInteraction01BackgroundSelectedPressed:"#043263",colorPrimarySelectionInteraction01TextSelected:"#ffffff",colorPrimarySelectionInteraction01TextSelectedPressed:"#d4edfc",colorPrimarySelectionInteraction02Selected:"#004481",colorPrimarySelectionInteraction02SelectedPressed:"#043263",colorPrimaryLinkMainPressed:"#004481",colorPrimaryLinkMainDefault:"#1464a5",colorPrimaryLinkComplementaryDefault:"#121212",colorPrimaryLinkComplementaryPressed:"#666666",colorPrimaryLinkHighlightDefault:"#f8cd51",colorPrimaryLinkHighlightPressed:"#ffffff",colorPrimaryLinkNegativeDefault:"#b92a45",colorPrimaryLinkNegativePressed:"#c0475e",colorPrimaryLinkInverseDefault:"#1464a5",colorPrimaryLinkInversePressed:"#004481",colorPrimaryLinkImageDefault:"#ffffff",colorPrimaryLinkImagePressed:"#d4edfc",colorPrimaryFormInputBackgroundDefault:"#ffffff",colorPrimaryFormInputBackgroundError:"#fcdfdf",colorPrimaryFormInputPlaceholderDefault:"#666666",colorPrimaryFormInputPlaceholderError:"#b92a45",colorPrimaryFormInputFieldTextDefault:"#121212",colorPrimaryFormInputFieldTextError:"#121212",colorPrimaryFormInputHintTextDefault:"#666666",colorPrimaryFormInputHintTextError:"#666666",colorPrimaryFormInputIconDefault:"#1464a5",colorPrimaryFormInputIconReadOnly:"#666666",colorPrimaryFormInputIconError:"#b92a45",colorPrimaryFormInputAddIconDefault:"#1464a5",colorPrimaryFormInputAddIconError:"#1464a5",colorPrimaryFormInputBorderInactive:"#666666",colorPrimaryFormInputBorderActive:"#121212",colorPrimaryFormInputBorderError:"#d44b50",colorPrimaryFormSelectorBackgroundDefault:"#ffffff",colorPrimaryFormSelectorBackgroundAlternative:"#f4f4f4",colorPrimaryFormSelectorBackgroundError:"#fcdfdf",colorPrimaryFormSelectorBackgroundContrast:"#043263",colorPrimaryFormSelectorBorderDefault:"#666666",colorPrimaryFormSelectorBorderError:"#d44b50",colorPrimaryFormSelectorBorderContrast:"#ffffff",colorPrimaryFormSelectorCheckDefault:"#004481",colorPrimaryFormSelectorCheckReadOnly:"#666666",colorPrimaryFormSelectorCheckContrast:"#ffffff",colorPrimaryFormSwitchBackgroundOn:"#1464a5",colorPrimaryFormSwitchBackgroundOff:"#666666",colorPrimaryFormSwitchBackgroundContrast:"#ffffff",colorPrimaryFormSwitchHandleOn:"#ffffff",colorPrimaryFormSwitchHandleOff:"#ffffff",colorPrimaryFormSwitchHandleContrast:"#1464a5",colorPrimaryAltSurfaceAmbientDefault:"#ffffff",colorPrimaryAltSurfaceAmbientPressed:"#f4f4f4",colorPrimaryAltSurfaceAmbientPreloading:"#e9e9e9",colorPrimaryAltSurfaceAmbientOverlay:"#043263",colorPrimaryAltSurfaceAlternativeDefault:"#f4f4f4",colorPrimaryAltSurfaceAlternativePressed:"#ffffff",colorPrimaryAltSurfaceAlternativePreloading:"#ffffff",colorPrimaryAltSurfaceContrastDefault:"#004481",colorPrimaryAltSurfaceContrastPressed:"#043263",colorPrimaryAltSurfaceInfoDefault:"#d4edfc",colorPrimaryAltSurfaceInfoPreloading:"#ffffff",colorPrimaryAltSurfaceSuccessDefault:"#d9efe0",colorPrimaryAltSurfaceSuccessPreloading:"#ffffff",colorPrimaryAltSurfaceWarningDefault:"#fef5dc",colorPrimaryAltSurfaceWarningPreloading:"#ffffff",colorPrimaryAltSurfaceErrorDefault:"#fcdfdf",colorPrimaryAltSurfaceErrorPreloading:"#ffffff",colorPrimaryAltSurfaceSustainabilityDefault:"#eaf9fa",colorPrimaryAltSurfaceSustainabilityPreloading:"#ffffff",colorPrimaryAltSupportInfoDefault:"#004481",colorPrimaryAltSupportSuccessDefault:"#277a3e",colorPrimaryAltSupportWarningDefault:"#685219",colorPrimaryAltSupportErrorDefault:"#b92a45",colorPrimaryAltSupportPendingDefault:"#666666",colorPrimaryAltSupportSustainabilityDefault:"#028484",colorPrimaryAltBadgeInfoBackground:"#004481",colorPrimaryAltBadgeInfoText:"#ffffff",colorPrimaryAltBadgeSuccessBackground:"#277a3e",colorPrimaryAltBadgeSuccessText:"#ffffff",colorPrimaryAltBadgeWarningBackground:"#685219",colorPrimaryAltBadgeWarningText:"#ffffff",colorPrimaryAltBadgeErrorBackground:"#b92a45",colorPrimaryAltBadgeErrorText:"#ffffff",colorPrimaryAltBadgeOffBackground:"#666666",colorPrimaryAltBadgeOffText:"#ffffff",colorPrimaryAltBadgeSustainabilityBackground:"#028484",colorPrimaryAltBadgeSustainabilityText:"#ffffff",colorPrimaryAltNotificationAlertBackground:"#b92a45",colorPrimaryAltNotificationAlertText:"#ffffff",colorPrimaryAltNotificationInfoBackground:"#f4f4f4",colorPrimaryAltNotificationInfoText:"#043263",colorPrimaryAltTextUncovered:"#b92a45",colorPrimaryAltTextIncome:"#1464a5",colorPrimaryAltText01Default:"#121212",colorPrimaryAltText01Inverse:"#ffffff",colorPrimaryAltText02Default:"#666666",colorPrimaryAltText02Inverse:"#f4f4f4",colorPrimaryAltFormatDivider:"#d3d3d3",colorPrimaryAltFormatBullet:"#1464a5",colorPrimaryAltRatingStars:"#8e7022",colorPrimaryAltCategoriesExpectedExpenses:"#5bbeff",colorPrimaryAltCategoriesExpectedIncome:"#d8be75",colorPrimaryAltCategoriesTransportation:"#b79e5e",colorPrimaryAltCategoriesOtherIncomes:"#b79e5e",colorPrimaryAltCategoriesLeisure:"#c49735",colorPrimaryAltCategoriesHome:"#d8732c",colorPrimaryAltCategoriesFinancing:"#d8732c",colorPrimaryAltCategoriesPublicAdministration:"#c0475e",colorPrimaryAltCategoriesEducation:"#d44b50",colorPrimaryAltCategoriesHealthBeauty:"#b92a45",colorPrimaryAltCategoriesSalariesRentsSubsidies:"#c569b9",colorPrimaryAltCategoriesTravel:"#c569b9",colorPrimaryAltCategoriesSaving:"#c569b9",colorPrimaryAltCategoriesInvestment:"#7c6ac7",colorPrimaryAltCategoriesShopping:"#7c6ac7",colorPrimaryAltCategoriesNgoAssociations:"#6754b8",colorPrimaryAltCategoriesSustainability:"#02a5a5",colorPrimaryAltCategoriesCashFinancialServices:"#006c6c",colorPrimaryAltCategoriesCashTransfersChecks:"#006c6c",colorPrimaryAltCategoriesCollectionInvoicesRemittances:"#277a3e",colorPrimaryAltCategoriesOthers:"#666666",colorPrimaryAltCategoriesPoints:"#006c6c",colorPrimaryAltCategoriesOfferDiscountRefound:"#c569b9",colorPrimaryAltCategoriesFinancingSkipPayments:"#b79e5e",colorPrimaryAltCategoriesCombinedPromotions:"#7c6ac7",colorPrimaryAltProcessPending:"#666666",colorPrimaryAltProcessInProgress:"#02a5a5",colorPrimaryAltProcessAlert:"#b92a45",colorPrimaryAltProcessWarning:"#685219",colorPrimaryAltProcessCompleted:"#277a3e",colorPrimaryAltRiskLevelOne:"#d44b50",colorPrimaryAltRiskLevelTwo:"#d8732c",colorPrimaryAltRiskLevelThree:"#9c6c01",colorPrimaryAltRiskLevelFour:"#388d4f",colorPrimaryAltRiskLevelFive:"#277a3e",colorPrimaryAltDataAxis01:"#d3d3d3",colorPrimaryAltDataAxis02:"#666666",colorPrimaryAltLocationsUser:"#d44b50",colorPrimaryAltLocationsPinsIcon:"#ffffff",colorPrimaryAltLocationsPinsBackgroundDefault:"#004481",colorPrimaryAltLocationsPinsBackgroundPressed:"#043263",colorPrimaryAltLocationsPinsBackgroundSelected:"#ffffff",colorPrimaryAltLocationsPinsBackgroundSelectedPressed:"#f4f4f4",colorPrimaryAltLocationsPinsTextDefault:"#ffffff",colorPrimaryAltLocationsPinsTextPressed:"#d4edfc",colorPrimaryAltLocationsPinsTextSelected:"#000000",colorPrimaryAltLocationsPinsTextSelectedPressed:"#666666",colorPrimaryAltEmergentMainText:"#ffffff",colorPrimaryAltEmergentMainBackgroundDefault:"#1464a5",colorPrimaryAltEmergentMainBackgroundPressed:"#004481",colorPrimaryAltEmergentMainLinkDefault:"#ffffff",colorPrimaryAltEmergentMainLinkPressed:"#d4edfc",colorPrimaryAltCtaMainBackgroundDefault:"#1464a5",colorPrimaryAltCtaMainBackgroundPressed:"#004481",colorPrimaryAltCtaMainTextDefault:"#ffffff",colorPrimaryAltCtaMainTextPressed:"#ffffff",colorPrimaryAltCtaMainTextPreloading:"#004481",colorPrimaryAltCtaComplementaryBackgroundPressed:"#f4f4f4",colorPrimaryAltCtaComplementaryTextDefault:"#1464a5",colorPrimaryAltCtaComplementaryTextPressed:"#004481",colorPrimaryAltCtaComplementaryBorderDefault:"#d3d3d3",colorPrimaryAltCtaPositiveBackgroundDefault:"#028484",colorPrimaryAltCtaPositiveBackgroundPressed:"#006c6c",colorPrimaryAltCtaPositiveTextDefault:"#ffffff",colorPrimaryAltCtaPositiveTextPressed:"#ffffff",colorPrimaryAltCtaNegativeBackgroundDefault:"#b92a45",colorPrimaryAltCtaNegativeBackgroundPressed:"#c0475e",colorPrimaryAltCtaNegativeTextDefault:"#ffffff",colorPrimaryAltCtaNegativeTextPressed:"#ffffff",colorPrimaryAltCtaNegativeTextPreloading:"#c0475e",colorPrimaryAltCtaDisabledBackground:"#e9e9e9",colorPrimaryAltCtaDisabledText:"#bdbdbd",colorPrimaryAltCtaMultistepBackgroundDefault:"#1464a5",colorPrimaryAltCtaMultistepBackgroundPressed:"#004481",colorPrimaryAltCtaMultistepTextDefault:"#ffffff",colorPrimaryAltCtaMultistepTextPressed:"#ffffff",colorPrimaryAltSelectionInteraction01BackgroundSelected:"#004481",colorPrimaryAltSelectionInteraction01BackgroundSelectedPressed:"#043263",colorPrimaryAltSelectionInteraction01TextSelected:"#ffffff",colorPrimaryAltSelectionInteraction01TextSelectedPressed:"#d4edfc",colorPrimaryAltSelectionInteraction02Selected:"#004481",colorPrimaryAltSelectionInteraction02SelectedPressed:"#043263",colorPrimaryAltLinkMainDefault:"#1464a5",colorPrimaryAltLinkMainPressed:"#004481",colorPrimaryAltLinkComplementaryDefault:"#121212",colorPrimaryAltLinkComplementaryPressed:"#666666",colorPrimaryAltLinkHighlightDefault:"#f8cd51",colorPrimaryAltLinkHighlightPressed:"#ffffff",colorPrimaryAltLinkNegativeDefault:"#b92a45",colorPrimaryAltLinkNegativePressed:"#c0475e",colorPrimaryAltLinkInverseDefault:"#1464a5",colorPrimaryAltLinkInversePressed:"#004481",colorPrimaryAltLinkImageDefault:"#ffffff",colorPrimaryAltLinkImagePressed:"#d4edfc",colorPrimaryAltFormInputBackgroundDefault:"#f4f4f4",colorPrimaryAltFormInputBackgroundError:"#fcdfdf",colorPrimaryAltFormInputPlaceholderDefault:"#666666",colorPrimaryAltFormInputPlaceholderError:"#b92a45",colorPrimaryAltFormInputFieldTextDefault:"#121212",colorPrimaryAltFormInputFieldTextError:"#121212",colorPrimaryAltFormInputHintTextDefault:"#666666",colorPrimaryAltFormInputHintTextError:"#666666",colorPrimaryAltFormInputIconDefault:"#1464a5",colorPrimaryAltFormInputIconReadOnly:"#666666",colorPrimaryAltFormInputIconError:"#b92a45",colorPrimaryAltFormInputAddIconDefault:"#1464a5",colorPrimaryAltFormInputAddIconError:"#1464a5",colorPrimaryAltFormInputBorderInactive:"#666666",colorPrimaryAltFormInputBorderActive:"#121212",colorPrimaryAltFormInputBorderError:"#d44b50",colorPrimaryAltFormSelectorBackgroundDefault:"#f4f4f4",colorPrimaryAltFormSelectorBackgroundAlternative:"#ffffff",colorPrimaryAltFormSelectorBackgroundError:"#fcdfdf",colorPrimaryAltFormSelectorBackgroundContrast:"#043263",colorPrimaryAltFormSelectorBorderDefault:"#666666",colorPrimaryAltFormSelectorBorderError:"#d44b50",colorPrimaryAltFormSelectorBorderContrast:"#ffffff",colorPrimaryAltFormSelectorCheckDefault:"#004481",colorPrimaryAltFormSelectorCheckReadOnly:"#666666",colorPrimaryAltFormSelectorCheckContrast:"#ffffff",colorPrimaryAltFormSwitchBackgroundOn:"#1464a5",colorPrimaryAltFormSwitchBackgroundOff:"#666666",colorPrimaryAltFormSwitchBackgroundContrast:"#ffffff",colorPrimaryAltFormSwitchHandleOn:"#ffffff",colorPrimaryAltFormSwitchHandleOff:"#ffffff",colorPrimaryAltFormSwitchHandleContrast:"#1464a5",colorSecondarySurfaceAmbientDefault:"#043263",colorSecondarySurfaceAmbientPressed:"#004481",colorSecondarySurfaceAmbientPreloading:"#004481",colorSecondarySurfaceAmbientOverlay:"#043263",colorSecondarySurfaceAlternativeDefault:"#004481",colorSecondarySurfaceAlternativePressed:"#043263",colorSecondarySurfaceAlternativePreloading:"#043263",colorSecondarySurfaceContrastDefault:"#ffffff",colorSecondarySurfaceContrastPressed:"#e9e9e9",colorSecondarySurfaceInfoDefault:"#d4edfc",colorSecondarySurfaceInfoPreloading:"#ffffff",colorSecondarySurfaceSuccessDefault:"#d9efe0",colorSecondarySurfaceSuccessPreloading:"#ffffff",colorSecondarySurfaceWarningDefault:"#fef5dc",colorSecondarySurfaceWarningPreloading:"#ffffff",colorSecondarySurfaceErrorDefault:"#fcdfdf",colorSecondarySurfaceErrorPreloading:"#ffffff",colorSecondarySurfaceSustainabilityDefault:"#eaf9fa",colorSecondarySurfaceSustainabilityPreloading:"#ffffff",colorSecondarySupportInfoDefault:"#d4edfc",colorSecondarySupportSuccessDefault:"#d9efe0",colorSecondarySupportWarningDefault:"#fef5dc",colorSecondarySupportErrorDefault:"#fcdfdf",colorSecondarySupportPendingDefault:"#f4f4f4",colorSecondarySupportSustainabilityDefault:"#eaf9fa",colorSecondaryBadgeInfoBackground:"#ffffff",colorSecondaryBadgeInfoText:"#004481",colorSecondaryBadgeSuccessBackground:"#ffffff",colorSecondaryBadgeSuccessText:"#277a3e",colorSecondaryBadgeWarningBackground:"#ffffff",colorSecondaryBadgeWarningText:"#685219",colorSecondaryBadgeErrorBackground:"#ffffff",colorSecondaryBadgeErrorText:"#b92a45",colorSecondaryBadgeOffBackground:"#ffffff",colorSecondaryBadgeOffText:"#666666",colorSecondaryBadgeSustainabilityBackground:"#ffffff",colorSecondaryBadgeSustainabilityText:"#028484",colorSecondaryNotificationAlertBackground:"#e77d8e",colorSecondaryNotificationAlertText:"#121212",colorSecondaryNotificationInfoBackground:"#004481",colorSecondaryNotificationInfoText:"#ffffff",colorSecondaryTextUncovered:"#e77d8e",colorSecondaryTextIncome:"#d4edfc",colorSecondaryText01Default:"#ffffff",colorSecondaryText01Inverse:"#121212",colorSecondaryText02Default:"#f4f4f4",colorSecondaryText02Inverse:"#666666",colorSecondaryFormatDivider:"#d3d3d3",colorSecondaryFormatBullet:"#2dcccd",colorSecondaryRatingStars:"#5bbeff",colorSecondaryCategoriesExpectedExpenses:"#5bbeff",colorSecondaryCategoriesExpectedIncome:"#f3ebd5",colorSecondaryCategoriesTransportation:"#d8be75",colorSecondaryCategoriesOtherIncomes:"#d8be75",colorSecondaryCategoriesLeisure:"#f8cd51",colorSecondaryCategoriesHome:"#fab27f",colorSecondaryCategoriesFinancing:"#f7893b",colorSecondaryCategoriesPublicAdministration:"#e77d8e",colorSecondaryCategoriesEducation:"#f35e61",colorSecondaryCategoriesHealthBeauty:"#da3851",colorSecondaryCategoriesSalariesRentsSubsidies:"#fab3f0",colorSecondaryCategoriesTravel:"#f78be8",colorSecondaryCategoriesSaving:"#f78be8",colorSecondaryCategoriesInvestment:"#b6a8ee",colorSecondaryCategoriesShopping:"#8f7ae5",colorSecondaryCategoriesNgoAssociations:"#b6a8ee",colorSecondaryCategoriesSustainability:"#5ac4c4",colorSecondaryCategoriesCashFinancialServices:"#2dcccd",colorSecondaryCategoriesCashTransfersChecks:"#2dcccd",colorSecondaryCategoriesCollectionInvoicesRemittances:"#88ca9a",colorSecondaryCategoriesOthers:"#f4f4f4",colorSecondaryCategoriesPoints:"#2dcccd",colorSecondaryCategoriesOfferDiscountRefound:"#fab3f0",colorSecondaryCategoriesFinancingSkipPayments:"#d8be75",colorSecondaryCategoriesCombinedPromotions:"#b6a8ee",colorSecondaryProcessPending:"#f4f4f4",colorSecondaryProcessInProgress:"#2dcccd",colorSecondaryProcessAlert:"#e77d8e",colorSecondaryProcessWarning:"#f8cd51",colorSecondaryProcessCompleted:"#48ae64",colorSecondaryRiskLevelOne:"#f35e61",colorSecondaryRiskLevelTwo:"#f7893b",colorSecondaryRiskLevelThree:"#f8cd51",colorSecondaryRiskLevelFour:"#88ca9a",colorSecondaryRiskLevelFive:"#48ae64",colorSecondaryDataAxis01:"#d3d3d3",colorSecondaryDataAxis02:"#f4f4f4",colorSecondaryLocationsUser:"#f35e61",colorSecondaryLocationsPinsIcon:"#ffffff",colorSecondaryLocationsPinsBackgroundDefault:"#ffffff",colorSecondaryLocationsPinsBackgroundPressed:"#f4f4f4",colorSecondaryLocationsPinsBackgroundSelected:"#004481",colorSecondaryLocationsPinsBackgroundSelectedPressed:"#043263",colorSecondaryLocationsPinsTextDefault:"#121212",colorSecondaryLocationsPinsTextPressed:"#666666",colorSecondaryLocationsPinsTextSelected:"#ffffff",colorSecondaryLocationsPinsTextSelectedPressed:"#d4edfc",colorSecondaryEmergentMainText:"#121212",colorSecondaryEmergentMainBackgroundDefault:"#ffffff",colorSecondaryEmergentMainBackgroundPressed:"#d4edfc",colorSecondaryEmergentMainLinkDefault:"#1464a5",colorSecondaryEmergentMainLinkPressed:"#004481",colorSecondaryCtaMainBackgroundDefault:"#ffffff",colorSecondaryCtaMainBackgroundPressed:"#d4edfc",colorSecondaryCtaMainTextDefault:"#1464a5",colorSecondaryCtaMainTextPressed:"#1464a5",colorSecondaryCtaMainTextPreloading:"#e9e9e9",colorSecondaryCtaComplementaryBackgroundPressed:"#ffffff",colorSecondaryCtaComplementaryTextDefault:"#ffffff",colorSecondaryCtaComplementaryTextPressed:"#1464a5",colorSecondaryCtaComplementaryBorderDefault:"#ffffff",colorSecondaryCtaPositiveBackgroundDefault:"#02a5a5",colorSecondaryCtaPositiveBackgroundPressed:"#028484",colorSecondaryCtaPositiveTextDefault:"#ffffff",colorSecondaryCtaPositiveTextPressed:"#ffffff",colorSecondaryCtaNegativeBackgroundDefault:"#b92a45",colorSecondaryCtaNegativeBackgroundPressed:"#c0475e",colorSecondaryCtaNegativeTextDefault:"#ffffff",colorSecondaryCtaNegativeTextPressed:"#ffffff",colorSecondaryCtaNegativeTextPreloading:"#c0475e",colorSecondaryCtaDisabledBackground:"#072146",colorSecondaryCtaDisabledText:"#004481",colorSecondaryCtaMultistepBackgroundDefault:"#1464a5",colorSecondaryCtaMultistepBackgroundPressed:"#004481",colorSecondaryCtaMultistepTextDefault:"#ffffff",colorSecondaryCtaMultistepTextPressed:"#ffffff",colorSecondarySelectionInteraction01BackgroundSelected:"#ffffff",colorSecondarySelectionInteraction01BackgroundSelectedPressed:"#f4f4f4",colorSecondarySelectionInteraction01TextSelected:"#121212",colorSecondarySelectionInteraction01TextSelectedPressed:"#666666",colorSecondarySelectionInteraction02Selected:"#5bbeff",colorSecondarySelectionInteraction02SelectedPressed:"#49a5e6",colorSecondaryLinkMainDefault:"#5bbeff",colorSecondaryLinkMainPressed:"#49a5e6",colorSecondaryLinkComplementaryDefault:"#ffffff",colorSecondaryLinkComplementaryPressed:"#d4edfc",colorSecondaryLinkHighlightDefault:"#f8cd51",colorSecondaryLinkHighlightPressed:"#ffffff",colorSecondaryLinkNegativeDefault:"#fcdfdf",colorSecondaryLinkNegativePressed:"#f59799",colorSecondaryLinkInverseDefault:"#ffffff",colorSecondaryLinkInversePressed:"#d4edfc",colorSecondaryLinkImageDefault:"#ffffff",colorSecondaryLinkImagePressed:"#d4edfc",colorSecondaryFormInputBackgroundDefault:"#004481",colorSecondaryFormInputBackgroundError:"#fcdfdf",colorSecondaryFormInputPlaceholderDefault:"#f4f4f4",colorSecondaryFormInputPlaceholderError:"#b92a45",colorSecondaryFormInputFieldTextDefault:"#ffffff",colorSecondaryFormInputFieldTextError:"#121212",colorSecondaryFormInputHintTextDefault:"#f4f4f4",colorSecondaryFormInputHintTextError:"#666666",colorSecondaryFormInputIconDefault:"#5bbeff",colorSecondaryFormInputIconReadOnly:"#f4f4f4",colorSecondaryFormInputIconError:"#b92a45",colorSecondaryFormInputAddIconDefault:"#5bbeff",colorSecondaryFormInputAddIconError:"#1464a5",colorSecondaryFormInputBorderInactive:"#f4f4f4",colorSecondaryFormInputBorderActive:"#ffffff",colorSecondaryFormInputBorderError:"#d44b50",colorSecondaryFormSelectorBackgroundDefault:"#004481",colorSecondaryFormSelectorBackgroundAlternative:"#043263",colorSecondaryFormSelectorBackgroundError:"#fcdfdf",colorSecondaryFormSelectorBackgroundContrast:"#f4f4f4",colorSecondaryFormSelectorBorderDefault:"#f4f4f4",colorSecondaryFormSelectorBorderError:"#d44b50",colorSecondaryFormSelectorBorderContrast:"#666666",colorSecondaryFormSelectorCheckDefault:"#ffffff",colorSecondaryFormSelectorCheckReadOnly:"#f4f4f4",colorSecondaryFormSelectorCheckContrast:"#004481",colorSecondaryFormSwitchBackgroundOn:"#ffffff",colorSecondaryFormSwitchBackgroundOff:"#ffffff",colorSecondaryFormSwitchBackgroundContrast:"#1464a5",colorSecondaryFormSwitchHandleOn:"#1464a5",colorSecondaryFormSwitchHandleOff:"#666666",colorSecondaryFormSwitchHandleContrast:"#f4f4f4",colorSecondaryAltSurfaceAmbientDefault:"#004481",colorSecondaryAltSurfaceAmbientPressed:"#043263",colorSecondaryAltSurfaceAmbientPreloading:"#043263",colorSecondaryAltSurfaceAmbientOverlay:"#043263",colorSecondaryAltSurfaceAlternativeDefault:"#043263",colorSecondaryAltSurfaceAlternativePressed:"#004481",colorSecondaryAltSurfaceAlternativePreloading:"#004481",colorSecondaryAltSurfaceContrastDefault:"#ffffff",colorSecondaryAltSurfaceContrastPressed:"#e9e9e9",colorSecondaryAltSurfaceSuccessDefault:"#d9efe0",colorSecondaryAltSurfaceSuccessPreloading:"#ffffff",colorSecondaryAltSurfaceWarningDefault:"#fef5dc",colorSecondaryAltSurfaceWarningPreloading:"#ffffff",colorSecondaryAltSurfaceInfoDefault:"#d4edfc",colorSecondaryAltSurfaceInfoPreloading:"#ffffff",colorSecondaryAltSurfaceErrorDefault:"#fcdfdf",colorSecondaryAltSurfaceErrorPreloading:"#ffffff",colorSecondaryAltSurfaceSustainabilityDefault:"#eaf9fa",colorSecondaryAltSurfaceSustainabilityPreloading:"#ffffff",colorSecondaryAltSupportInfoDefault:"#d4edfc",colorSecondaryAltSupportSuccessDefault:"#d9efe0",colorSecondaryAltSupportWarningDefault:"#fef5dc",colorSecondaryAltSupportErrorDefault:"#fcdfdf",colorSecondaryAltSupportPendingDefault:"#f4f4f4",colorSecondaryAltSupportSustainabilityDefault:"#eaf9fa",colorSecondaryAltBadgeInfoBackground:"#ffffff",colorSecondaryAltBadgeInfoText:"#004481",colorSecondaryAltBadgeSuccessBackground:"#ffffff",colorSecondaryAltBadgeSuccessText:"#277a3e",colorSecondaryAltBadgeWarningBackground:"#ffffff",colorSecondaryAltBadgeWarningText:"#685219",colorSecondaryAltBadgeErrorBackground:"#ffffff",colorSecondaryAltBadgeErrorText:"#b92a45",colorSecondaryAltBadgeOffBackground:"#ffffff",colorSecondaryAltBadgeOffText:"#666666",colorSecondaryAltBadgeSustainabilityBackground:"#ffffff",colorSecondaryAltBadgeSustainabilityText:"#028484",colorSecondaryAltNotificationAlertBackground:"#e77d8e",colorSecondaryAltNotificationAlertText:"#121212",colorSecondaryAltNotificationInfoBackground:"#043263",colorSecondaryAltNotificationInfoText:"#ffffff",colorSecondaryAltTextUncovered:"#e77d8e",colorSecondaryAltTextIncome:"#d4edfc",colorSecondaryAltText01Default:"#ffffff",colorSecondaryAltText01Inverse:"#121212",colorSecondaryAltText02Default:"#f4f4f4",colorSecondaryAltText02Inverse:"#666666",colorSecondaryAltFormatDivider:"#d3d3d3",colorSecondaryAltFormatBullet:"#2dcccd",colorSecondaryAltRatingStars:"#5bbeff",colorSecondaryAltCategoriesExpectedExpenses:"#5bbeff",colorSecondaryAltCategoriesExpectedIncome:"#f3ebd5",colorSecondaryAltCategoriesTransportation:"#d8be75",colorSecondaryAltCategoriesOtherIncomes:"#d8be75",colorSecondaryAltCategoriesLeisure:"#f8cd51",colorSecondaryAltCategoriesHome:"#fab27f",colorSecondaryAltCategoriesFinancing:"#f7893b",colorSecondaryAltCategoriesPublicAdministration:"#e77d8e",colorSecondaryAltCategoriesEducation:"#f35e61",colorSecondaryAltCategoriesHealthBeauty:"#da3851",colorSecondaryAltCategoriesSalariesRentsSubsidies:"#fab3f0",colorSecondaryAltCategoriesTravel:"#f78be8",colorSecondaryAltCategoriesSaving:"#f78be8",colorSecondaryAltCategoriesInvestment:"#b6a8ee",colorSecondaryAltCategoriesShopping:"#8f7ae5",colorSecondaryAltCategoriesNgoAssociations:"#b6a8ee",colorSecondaryAltCategoriesSustainability:"#5ac4c4",colorSecondaryAltCategoriesCashFinancialServices:"#2dcccd",colorSecondaryAltCategoriesCashTransfersChecks:"#2dcccd",colorSecondaryAltCategoriesCollectionInvoicesRemittances:"#88ca9a",colorSecondaryAltCategoriesOthers:"#f4f4f4",colorSecondaryAltCategoriesPoints:"#2dcccd",colorSecondaryAltCategoriesOfferDiscountRefound:"#fab3f0",colorSecondaryAltCategoriesFinancingSkipPayments:"#d8be75",colorSecondaryAltCategoriesCombinedPromotions:"#b6a8ee",colorSecondaryAltProcessPending:"#f4f4f4",colorSecondaryAltProcessInProgress:"#2dcccd",colorSecondaryAltProcessAlert:"#e77d8e",colorSecondaryAltProcessWarning:"#f8cd51",colorSecondaryAltProcessCompleted:"#48ae64",colorSecondaryAltRiskLevelOne:"#f35e61",colorSecondaryAltRiskLevelTwo:"#f7893b",colorSecondaryAltRiskLevelThree:"#f8cd51",colorSecondaryAltRiskLevelFour:"#88ca9a",colorSecondaryAltRiskLevelFive:"#48ae64",colorSecondaryAltDataAxis01:"#d3d3d3",colorSecondaryAltDataAxis02:"#f4f4f4",colorSecondaryAltLocationsUser:"#f35e61",colorSecondaryAltLocationsPinsIcon:"#ffffff",colorSecondaryAltLocationsPinsBackgroundDefault:"#ffffff",colorSecondaryAltLocationsPinsBackgroundPressed:"#f4f4f4",colorSecondaryAltLocationsPinsBackgroundSelected:"#004481",colorSecondaryAltLocationsPinsBackgroundSelectedPressed:"#043263",colorSecondaryAltLocationsPinsTextDefault:"#121212",colorSecondaryAltLocationsPinsTextPressed:"#666666",colorSecondaryAltLocationsPinsTextSelected:"#ffffff",colorSecondaryAltLocationsPinsTextSelectedPressed:"#d4edfc",colorSecondaryAltEmergentMainText:"#121212",colorSecondaryAltEmergentMainBackgroundDefault:"#ffffff",colorSecondaryAltEmergentMainBackgroundPressed:"#d4edfc",colorSecondaryAltEmergentMainLinkDefault:"#1464a5",colorSecondaryAltEmergentMainLinkPressed:"#004481",colorSecondaryAltCtaMainBackgroundDefault:"#ffffff",colorSecondaryAltCtaMainBackgroundPressed:"#d4edfc",colorSecondaryAltCtaMainTextDefault:"#1464a5",colorSecondaryAltCtaMainTextPressed:"#1464a5",colorSecondaryAltCtaMainTextPreloading:"#e9e9e9",colorSecondaryAltCtaComplementaryBackgroundPressed:"#ffffff",colorSecondaryAltCtaComplementaryTextDefault:"#ffffff",colorSecondaryAltCtaComplementaryTextPressed:"#1464a5",colorSecondaryAltCtaComplementaryBorderDefault:"#ffffff",colorSecondaryAltCtaPositiveBackgroundDefault:"#02a5a5",colorSecondaryAltCtaPositiveBackgroundPressed:"#028484",colorSecondaryAltCtaPositiveTextDefault:"#ffffff",colorSecondaryAltCtaPositiveTextPressed:"#ffffff",colorSecondaryAltCtaNegativeBackgroundDefault:"#b92a45",colorSecondaryAltCtaNegativeBackgroundPressed:"#c0475e",colorSecondaryAltCtaNegativeTextDefault:"#ffffff",colorSecondaryAltCtaNegativeTextPressed:"#ffffff",colorSecondaryAltCtaNegativeTextPreloading:"#c0475e",colorSecondaryAltCtaDisabledBackground:"#072146",colorSecondaryAltCtaDisabledText:"#004481",colorSecondaryAltCtaMultistepBackgroundDefault:"#1464a5",colorSecondaryAltCtaMultistepBackgroundPressed:"#004481",colorSecondaryAltCtaMultistepTextDefault:"#ffffff",colorSecondaryAltCtaMultistepTextPressed:"#ffffff",colorSecondaryAltSelectionInteraction01BackgroundSelected:"#ffffff",colorSecondaryAltSelectionInteraction01BackgroundSelectedPressed:"#f4f4f4",colorSecondaryAltSelectionInteraction01TextSelected:"#000000",colorSecondaryAltSelectionInteraction01TextSelectedPressed:"#666666",colorSecondaryAltSelectionInteraction02Selected:"#5bbeff",colorSecondaryAltSelectionInteraction02SelectedPressed:"#49a5e6",colorSecondaryAltLinkMainDefault:"#5bbeff",colorSecondaryAltLinkMainPressed:"#49a5e6",colorSecondaryAltLinkComplementaryDefault:"#ffffff",colorSecondaryAltLinkComplementaryPressed:"#d4edfc",colorSecondaryAltLinkHighlightDefault:"#f8cd51",colorSecondaryAltLinkHighlightPressed:"#ffffff",colorSecondaryAltLinkNegativeDefault:"#fcdfdf",colorSecondaryAltLinkNegativePressed:"#f59799",colorSecondaryAltLinkInverseDefault:"#ffffff",colorSecondaryAltLinkInversePressed:"#d4edfc",colorSecondaryAltLinkImageDefault:"#ffffff",colorSecondaryAltLinkImagePressed:"#d4edfc",colorSecondaryAltFormInputBackgroundDefault:"#043263",colorSecondaryAltFormInputBackgroundError:"#fcdfdf",colorSecondaryAltFormInputPlaceholderDefault:"#f4f4f4",colorSecondaryAltFormInputPlaceholderError:"#b92a45",colorSecondaryAltFormInputFieldTextDefault:"#ffffff",colorSecondaryAltFormInputFieldTextError:"#121212",colorSecondaryAltFormInputHintTextDefault:"#f4f4f4",colorSecondaryAltFormInputHintTextError:"#666666",colorSecondaryAltFormInputIconDefault:"#5bbeff",colorSecondaryAltFormInputIconReadOnly:"#f4f4f4",colorSecondaryAltFormInputIconError:"#b92a45",colorSecondaryAltFormInputAddIconDefault:"#5bbeff",colorSecondaryAltFormInputAddIconError:"#1464a5",colorSecondaryAltFormInputBorderInactive:"#f4f4f4",colorSecondaryAltFormInputBorderActive:"#ffffff",colorSecondaryAltFormInputBorderError:"#d44b50",colorSecondaryAltFormSelectorBackgroundDefault:"#043263",colorSecondaryAltFormSelectorBackgroundAlternative:"#004481",colorSecondaryAltFormSelectorBackgroundError:"#fcdfdf",colorSecondaryAltFormSelectorBackgroundContrast:"#f4f4f4",colorSecondaryAltFormSelectorBorderDefault:"#f4f4f4",colorSecondaryAltFormSelectorBorderError:"#d44b50",colorSecondaryAltFormSelectorBorderContrast:"#666666",colorSecondaryAltFormSelectorCheckDefault:"#ffffff",colorSecondaryAltFormSelectorCheckReadOnly:"#f4f4f4",colorSecondaryAltFormSelectorCheckContrast:"#004481",colorSecondaryAltFormSwitchBackgroundOn:"#ffffff",colorSecondaryAltFormSwitchBackgroundOff:"#ffffff",colorSecondaryAltFormSwitchBackgroundContrast:"#1464a5",colorSecondaryAltFormSwitchHandleOn:"#1464a5",colorSecondaryAltFormSwitchHandleOff:"#666666",colorSecondaryAltFormSwitchHandleContrast:"#f4f4f4"},V=t`
  :host {
    --_button-default-color: var(
      --bbva-button-default--_ambient--color,
      var(
        --bbva-button-default--custom--primary-ambient--color,
        ${R("colorPrimaryCtaMainTextDefault",z)}
      )
    );
    --_button-default-border-color: var(
      --bbva-button-default--_ambient--border-color,
      var(
        --bbva-button-default--custom--primary-ambient--border-color,
        ${R("colorPrimaryCtaComplementaryBorderDefault",z)}
      )
    );
    --_button-default-bg-color: var(
      --bbva-button-default--_ambient--bg-color,
      var(
        --bbva-button-default--custom--primary-ambient--bg-color,
        ${R("colorPrimaryCtaMainBackgroundDefault",z)}
      )
    );
    --_button-default-color-active: var(
      --bbva-button-default--_ambient--color-active,
      var(
        --bbva-button-default--custom--primary-ambient--color-active,
        ${R("colorPrimaryCtaMainTextDefault",z)}
      )
    );
    --_button-default-bg-color-active: var(
      --bbva-button-default--_ambient--bg-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--bg-color-active,
        ${R("colorPrimaryCtaMainBackgroundPressed",z)}
      )
    );
    --_button-default-bg-color-disabled: var(
      --bbva-button-default--_ambient--bg-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--bg-color-disabled,
        ${R("colorPrimaryCtaDisabledBackground",z)}
      )
    );
    --_button-default-color-disabled: var(
      --bbva-button-default--_ambient--color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--color-disabled,
        ${R("colorPrimaryCtaDisabledText",z)}
      )
    );
    /* Secondary styles */
    --_button-default-secondary-color: var(
      --bbva-button-default--_ambient--secondary-color,
      var(
        --bbva-button-default--custom--primary-ambient--secondary-color,
        ${R("colorPrimaryCtaComplementaryTextDefault",z)}
      )
    );
    --_button-default-secondary-bg-color: var(
      --bbva-button-default--_ambient--secondary-bg-color,
      var(
        --bbva-button-default--custom--primary-ambient--secondary-bg-color,
        ${R("colorPrimaryCtaComplementaryBackgroundDefault",z)}
      )
    );
    --_button-default-secondary-border-color: var(
      --bbva-button-default--_ambient--secondary-border-color,
      var(
        --bbva-button-default--custom--primary-ambient--secondary-border-color,
        ${R("colorPrimaryCtaComplementaryBorderDefault",z)}
      )
    );
    --_button-default-secondary-color-active: var(
      --bbva-button-default--_ambient--secondary-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--secondary-color-active,
        ${R("colorPrimaryCtaComplementaryTextPressed",z)}
      )
    );
    --_button-default-secondary-bg-color-active: var(
      --bbva-button-default--_ambient--secondary-bg-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--secondary-bg-color-active,
        ${R("colorPrimaryCtaComplementaryBackgroundPressed",z)}
      )
    );
    --_button-default-secondary-color-disabled: var(
      --bbva-button-default--_ambient--secondary-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--secondary-color-disabled,
        ${R("colorPrimaryCtaDisabledText",z)}
      )
    );
    --_button-default-secondary-bg-color-disabled: var(
      --bbva-button-default--_ambient--secondary-bg-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--bg-color-disabled,
        ${R("colorPrimaryCtaDisabledBackground",z)}
      )
    );
    --_button-default-secondary-border-color-disabled: var(
      --bbva-button-default--_ambient--secondary-border-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--secondary-border-color-disabled,
        ${R("colorPrimaryCtaDisabledBackground",z)}
      )
    );
    /* link styles */
    --_button-default-link-color: var(
      --bbva-button-default--_ambient--link-color,
      var(
        --bbva-button-default--custom--primary-ambient--link-color,
        ${R("colorPrimaryLinkMainDefault",z)}
      )
    );
    --_button-default-link-color-active: var(
      --bbva-button-default--_ambient--link-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--link-color-active,
        ${R("colorPrimaryLinkMainPressed",z)}
      )
    );
    --_button-default-link-bg-color-active: var(
      --bbva-button-default--_ambient--link-bg-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--link-bg-color-active,
        ${R("colorPrimaryLinkMainBackgroundPressed",z)}
      )
    );
    --_button-default-link-color-disabled: var(
      --bbva-button-default--_ambient--link-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--link-color-disabled,
        ${R("colorPrimaryLinkMainDefault",z)}
      )
    );
    --_button-default-positive-color: var(
      --bbva-button-default--_ambient--positive-color,
      var(
        --bbva-button-default--custom--primary-ambient--positive-color,
        ${R("colorPrimaryCtaPositiveTextDefault",z)}
      )
    );
    --_button-default-positive-bg-color: var(
      --bbva-button-default--_ambient--positive-bg-color,
      var(
        --bbva-button-default--custom--primary-ambient--positive-bg-color,
        ${R("colorPrimaryCtaPositiveBackgroundDefault",z)}
      )
    );
    --_button-default-positive-color-active: var(
      --bbva-button-default--_ambient--positive-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--positive-color-active,
        ${R("colorPrimaryCtaPositiveTextPressed",z)}
      )
    );
    --_button-default-positive-bg-color-active: var(
      --bbva-button-default--_ambient--positive-bg-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--positive-bg-color-active,
        ${R("colorPrimaryCtaPositiveBackgroundPressed",z)}
      )
    );
    --_button-default-positive-color-disabled: var(
      --bbva-button-default--_ambient--positive-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--positive-color-disabled,
        ${R("colorPrimaryCtaDisabledText",z)}
      )
    );
    --_button-default-positive-bg-color-disabled: var(
      --bbva-button-default--_ambient--positive-bg-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--positive-bg-color-disabled,
        ${R("colorPrimaryCtaDisabledBackground",z)}
      )
    );
    /* Alert styles */
    --_button-default-alert-secondary-color: var(
      --bbva-button-default--_ambient--alert-secondary-color,
      var(
        --bbva-button-default--custom--primary-ambient--alert-secondary-color,
        ${R("colorPrimaryCtaComplementaryTextDefault",z)}
      )
    );
    --_button-default-alert-secondary-bg-color: var(
      --bbva-button-default--_ambient--alert-secondary-bg-color,
      var(
        --bbva-button-default--custom--primary-ambient--alert-secondary-bg-color,
        ${R("colorPrimaryCtaComplementaryBackgroundDefault",z)}
      )
    );
    --_button-default-alert-secondary-border-color: var(
      --bbva-button-default--_ambient--alert-secondary-border-color,
      var(
        --bbva-button-default--custom--primary-ambient--alert-secondary-border-color,
        ${R("colorPrimaryCtaComplementaryBorderDefault",z)}
      )
    );
    --_button-default-alert-secondary-color-active: var(
      --bbva-button-default--_ambient--alert-secondary-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--alert-secondary-color-active,
        ${R("colorPrimaryCtaComplementaryTextPressed",z)}
      )
    );
    --_button-default-alert-secondary-bg-color-active: var(
      --bbva-button-default--_ambient--alert-secondary-bg-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--alert-secondary-bg-color-active,
        ${R("colorPrimaryCtaComplementaryBackgroundPressed",z)}
      )
    );
    --_button-default-alert-secondary-color-disabled: var(
      --bbva-button-default--_ambient--alert-secondary-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--alert-secondary-color-disabled,
        ${R("colorPrimaryCtaDisabledText",z)}
      )
    );
    --_button-default-alert-secondary-bg-color-disabled: var(
      --bbva-button-default--_ambient--alert-secondary-bg-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--bg-color-disabled,
        ${R("colorPrimaryCtaDisabledBackground",z)}
      )
    );
    --_button-default-alert-secondary-border-color-disabled: var(
      --bbva-button-default--_ambient--alert-secondary-border-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--secondary-border-color-disabled,
        ${R("colorPrimaryCtaDisabledBackground",z)}
      )
    );
    /* Icon */
    --_button-default-icon-background: var(
      --bbva-button-default--_ambient--icon-background,
      var(
        --bbva-button-default--custom--primary-ambient--icon-background,
        ${R("colorPrimaryCtaMainBackgroundDefault",z)}
      )
    );
    --_button-default-icon-color: var(
      --bbva-button-default--_ambient--icon-color,
      var(
        --bbva-button-default--custom--primary-ambient--icon-color,
        ${R("colorPrimaryCtaMainTextDefault",z)}
      )
    );
    --_button-default-icon-background-disabled: var(
      --bbva-button-default--_ambient--icon-background-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--icon-background-disabled,
        ${R("colorPrimaryCtaDisabledBackground",z)}
      )
    );
    --_button-default-icon-color-disabled: var(
      --bbva-button-default--_ambient--icon-color-disabled,
      var(
        --bbva-button-default--custom--primary-ambient--icon-color-disabled,
        ${R("colorPrimaryCtaDisabledText",z)}
      )
    );
    --_button-default-icon-background-active: var(
      --bbva-button-default--_ambient--icon-background-active,
      var(
        --bbva-button-default--custom--primary-ambient--icon-background-active,
        ${R("colorPrimaryCtaMainBackgroundPressed",z)}
      )
    );
    --_button-default-icon-color-active: var(
      --bbva-button-default--_ambient--icon-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--icon-color-active,
        ${R("colorPrimaryCtaMainTextPressed",z)}
      )
    );
    /* Interactive styles */
    --_button-default-interaction-bg-color: var(
      --bbva-button-default--_ambient--interaction-bg-color,
      var(
        --bbva-button-default--custom--primary-ambient--interaction-bg-color,
        ${R("colorPrimaryCtaMainBackgroundDefault",z)}
      )
    );
    --_button-default-interaction-icon-color: var(
      --bbva-button-default--_ambient--interaction-icon-color,
      var(
        --bbva-button-default--custom--primary-ambient--interaction-icon-color,
        ${R("colorPrimaryCtaMainTextDefault",z)}
      )
    );
    --_button-default-interaction-border-color: var(
      --bbva-button-default--_ambient--interaction-border-color,
      var(--bbva-button-default--custom--primary-ambient--interaction-border-color, transparent)
    );
    --_button-default-interaction-bg-color-active: var(
      --bbva-button-default--_ambient--interaction-bg-color-active,
      var(
        --bbva-button-default--custom--primary-ambient--interaction-bg-color-active,
        ${R("colorPrimaryCtaMainBackgroundPressed",z)}
      )
    );
    --_button-default-interaction-disabled-bg-color: var(
      --bbva-button-default--_ambient--interaction-disabled-bg-color,
      var(
        --bbva-button-default--custom--primary-ambient--interaction-disabled-bg-color,
        ${R("colorPrimaryCtaDisabledBackground",z)}
      )
    );
  }
`;const G=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-button-default--_ambient--color: initial;
    --bbva-button-default--_ambient--border-color: initial;
    --bbva-button-default--_ambient--bg-color: initial;
    --bbva-button-default--_ambient--color-active: initial;
    --bbva-button-default--_ambient--bg-color-active: initial;
    --bbva-button-default--_ambient--bg-color-disabled: initial;
    --bbva-button-default--_ambient--bg-color-disabled: initial;
    --bbva-button-default--_ambient--color-disabled: initial;
    --bbva-button-default--_ambient--secondary-color: initial;
    --bbva-button-default--_ambient--secondary-border-color: initial;
    --bbva-button-default--_ambient--secondary-color-active: initial;
    --bbva-button-default--_ambient--secondary-bg-color-active: initial;
    --bbva-button-default--_ambient--secondary-color-disabled: initial;
    --bbva-button-default--_ambient--secondary-bg-color-disabled: initial;
    --bbva-button-default--_ambient--secondary-border-color-disabled: initial;
    --bbva-button-default--_ambient--link-color: initial;
    --bbva-button-default--_ambient--link-bg-color: initial;
    --bbva-button-default--_ambient--link-color-active: initial;
    --bbva-button-default--_ambient--link-bg-color-active: initial;
    --bbva-button-default--_ambient--link-color-disabled: initial;
    --bbva-button-default--_ambient--positive-color: initial;
    --bbva-button-default--_ambient--positive-bg-color: initial;
    --bbva-button-default--_ambient--positive-color-active: initial;
    --bbva-button-default--_ambient--positive-bg-color-active: initial;
    --bbva-button-default--_ambient--positive-color-disabled: initial;
    --bbva-button-default--_ambient--positive-bg-color-disabled: initial;
    --bbva-button-default--_ambient--alert-secondary-color: initial;
    --bbva-button-default--_ambient--alert-secondary-bg-color: initial;
    --bbva-button-default--_ambient--alert-secondary-border-color: initial;
    --bbva-button-default--_ambient--alert-secondary-active-color: initial;
    --bbva-button-default--_ambient--alert-secondary-active-bg-color: initial;
    --bbva-button-default--_ambient--alert-secondary-active-border-color: initial;
    --bbva-button-default--_ambient--icon-background: initial;
    --bbva-button-default--_ambient--icon-background-active: initial;
    --bbva-button-default--_ambient--icon-background-disabled: initial;
    --bbva-button-default--_ambient--icon-color: initial;
    --bbva-button-default--_ambient--icon-color-active: initial;
    --bbva-button-default--_ambient--icon-color-disabled: initial;
    --bbva-button-default--_ambient--interaction-bg-color: initial;
    --bbva-button-default--_ambient--interaction-icon-color: initial;
    --bbva-button-default--_ambient--interaction-border-color: initial;
    --bbva-button-default--_ambient--interaction-bg-color-active: initial;
    --bbva-button-default--_ambient--interaction-disabled-bg-color: initial;
  }
`,W=t`
  /* Default styles */
  /* Static */
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--primary-alt-ambient--color,
      ${R("colorPrimaryAltCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--border-color,
      transparent
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color,
      ${R("colorPrimaryAltCtaMainBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--color-active,
      ${R("colorPrimaryAltCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-active,
      ${R("colorPrimaryAltCtaMainBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${R("colorColorPrimaryAltCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",z)}
    );
    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color,
      ${R("colorPrimaryAltCtaComplementaryTextDefault",z)}
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-border-color,
      ${R("colorPrimaryAltCtaComplementaryBorderDefault",z)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color red
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color-active,
      ${R("colorPrimaryAltCtaComplementaryBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",z)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--secondary-border-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-border-color-disabled,
      transparent
    );

    /* Link styles */
    --bbva-button-default--_ambient--link-color: var(
      --bbva-button-default--custom--primary-alt-ambient--link-color,
      ${R("colorPrimaryAltLinkMainDefault",z)}
    );

    --bbva-button-default--_ambient--link-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--link-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--link-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--link-color-active,
      ${R("colorPrimaryAltLinkMainPressed",z)}
    );

    --bbva-button-default--_ambient--link-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--link-bg-color-active,
      transparent
    );

    --bbva-button-default--_ambient--link-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--link-color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",z)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color,
      ${R("colorPrimaryAltCtaPositiveTextDefault",z)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color,
      ${R("colorPrimaryAltCtaPositiveBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color-active,
      ${R("colorPrimaryAltCtaPositiveTextPressed",z)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-active,
      ${R("colorPrimaryAltCtaPositiveBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",z)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",z)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient-alert-secondary-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-color,
      ${R("colorPrimaryAltCtaComplementaryTextDefault",z)}
    );

    --bbva-button-default--_ambient-alert-secondary-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-border-color,
      ${R("colorPrimaryAltCtaComplementaryBorderDefault",z)}
    );

    --bbva-button-default--_ambient-alert-secondary-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color red
    );

    --bbva-button-default--_ambient-alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color-active,
      ${R("colorPrimaryAltCtaComplementaryBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient-alert-secondary-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",z)}
    );

    --bbva-button-default--_ambient-alert-secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient-alert-secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",z)}
    );

    /* Icon styles */
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background,
      ${R("colorPrimaryAltCtaMainBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background-active,
      ${R("colorPrimaryAltCtaMainBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color,
      ${R("colorPrimaryAltCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-active,
      ${R("colorPrimaryAltCtaMainTextPressed",z)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",z)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color-disabled,
      ${R("colorSecondaryAltCtaDisabledText",z)}
    );

    /* Interactive */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-bg-color,
      ${R("colorPrimaryAltCtaMainBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-icon-color,
      ${R("colorPrimaryAltCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-bg-color-active,
      ${R("colorPrimaryAltCtaMainBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-disabled-bg-color,
      ${R("colorPrimaryAltCtaDisabledBackground",z)}
    );
  }
`,K=t`
  /* Default styles */
  /* Static */
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--secondary-ambient--color,
      ${R("colorSecondaryCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--border-color: var(
      --bbva-button-default--custom--secondary-ambient--border-color,
      ${R("colorPrimaryCtaComplementaryBorderDefault",z)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--secondary-ambient--bg-color,
      ${R("colorSecondaryCtaMainBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--secondary-ambient--color-active,
      ${R("colorSecondaryCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--bg-color-active,
      ${R("colorSecondaryCtaMainBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--bg-color-disabled,
      ${R("colorSecondaryCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--color-disabled,
      ${R("colorSecondaryCtaDisabledText",z)}
    );
    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-color,
      ${R("colorSecondaryCtaComplementaryTextDefault",z)}
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-border-color,
      ${R("colorSecondaryCtaComplementaryBorderDefault",z)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color-active,
      ${R("colorSecondaryCtaComplementaryBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-color-disabled,
      ${R("colorSecondaryCtaDisabledText",z)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color-disabled,
      ${R("colorSecondaryCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--secondary-border-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-border-color-disabled,
      transparent
    );

    /* Link styles */
    --bbva-button-default--_ambient--link-color: var(
      --bbva-button-default--custom--secondary-ambient--link-color,
      ${R("colorSecondaryLinkMainDefault",z)}
    );

    --bbva-button-default--_ambient--link-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--link-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--link-color-active: var(
      --bbva-button-default--custom--secondary-ambient--link-color-active,
      ${R("colorSecondaryLinkMainPressed",z)}
    );

    --bbva-button-default--_ambient--link-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--link-bg-color-active,
      transparent
    );

    --bbva-button-default--_ambient--link-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--link-color-disabled,
      ${R("colorSecondaryCtaDisabledText",z)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--secondary-ambient--positive-color,
      ${R("colorSecondaryCtaPositiveTextDefault",z)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--positive-bg-color,
      ${R("colorSecondaryCtaPositiveBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--secondary-ambient--positive-color-active,
      ${R("colorSecondaryCtaPositiveTextPressed",z)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--positive-bg-color-active,
      ${R("colorSecondaryCtaPositiveBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--positive-color-disabled,
      ${R("colorSecondaryCtaDisabledText",z)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${R("colorSecondaryCtaDisabledBackground",z)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-color,
      ${R("colorSecondaryLinkInverseDefault",z)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-bg-color,
      ${R("colorSecondarySurfaceAlternativeDefault",z)}
    );

    --bbva-button-default--_ambient--alert-secondary-active-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-active-color,
      ${R("colorSecondaryLinkInversePressed",z)}
    );

    --bbva-button-default--_ambient--alert-secondary-active-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--alert-secondary-active-bg-color,
      ${R("colorSecondarySurfaceAlternativePressed",z)}
    );

    /* Icon styles */
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--secondary-ambient--icon-background,
      ${R("colorSecondaryCtaMainBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-background-active,
      ${R("colorSecondaryCtaMainBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-color-active,
      ${R("colorSecondaryCtaMainTextPressed",z)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--secondary-ambient--icon-background-disabled,
      ${R("colorSecondaryCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-color,
      ${R("colorSecondaryCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-disabled,
      ${R("colorSecondaryCtaDisabledText",z)}
    );

    /* Interactive styles */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-bg-color,
      ${R("colorSecondaryCtaMainBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-icon-color,
      ${R("colorSecondaryCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--interaction-bg-color-active,
      ${R("colorSecondaryCtaMainBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-disabled-bg-color,
      ${R("colorSecondaryCtaDisabledBackground",z)}
    );
  }
`,X=t`
  /* Default styles */
  /* Static */
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--secondary-alt-ambient--color,
      ${R("colorSecondaryAltCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--border-color,
      transparent
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color,
      ${R("colorSecondaryAltCtaMainBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--color-active,
      ${R("colorSecondaryAltCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color-active,
      ${R("colorSecondaryAltCtaMainBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color-disabled,
      ${R("colorSecondaryAltCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--color-disabled,
      ${R("colorSecondaryAltCtaDisabledText",z)}
    );

    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color,
      ${R("colorSecondaryAltCtaComplementaryTextDefault",z)}
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-border-color,
      ${R("colorSecondaryAltCtaComplementaryBorderDefault",z)}
    );

    --bbva-button-default--_ambient--secondary-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color-active,
      ${R("colorSecondaryAltCtaComplementaryTextPressed",z)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color-active,
      ${R("colorSecondaryAltCtaComplementaryBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color-disabled,
      ${R("colorSecondaryAltCtaDisabledText",z)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color-disabled,
      ${R("colorSecondaryAltCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--secondary-border-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-border-color-disabled,
      transparent
    );

    /* Link styles */
    --bbva-button-default--_ambient--link-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--link-color,
      ${R("colorSecondaryAltLinkMainDefault",z)}
    );

    --bbva-button-default--_ambient--link-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--link-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--link-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--link-color-active,
      ${R("colorSecondaryAltLinkMainPressed",z)}
    );

    --bbva-button-default--_ambient--link-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--link-bg-color-active,
      transparent
    );

    --bbva-button-default--_ambient--link-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--link-color-disabled,
      ${R("colorSecondaryAltLinkMainDisabled",z)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color,
      ${R("colorSecondaryAltCtaPositiveTextDefault",z)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-bg-color,
      ${R("colorSecondaryCtaPositiveBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color-active,
      ${R("colorSecondaryAltCtaPositiveTextPressed",z)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-bg-color-active,
      ${R("colorSecondaryAltCtaPositiveBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color-disabled,
      ${R("colorSecondaryAltCtaDisabledText",z)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${R("colorSecondaryAltCtaDisabledBackground",z)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-color,
      ${R("colorSecondaryAltLinkInverseDefault",z)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-bg-color,
      ${R("colorSecondaryAltSurfaceAlternativeDefault",z)}
    );

    --bbva-button-default--_ambient--alert-secondary-active-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-active-color,
      ${R("colorSecondaryAltLinkInversePressed",z)}
    );

    --bbva-button-default--_ambient--alert-secondary-active-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--alert-secondary-active-bg-color,
      ${R("colorSecondaryAltSurfaceAlternativePressed",z)}
    );

    /* Icon styles*/
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background,
      ${R("colorSecondaryAltCtaMainBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background-active,
      ${R("colorSecondaryAltCtaMainBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background-disabled,
      ${R("colorSecondaryAltCtaDisabledBackground",z)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color,
      ${R("colorSecondaryAltCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color-active,
      ${R("colorSecondaryAltCtaMainTextPressed",z)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--icon-color-disabled,
      ${R("colorSecondaryAltCtaDisabledText",z)}
    );

    /* Interactive styles */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-bg-color,
      ${R("colorSecondaryAltCtaMainBackgroundDefault",z)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-icon-color,
      ${R("colorSecondaryAltCtaMainTextDefault",z)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-bg-color-active,
      ${R("colorSecondaryAltCtaMainBackgroundPressed",z)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-disabled-bg-color,
      ${R("colorSecondaryAltCtaDisabledBackground",z)}
    );
  }
`,J={primary:t`
    ${G}
    ${w.primary}
    ${I.primary}
  `,primaryAlt:t`
    ${W}
    ${w.primaryAlt}
    ${I.primaryAlt}
  `,secondary:t`
    ${K}
    ${w.secondary}
    ${I.secondary}
  `,secondaryAlt:t`
    ${X}
    ${w.secondaryAlt}
    ${I.secondaryAlt}
  `},Y=Object.values(J);var Q=t`
  :host {
    box-sizing: border-box;
    position: relative;
    min-width: var(--button-default-min-width, 8rem);
    max-width: 100%;
    height: 3rem;
    padding: calc(
        (
            (
                1.5 *
                  var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))
              ) / 15
          ) * 1em
      )
      calc(
        (
            (4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) /
              15
          ) * 1em
      );
    text-align: center;
    border-radius: var(
      --button-default-border-radius,
      var(--borderRadiusSmall, ${e(r.small)})
    );
    border: none;
    margin-left: var(--button-default-margin-left, 0);
    transition: background-color 0.15s ease-out;
    transition-timing-function: cubic-bezier(0, 0, 0.1, 1);
    color: var(--_button-default-color);
    background-color: var(--_button-default-bg-color);
  }
  :host [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-color);
  }
  :host [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-color);
  }

  :host([fullwidth]) {
    width: 100%;
  }

  .text {
    display: block;
    text-transform: capitalize;
  }
  .text.ellipsis {
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
  }

  :host([variant='alert']),
  :host([variant='alert-secondary']),
  :host([variant='alert-positive']) {
    height: 2.5rem;
  }
  :host([variant='alert']) .icon,
  :host([variant='alert-secondary']) .icon,
  :host([variant='alert-positive']) .icon {
    min-width: 1rem;
    margin-right: calc(
      (
          (1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) /
            16
        ) * 1rem
    );
  }

  :host,
  [data-tag-name='bbva-type-text'] {
    font-weight: var(
      --button-default-font-weight,
      var(
        --fontFacePrimaryMediumFontWeight,
        ${e(a.medium.fontWeight)}
      )
    );
    font-style: var(
      --button-default-font-weight,
      var(
        --fontFacePrimaryMediumFontStyle,
        ${e(a.medium.fontStyle)}
      )
    );
    text-transform: capitalize;
  }

  .wrapper {
    display: contents;
  }

  button {
    box-sizing: border-box;
    padding: 0;
  }

  .focus {
    position: absolute;
    top: 0.25rem;
    left: 0.25rem;
    right: 0.25rem;
    bottom: 0.25rem;
    border: 0.0625rem solid var(--_button-default-border-color);
    opacity: 0;
    transition: opacity 0.15s cubic-bezier(0.2, 0, 0.1, 1);
  }

  :host([focus-visible]) .focus {
    opacity: 1;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  :host(:focus) {
    outline: none;
  }

  :host(:not([href])) {
    color: var(--_button-default-color);
    border: none;
    border-radius: var(
      --button-default-border-radius,
      var(--borderRadiusSmall, ${e(r.small)})
    );
    padding: calc(
        (
            (
                1.5 *
                  var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))
              ) / 15
          ) * 1em
      )
      calc(
        (
            (4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) /
              15
          ) * 1em
      );
  }

  :host([size='L']:not([href]):not([variant='icon']):not([variant='alert'])) {
    height: 3.5rem;
  }

  :host([aria-disabled='true']) {
    color: var(--_button-default-color-disabled);
    transition: background-color 0.15s ease-in-out;
    transition-timing-function: cubic-bezier(0.2, 0, 0.1, 1);
  }
  :host([aria-disabled='true']) .text,
  :host([aria-disabled='true']) [data-tag-name='bbva-type-text'] {
    transition: color 0.15s ease-in-out;
    transition-timing-function: cubic-bezier(0.2, 0, 0.1, 1);
  }

  :host([variant='icon']:focus) {
    outline: none;
  }

  :host([variant='icon']:not([href])) {
    border: none;
    border-radius: var(
      --button-default-icon-border-radius,
      var(--borderRadiusSmall, ${e(r.small)})
    );
    background-color: var(--_button-default-icon-background);
  }
  :host([variant='icon']:not([href])) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-icon-color);
  }

  :host([variant~='icon'][variant~='no-background']) {
    --_button-default-icon-background: transparent;
    --_button-default-icon-background-active: transparent;
    --_button-default-icon-background-disabled: transparent;
    border: none;
    border-radius: 0.0625rem;
  }

  :host([variant='icon'][disabled]) {
    border: none;
    background-color: var(--_button-default-icon-background-disabled);
  }
  :host([variant='icon'][disabled]) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-icon-color-disabled);
  }

  :host([variant='icon'][focus-visible]) {
    border: none;
    border-radius: var(
      --button-default-icon-border-radius,
      var(--borderRadiusSmall, ${e(r.small)})
    );
    background-color: var(--_button-default-icon-background-active);
  }
  :host([variant='icon'][focus-visible]) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-icon-color-active);
  }

  :host([variant='icon'][active]) {
    border: none;
    border-radius: var(
      --button-default-icon-border-radius,
      var(--borderRadiusSmall, ${e(r.small)})
    );
    background-color: var(--_button-default-icon-background-active);
  }
  :host([variant='icon'][active]) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-icon-color-active);
  }

  :host(:not([href])[active]:not([aria-disabled='true'])) {
    background-color: var(--_button-default-bg-color-active);
    color: var(--_button-default-color-active);
  }

  :host(:not([href])[active]),
  :host([variant='alert']:not([href])[active]) {
    background-color: var(--_button-default-bg-color-active);
    color: var(--_button-default-color-active);
  }

  :host([active]),
  :host([variant='alert'][active]) {
    color: var(--_button-default-color-active);
    background-color: var(--_button-default-bg-color-active);
    transition: background-color 0.15s ease-in-out;
    transition-timing-function: cubic-bezier(0.2, 0, 0.1, 1);
  }

  :host([variant='secondary']) {
    color: var(--_button-default-secondary-color);
    background-color: var(--_button-default-secondary-bg-color);
    border: 0.0625rem solid var(--_button-default-secondary-border-color);
  }
  :host([variant='secondary']) [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-secondary-color);
  }
  :host([variant='secondary']) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-secondary-color);
  }

  :host([variant='alert-secondary']) {
    color: var(--_button-default-secondary-color);
    background-color: transparent;
    border: 0.0625rem solid var(--_button-default-alert-secondary-border-color);
  }
  :host([variant='alert-secondary']) [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-secondary-color);
  }
  :host([variant='alert-secondary']) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-secondary-color);
  }

  :host([variant='positive']),
  :host([variant='alert-positive']) {
    color: var(--_button-default-positive-color);
    background-color: var(--_button-default-positive-bg-color);
  }
  :host([variant='positive']) [data-tag-name='bbva-type-text'],
  :host([variant='alert-positive']) [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-positive-color);
  }
  :host([variant='positive']) [data-tag-name='bbva-type-icon'],
  :host([variant='alert-positive']) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-positive-color);
  }

  :host([variant='link']) {
    color: var(--_button-default-link-color);
    background-color: var(--_button-default-link-bg-color, transparent);
    border: none;
    padding: 0;
    min-width: max-content;
    max-width: max-content;
    height: max-content;
  }
  :host([variant='link']) [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-link-color);
  }
  :host([variant='link']) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-link-color);
  }

  :host([aria-disabled='true']),
  :host([variant='alert'][aria-disabled='true']) {
    color: var(--_button-default-color-disabled);
    background-color: var(--_button-default-bg-color-disabled);
  }
  :host([aria-disabled='true']) [data-tag-name='bbva-type-text'],
  :host([variant='alert'][aria-disabled='true']) [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-color-disabled);
  }
  :host([aria-disabled='true']) [data-tag-name='bbva-type-icon'],
  :host([variant='alert'][aria-disabled='true']) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-color-disabled);
  }

  :host([variant='link'][active]) {
    color: var(--_button-default-link-color-active);
    background-color: var(--_button-default-link-bg-color-active);
  }
  :host([variant='link'][active]) [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-link-color-active);
  }
  :host([variant='link'][active]) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-link-color-active);
  }

  :host([variant='secondary'][active]),
  :host([variant='secondary'][active]:not([aria-disabled='true'])) {
    color: var(--_button-default-secondary-color-active);
    background-color: var(--_button-default-secondary-bg-color-active);
    border: none;
  }
  :host([variant='secondary'][active]) [data-tag-name='bbva-type-text'],
  :host([variant='secondary'][active]:not([aria-disabled='true']))
    [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-secondary-color-active);
  }
  :host([variant='secondary'][active]) [data-tag-name='bbva-type-icon'],
  :host([variant='secondary'][active]:not([aria-disabled='true']))
    [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-secondary-color-active);
  }

  :host([variant='alert-secondary'][active]),
  :host([variant='alert-secondary'][active]:not([aria-disabled='true'])) {
    color: var(--_button-default-alert-secondary-color-active);
    background-color: var(--_button-default-alert-secondary-bg-color-active);
    border-color: transparent;
  }
  :host([variant='alert-secondary'][active]) [data-tag-name='bbva-type-text'],
  :host([variant='alert-secondary'][active]:not([aria-disabled='true']))
    [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-alert-secondary-color-active);
  }
  :host([variant='alert-secondary'][active]) [data-tag-name='bbva-type-icon'],
  :host([variant='alert-secondary'][active]:not([aria-disabled='true']))
    [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-alert-secondary-color-active);
  }

  :host([variant='secondary'][aria-disabled='true']),
  :host([variant='alert-secondary'][aria-disabled='true']) {
    background-color: var(--_button-default-secondary-bg-color-disabled);
    border-color: var(--_button-default-secondary-border-color-disabled);
  }

  :host([variant='positive'][active]),
  :host([variant='alert-positive'][active]),
  :host([variant='positive'][active]:not([aria-disabled='true'])),
  :host([variant='alert-positive'][active]:not([aria-disabled='true'])) {
    color: var(--_button-default-positive-color-active);
    background-color: var(--_button-default-positive-bg-color-active);
  }

  :host([variant='positive'][aria-disabled='true']),
  :host([variant='alert-positive'][aria-disabled='true']) {
    color: var(--_button-default-positive-color-disabled);
    background-color: var(--_button-default-positive-bg-color-disabled);
  }

  :host([variant='link'][active]:not([aria-disabled='true'])) {
    color: var(--_button-default-link-color-active);
    background-color: var(--_button-default-link-bg-color-active);
  }
  :host([variant='link'][active]:not([aria-disabled='true'])) [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-link-color-active);
  }
  :host([variant='link'][active]:not([aria-disabled='true'])) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-link-color-active);
  }

  :host([variant='link'][aria-disabled='true']) {
    background-color: transparent;
    color: var(--_button-default-link-color-disabled);
    opacity: 0.4;
  }
  :host([variant='link'][aria-disabled='true']) [data-tag-name='bbva-type-text'] {
    color: var(--_button-default-link-color-disabled);
  }
  :host([variant='link'][aria-disabled='true']) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-link-color-disabled);
  }

  :host([variant~='icon'][variant~='no-background']:not([href])) {
    background: transparent;
  }
  :host([variant~='icon'][variant~='no-background']:not([href])) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-link-color);
  }

  :host([variant='icon']:not([href])[disabled]) {
    border: none;
    background-color: var(--_button-default-icon-background-disabled);
  }
  :host([variant='icon']:not([href])[disabled]) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-icon-color-disabled);
  }

  :host([variant~='icon']) {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    box-sizing: border-box;
    max-width: var(--button-default-min-width, 3rem);
    min-width: var(--button-default-min-width, 3rem);
    padding: calc(
      (
          (1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) /
            16
        ) * 1em
    );
  }

  :host([variant='icon']:not([href])[active]),
  :host([variant='icon']:not([href])[active]:not([disabled])) {
    border: none;
    border-radius: var(
      --button-default-icon-border-radius,
      var(--borderRadiusSmall, ${e(r.small)})
    );
    background-color: var(--_button-default-icon-background-active);
  }
  :host([variant='icon']:not([href])[active]) [data-tag-name='bbva-type-icon'],
  :host([variant='icon']:not([href])[active]:not([disabled])) [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-icon-color-active);
  }

  :host([variant='icon'][hidden]),
  [hidden] {
    display: none !important;
  }

  :host([variant~='icon'][variant~='no-background'][disabled]:not([href])[disabled]) {
    opacity: 0.4;
  }
  :host([variant~='icon'][variant~='no-background'][disabled]:not([href])[disabled])
    [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-link-color-disabled);
  }

  :host(
      [variant~='icon'][variant~='no-background'][active]:not([href])[active]:not(
          [href]
        )[active]:not([disabled])
    )
    [data-tag-name='bbva-type-icon'] {
    fill: var(--_button-default-link-color-active);
  }

  :host([variant~='interaction']) {
    padding: 0;
    right: 0;
    box-sizing: border-box;
    display: inline-flex;
    align-items: center;
    justify-content: center;
    max-width: var(--button-default-max-width, 3rem);
    min-width: var(--button-default-min-width, 3rem);
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  .sr-only {
    border: 0;
    clip: rect(0 0 0 0);
    height: 1px;
    margin: -1px;
    overflow: hidden;
    padding: 0;
    position: absolute;
    width: 1px;
  }

  .transcript {
    padding: calc(
      (
          (1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) /
            15
        ) * 1em
    );
    border: 0;
  }

  .action::before {
    content: '';
    display: block;
    position: absolute;
    left: 0;
    top: 0;
    bottom: 0;
    right: 0;
    background-color: var(--_button-default-interaction-bg-color);
  }
  :host([variant~='interaction'][talking]) .action::before {
    background-color: transparent;
  }
  .action-icon {
    position: relative;
    fill: var(--_button-default-interaction-icon-color);
  }
  :host([variant~='interaction'][disabled]) .action {
    cursor: default;
    pointer-events: none;
  }
  :host([variant~='interaction'][disabled]) .action-icon {
    color: var(--_button-default-interaction-disabled-icon-color);
  }
  :host([variant~='interaction'][disabled]) .action::before {
    background-color: var(--_button-default-interaction-disabled-bg-color);
  }
  .action-glow .before {
    display: none;
    position: absolute;
    left: 50%;
    top: 50%;
    background-color: var(--_button-default-interaction-bg-color);
    border-radius: 50%;
    width: 6rem;
    height: 6rem;
    transform: translate(-50%, -50%) scale(1);
    animation: lowerpulse 2s infinite;
    animation-play-state: paused;
    opacity: 0.4;
  }
  :host([variant~='interaction'][talking]) .action-glow .before {
    display: block;
    animation-play-state: running;
  }
  :host([variant~='interaction']:not([talking])) .action-glow .before {
    animation: animationempty;
  }
  .action-glow .after {
    display: none;
    position: absolute;
    left: 50%;
    top: 50%;
    background-color: var(--_button-default-interaction-bg-color-active);
    border-radius: 50%;
    transform: translate(-50%, -50%) scale(1);
    width: 5rem;
    height: 5rem;
    animation: upperpulse 2s infinite;
    animation-play-state: paused;
  }
  :host([variant~='interaction'][talking]) .action-glow .after {
    display: block;
    animation-play-state: running;
  }
  :host([variant~='interaction']:not([talking])) .action-glow .after {
    animation: animationempty;
  }

  /* MIC LISTENING ANIMATION */
  @keyframes lowerpulse {
    0% {
      transform: translate(-50%, -50%) scale(0);
      opacity: 0;
    }
    50% {
      transform: translate(-50%, -50%) scale(1);
      opacity: 0.4;
    }
    100% {
      transform: translate(-50%, -50%) scale(0);
      opacity: 0;
    }
  }
  @keyframes upperpulse {
    0% {
      transform: translate(-50%, -50%) scale(0.83);
    }
    50% {
      transform: translate(-50%, -50%) scale(1);
    }
    100% {
      transform: translate(-50%, -50%) scale(0.83);
    }
  }
  @keyframes animationempty {
    0%,
    100% {
      display: block;
    }
  }
`;let Z=class extends(E(i(n))){static get is(){return"bbva-button-default"}static get properties(){return{text:{type:String},icon:{type:String},buttonTranscriptLabel:{type:String,attribute:"button-transcript-label"},interaction:{type:Boolean},size:{type:String},keepTalkingAnimation:{type:Boolean,attribute:"keep-talking-animation"},iconTalkingAnimation:{type:String,attribute:"icon-talking-animation"},fullwidth:{type:Boolean,attribute:"fullwidth"},hasEllipsis:{type:Boolean,attribute:"has-ellipsis"},variant:{type:String}}}static get scopedElements(){return{"bbva-type-icon":B,"bbva-type-text":L}}constructor(){super(),this.type="button",this.buttonTranscriptLabel="bbva-button-default-interaction-record-button",this.interaction=!1,this.size="",this.keepTalkingAnimation=!1,this.iconTalkingAnimation=l(),this.fullwidth=!1,this.hasEllipsis=!1,delete this.href}static get styles(){return[super.styles,V,Q,Y,c("bbva-button-default-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._endRecord=this._endRecord.bind(this)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),document.removeEventListener("mouseup",this._endRecord)}_startRecord(){document.addEventListener("mouseup",this._endRecord),this._talking=!0,this.keepTalkingAnimation&&(this.icon=this.iconTalkingAnimation)}set _talking(t){t!==this._isTalking&&(t?(this.setAttribute("talking",""),this.dispatchEvent(new CustomEvent("button-interaction-mic-request",{detail:!0,composed:!0,bubbles:!0}))):(this.removeAttribute("talking"),this.dispatchEvent(new CustomEvent("button-interaction-mic-cancel",{detail:!0,composed:!0,bubbles:!0}))),this._isTalking=t,this.requestUpdate())}get _talking(){return this._isTalking}_keydownRecord(t){32!==t.keyCode&&13!==t.keyCode||this._startRecord()}_keyupRecord(t){32!==t.keyCode&&13!==t.keyCode||this._endRecord()}_endRecord(){document.removeEventListener("mouseup",this._endRecord);this._isTalkingAnimation||!this.keepTalkingAnimation?(this._talking=!1,this._isTalkingAnimation=!1,this.icon=s()):this._isTalkingAnimation=!0}get _icon(){return d`
      <bbva-type-icon
        class="icon"
        icon="${this.variant.includes("alert")?b():this.icon}"
        size="${this.variant.includes("alert")?16:24}"
      ></bbva-type-icon>
    `}get _text(){return void 0!==this.text?d`
          <bbva-type-text
            class="text"
            tag="span"
            size="S"
            .text=${this.text}
            ?ellipsis="${this.hasEllipsis}"
            alignment="center"
          ></bbva-type-text>
        `:d` <slot class="text ${this.hasEllipsis?"ellipsis":""}"></slot> `}get _interaction(){return d`
      <button
        class="action transcript"
        @mousedown="${this._startRecord}"
        @keydown="${this._keydownRecord}"
        @keyup="${this._keyupRecord}"
        @blur="${this._endRecord}"
      >
        <span id="action-container" class="action-glow">
          <span class="before"></span><span class="after"></span>
        </span>
        <span class="sr-only">${this.t(this.buttonTranscriptLabel)}</span>
        <bbva-type-icon class="action-icon" .icon="${this.icon}" size="24"></bbva-type-icon>
      </button>
    `}get _buttonDefault(){var t;const e=void 0!==this.icon||null!==(t=this.variant)&&void 0!==t&&t.includes("alert")?this._icon:u;return this.interaction?d`${this._interaction}`:d`${e}${this._text}${this._action}`}render(){return d`
      <div onclick="void(0)" class="wrapper ${this.fullwidth?"fullwidth":""}">
        <span class="focus"></span>
        ${this._buttonDefault}
      </div>
    `}},tt=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),o=a.length>>>0;if(0===o)return!1;let r=0|e,i=Math.max(r>=0?r:o-Math.abs(r),0);for(;i<o;){if((n=a[i])===(l=t)||"number"==typeof n&&"number"==typeof l&&isNaN(n)&&isNaN(l))return!0;i++}var n,l;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var a=[],o=0,r="",i=0,n=arguments.length;i!==n;++i){var l=+arguments[i];if(!(l<1114111&&l>>>0===l))throw RangeError("Invalid code point: "+l);l<=65535?o=a.push(l):(l-=65536,o=a.push(55296+(l>>10),l%1024+56320)),o>=16383&&(r+=t.apply(null,a),a.length=0)}return r+t.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",a=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${a&&a.message}`)}},et=class extends tt{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}};const at=0,ot=1,rt="jwt",it="tsec",nt="none";let lt=class extends tt{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=at,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new et,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=it:this.requiredToken=nt,this.requiresJWT=!1):this.requiredToken===it?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===rt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===nt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(it)}_setJwtHandler(){this._setTokenHandler(rt)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((a,o)=>{e=Object.assign(e,{resolve:a,reject:o}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let a=this._getRequestHeaders();Object.keys(a).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,a[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=f),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let a=t.replace(/[\{\}]+/g,""),o=e[a];return o?delete e[a]:this._error(9,`Missing ${a} param value`),o})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(e);a.length&&(t=[t,a.map((t=>{let a=e[t];return Array.isArray(a)&&this.paramArrayMode===ot?this._arrayToQueryParam(t,a):`${t}=${a}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(it,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(rt,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var o=e.getItem(a);o&&"null"!==o&&(t[a]=o)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const a=window.sessionStorage;e=Object.keys(a).filter((e=>e.startsWith(t))).reduce(((e,o)=>(e[o.replace(t,"")]=a.getItem(o),e)),{})}return e}_getTokenForRequestHeaders(t,e){const a=`${t}Handler`,o=t===rt?"JWT ":"",r=t===rt?"Authorization":it;if(void 0===this[a]||null===this[a])this._error(11,`${t} handler is undefined`);else{const i=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let n=this[a].getItem(i);n?e[r]=e[r]||o+n:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((a=>{e.push(`${a}=${t[a]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let a;const o=new Promise(((t,e)=>{a=(a,o)=>{a?e(a):t(o)}}));return e.addEventListener("loadend",(function t(o){e.removeEventListener("loadend",t),o.error?a(o.error):a(null,e.result)})),e.readAsText(t),o}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let a=0;for(;a<t.length;){let o=t[a],r=0,i=0;if(o<=127?(r=0,i=255&o):o<=223?(r=1,i=31&o):o<=239?(r=2,i=15&o):o<=244&&(r=3,i=7&o),t.length-a-r>0){let e=0;for(;e<r;)o=t[a+e+1],i=i<<6|63&o,e+=1}else i=65533,r=t.length-a;e+=String.fromCodePoint(i),a+=r+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},a=t.trim().split(/[\r\n]+/);for(const t in a)if(a.hasOwnProperty(t)&&""!==a[t]){let o=": ",r=a[t].split(o);e[r.shift().toLowerCase()]=r.join(o)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,a,o){let r=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(o)>=0&&(r=e.getResponseHeader(o));break;case this._NATIVE_XHR:e&&e.headers&&(r=JSON.parse(e.headers)[o])}if(r){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;t.getItem(e)!==r&&(t.setItem(e,r),this._emitTokenUpdate(a,r))}}_emitTokenUpdate(t,e){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,a,o,r,i;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),a=t.getResponseHeader("AuthenticationData"),o=t.getResponseHeader("AuthenticationState"),r=t.getResponseHeader("AuthenticationChallenge"),i=t.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(t.headers);e=n.authenticationtype,a=n.authenticationdata||null,o=n.authenticationstate,r=n.authenticationchallenge,i=n.authenticationresponse}return{type:e,data:a,state:o,challenge:r,response:i}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",a=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const o=this._getSignatureData(t,e,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:o}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",a="",o=""){let r;if("object"==typeof t&&t){const i=this._getSignatureData(t.signatureType,e,a);r=this._makeKeyValuePairFromObject(i,t.signatureValue),t.challenge&&(r+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(r,t.signatureType,o)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(r=`password=${t}`,this._buildSignatureHeaders(r,"2",o)):(r=`${a}=${t}`,this._buildSignatureHeaders(r,e,o)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let a,o=t.split(",");if(o.length>1){a=o.map((t=>`${t}=${e[t]}`)).join(",")}else a=`${t}=${e}`;return a}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),o=this._extractResponseErrorCode(e),r=this._ERROR_CODES.SIGNATURE_INVALID.includes(o),{type:i,data:n,state:l,challenge:c,response:s}=this._extractSignatureResponseHeaders(t),d=this._getRequestMetadata(t);if(r)this._notifySignatureInvalid(d),a=!0;else if(i)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(o)?(this._notifySignatureTypeUsingErrorCode(o,d,i,n,l,c,s),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,i,n,l,c,s),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),o=this._extractResponseErrorCode(e),r=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(o),i=this._getRequestMetadata(t);r&&(this._notifyWaitingForProcessResponse(i),a=!0)}return a}_notifySignatureRequiredFirstStep(t,e,a,o){this._defineSignatureType(e,a),this._defineSignatureValue(e,a,o),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:a,metadata:t}}))}_notifySignatureRequired(t,e,a,o,r,i){this._defineSignatureValue(e,a,o);const n={type:e,data:a,challenge:r,metadata:t};i&&(n.response=i),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:a}=t;return{path:this._path,method:this.method,url:e,status:a}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",a=""){const o=e.split(";").findIndex((e=>e===t));return a?a.split(";")[o]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,a,o,r,i){o?this._notifySignatureRequired(t,e,a,o,r,i):this._notifySignatureRequiredFirstStep(t,e,a,o)}_notifySignatureTypeUsingErrorCode(t,e,a,o,r,i,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,a,o,r):this._notifySignatureRequired(e,a,o,r,i,n)}},ct=class extends lt{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}};class st extends ct{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`customer-services/v${this.version}/payroll-portabilities`)}toString(){return super.toString("BGADPCustomerServicesPayrollPortabilitiesGetV0")}}class dt extends(m(v)){constructor(){super(),this.native=!1,this.requiredToken="tsec"}_getService(t,e,a){const o=this._getServiceParams(a,e);return delete o.paramArrayMode,this._getServicePath(t,this.constructor._getBgadp(o))}static _responseMapping(t){return t}}class bt extends dt{static get is(){return"bbva-local-customer-services-payroll-portabilities-api-dm"}constructor(){super(),this.native=!1,this.requiredToken="tsec"}getPayrollPortabilities(t){this._generateGetService(this._getService("getCustomerServicesPayrollPortabilities",{},t),{customEvent:"customer-services-payroll-portabilites-successful",errorFireEventHandler:"customer-services-payroll-portabilites-error"},this.constructor._responseMapping)}static _getBgadp(t){return{getCustomerServicesPayrollPortabilitiesV0:()=>new st(t),default:()=>"BGADP called not exist"}}}class ut{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),o=a.length>>>0;if(0===o)return!1;let r=0|e,i=Math.max(r>=0?r:o-Math.abs(r),0);for(;i<o;){if((n=a[i])===(l=t)||"number"==typeof n&&"number"==typeof l&&isNaN(n)&&isNaN(l))return!0;i++}var n,l;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var a=[],o=0,r="",i=0,n=arguments.length;i!==n;++i){var l=+arguments[i];if(!(l<1114111&&l>>>0===l))throw RangeError("Invalid code point: "+l);l<=65535?o=a.push(l):(l-=65536,o=a.push(55296+(l>>10),l%1024+56320)),o>=16383&&(r+=t.apply(null,a),a.length=0)}return r+t.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",a=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${a&&a.message}`)}}class ft extends ut{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const mt="jwt",vt="tsec",ht="none";class yt extends ut{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assingSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ft,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assingSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=vt:this.requiredToken=ht,this.requiresJWT=!1):this.requiredToken===vt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===mt?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===ht?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(vt)}_setJwtHandler(){this._setTokenHandler(mt)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((a,o)=>{e=Object.assign(e,{resolve:a,reject:o}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let a=this._getRequestHeaders();Object.keys(a).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,a[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e(t,this._buildBody(),this._getRequestHeaders(),this._onRequestSuccess.bind(this),this._onRequestFail.bind(this),this.multipart,1e3*this.timeout):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){const t=!!window.CellsNativePlugins&&!!window.CellsNativePlugins.Http,e=!!window.cordovaCells&&!!window.cordovaCells.Http;return t?window.CellsNativePlugins.Http:e?window.cordovaCells.Http:null}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let a=t.replace(/[\{\}]+/g,""),o=e[a];return o?delete e[a]:this._error(9,`Missing ${a} param value`),o})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(e);a.length&&(t=[t,a.map((t=>`${t}=${e[t]}`)).join("&")].join("?"))}return t}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(vt,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(mt,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var o=e.getItem(a);o&&"null"!==o&&(t[a]=o)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const a=window.sessionStorage;e=Object.keys(a).filter((e=>e.startsWith(t))).reduce(((e,o)=>(e[o.replace(t,"")]=a.getItem(o),e)),{})}return e}_getTokenForRequestHeaders(t,e){const a=`${t}Handler`,o=t===mt?"JWT ":"",r=t===mt?"Authorization":vt;if(void 0===this[a]||null===this[a])this._error(11,`${t} handler is undefined`);else{const i=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let n=this[a].getItem(i);n?e[r]=e[r]||o+n:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((a=>{e.push(`${a}=${t[a]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/form-data")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let a;const o=new Promise(((t,e)=>{a=(a,o)=>{a?e(a):t(o)}}));return e.addEventListener("loadend",(function t(o){e.removeEventListener("loadend",t),o.error?a(o.error):a(null,e.result)})),e.readAsText(t),o}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let a=0;for(;a<t.length;){let o=t[a],r=0,i=0;if(o<=127?(r=0,i=255&o):o<=223?(r=1,i=31&o):o<=239?(r=2,i=15&o):o<=244&&(r=3,i=7&o),t.length-a-r>0){let e=0;for(;e<r;)o=t[a+e+1],i=i<<6|63&o,e+=1}else i=65533,r=t.length-a;e+=String.fromCodePoint(i),a+=r+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},a=t.trim().split(/[\r\n]+/);for(const t in a)if(a.hasOwnProperty(t)&&""!==a[t]){let o=": ",r=a[t].split(o);e[r.shift().toLowerCase()]=r.join(o)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,a,o){let r=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(o)>=0&&(r=e.getResponseHeader(o));break;case this._NATIVE_XHR:r=JSON.parse(e.headers)[o]}if(r){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;t.getItem(e)!==r&&(t.setItem(e,r),this._emitTokenUpdate(a,r))}}_emitTokenUpdate(t,e){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,a,o,r;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),a=t.getResponseHeader("AuthenticationData"),o=t.getResponseHeader("AuthenticationState"),r=t.getResponseHeader("AuthenticationChallenge");else{let i=JSON.parse(t.headers);e=i.authenticationtype,a=i.authenticationdata,o=i.authenticationstate,r=i.authenticationchallenge}return{type:e,data:a,state:o,challenge:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",a=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const o=this._getSignatureData(t,e,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:o}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",a="",o=""){let r;if("object"==typeof t&&t){r=`${this._getSignatureData(t.signatureType,e,a)}=${t.signatureValue}`,t.challenge&&(r+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(r,t.signatureType,o)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(r=`password=${t}`,this._buildSignatureHeaders(r,"2",o)):(r=`${a}=${t}`,this._buildSignatureHeaders(r,e,o)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),o=this._extractResponseErrorCode(e),r=this._ERROR_CODES.SIGNATURE_INVALID.includes(o),{type:i,data:n,state:l,challenge:c}=this._extractSignatureResponseHeaders(t),s=this._getSignatureMetadata(t);if(r)this._notifySignatureInvalid(s),a=!0;else if(i)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(o)?(this._notifySignatureTypeUsingErrorCode(o,s,i,n,l,c),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response ir rejected.")}else this._notifySignatureTypeUsingHeaders(s,i,n,l,c),a=!0}return a}_notifySignatureRequiredFirstStep(t,e,a,o){this._defineSignatureType(e,a),this._defineSignatureValue(e,a,o),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:a,metadata:t}}))}_notifySignatureRequired(t,e,a,o,r){this._defineSignatureValue(e,a,o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:{type:e,data:a,challenge:r,metadata:t}}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_getSignatureMetadata(t){const{responseURL:e,status:a}=t;return{path:this._path,method:this.method,url:e,status:a}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",a=""){const o=e.split(";").findIndex((e=>e===t));return a.split(";")[o]}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,a,o,r){o?this._notifySignatureRequired(t,e,a,o,r):this._notifySignatureRequiredFirstStep(t,e,a,o)}_notifySignatureTypeUsingErrorCode(t,e,a,o,r,i){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,a,o,r):this._notifySignatureRequired(e,a,o,r,i)}}class pt extends yt{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class gt extends pt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/financial-health-data`)}toString(){return super.toString("BGADPMxAccountsFinancialHealthDataGetV1")}}class _t extends(m(v)){constructor(){super(),this.native=!1,this.requiredToken="tsec"}_getService(t,e,a){const o=this._getServiceParams(a,e);return delete o.paramArrayMode,this._getServicePath(t,this.constructor._getBgadp(o))}static _responseMapping(t){return t}}class St extends _t{static get is(){return"bbva-local-financial-health-api-dm"}constructor(){super(),this.native=!1,this.requiredToken="tsec"}getFinancialHealthData(t){this._generateGetService(this._getService("getAccountsFinancialHealthData",{},t),{customEvent:"dispatch-financial-health-successful",errorFireEventHandler:"dispatch-financial-health-error"},this.constructor._responseMapping)}static _getBgadp(t){return{getAccountsFinancialHealthDataV1:()=>new gt(t)}}}var Pt=t`
:host {
  --_button-default-color: var(--bbva-button-default--_ambient--color,
      var(--bbva-button-default--custom--primary-ambient--color,
        ${R("colorPrimaryCtaMainTextDefault",O)}));
  --_button-default-focus-border-color: var(--bbva-button-default--_ambient--focus-border-color,
    var(--bbva-button-default--custom--primary-ambient--focus-border-color,
      ${R("colorPrimarySurfaceAmbientFocus",O)}));
  --_button-default-bg-color: var(--bbva-button-default--_ambient--bg-color,
    var(--bbva-button-default--custom--primary-ambient--bg-color,
      ${R("colorPrimaryCtaMainBackgroundDefault",O)}));
  --_button-default-color-active: var(--bbva-button-default--_ambient--color-active,
    var(--bbva-button-default--custom--primary-ambient--color-active,
      ${R("colorPrimaryCtaMainTextDefault",O)}));
  --_button-default-bg-color-active: var(--bbva-button-default--_ambient--bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--bg-color-active,
      ${R("colorPrimaryCtaMainBackgroundPressed",O)}));
  --_button-default-bg-color-disabled: var(--bbva-button-default--_ambient--bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${R("colorPrimaryCtaDisabledBackground",O)}));
  --_button-default-color-disabled: var(--bbva-button-default--_ambient--color-disabled,
    var(--bbva-button-default--custom--primary-ambient--color-disabled,
      ${R("colorPrimaryCtaDisabledText",O)}));
  /* Secondary styles */
  --_button-default-secondary-color: var(--bbva-button-default--_ambient--secondary-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-color,
      ${R("colorPrimaryCtaComplementaryTextDefault",O)}));
  --_button-default-secondary-bg-color: var(--bbva-button-default--_ambient--secondary-bg-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-bg-color,
      transparent));
  --_button-default-secondary-border-color: var(--bbva-button-default--_ambient--secondary-border-color,
    var(--bbva-button-default--custom--primary-ambient--secondary-border-color,
      ${R("colorPrimaryCtaComplementaryBorderDefault",O)}));
  --_button-default-secondary-color-active: var(--bbva-button-default--_ambient--secondary-color-active,
    var(--bbva-button-default--custom--primary-ambient--secondary-color-active,
      ${R("colorPrimaryCtaComplementaryTextPressed",O)}));
  --_button-default-secondary-bg-color-active: var(--bbva-button-default--_ambient--secondary-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--secondary-bg-color-active,
      ${R("colorPrimaryCtaComplementaryBackgroundPressed",O)}));
  --_button-default-secondary-bg-color-disabled: var(--bbva-button-default--_ambient--secondary-bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${R("colorPrimaryCtaDisabledBackground",O)}));
  /* icon no-background styles */
  --_button-default-icon-no-background-color: var(--bbva-button-default--_ambient--icon-no-background-color,
    var(--bbva-button-default--custom--primary-ambient--icon-no-background-color,
      ${R("colorPrimaryLinkMainDefault",O)}));
  --_button-default-icon-no-background-color-active: var(--bbva-button-default--_ambient--icon-no-background-color-active,
    var(--bbva-button-default--custom--primary-ambient--icon-no-background-color-active,
      ${R("colorPrimaryLinkMainPressed",O)}));
  --_button-default-positive-color: var(--bbva-button-default--_ambient--positive-color,
    var(--bbva-button-default--custom--primary-ambient--positive-color,
      ${R("colorPrimaryCtaPositiveTextDefault",O)}));
  --_button-default-positive-bg-color: var(--bbva-button-default--_ambient--positive-bg-color,
    var(--bbva-button-default--custom--primary-ambient--positive-bg-color,
      ${R("colorPrimaryCtaPositiveBackgroundDefault",O)}));
  --_button-default-positive-color-active: var(--bbva-button-default--_ambient--positive-color-active,
    var(--bbva-button-default--custom--primary-ambient--positive-color-active,
      ${R("colorPrimaryCtaPositiveTextPressed",O)}));
  --_button-default-positive-bg-color-active: var(--bbva-button-default--_ambient--positive-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--positive-bg-color-active,
      ${R("colorPrimaryCtaPositiveBackgroundPressed",O)}));
  --_button-default-positive-color-disabled: var(--bbva-button-default--_ambient--positive-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--positive-color-disabled,
      ${R("colorPrimaryCtaDisabledText",O)}));
  --_button-default-positive-bg-color-disabled: var(--bbva-button-default--_ambient--positive-bg-color-disabled,
  var(--bbva-button-default--custom--primary-ambient--positive-bg-color-disabled,
    ${R("colorPrimaryCtaDisabledBackground",O)}));
  /* Alert styles */
  --_button-default-alert-secondary-color: var(--bbva-button-default--_ambient--alert-secondary-color,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color,
      ${R("colorPrimaryLinkInverseDefault",O)}));
  --_button-default-alert-secondary-bg-color: var(--bbva-button-default--_ambient--alert-secondary-bg-color,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-bg-color,
      ${R("colorPrimarySurfaceAlternativeDefault",O)}));
  --_button-default-alert-secondary-color-active: var(--bbva-button-default--_ambient--alert-secondary-color-active,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color-active,
      ${R("colorPrimaryLinkInversePressed",O)}));
  --_button-default-alert-secondary-bg-color-active: var(--bbva-button-default--_ambient--alert-secondary-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-bg-color-active,
      ${R("colorPrimarySurfaceAlternativePressed",O)}));
  --_button-default-alert-secondary-color-disabled: var(--bbva-button-default--_ambient--alert-secondary-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--alert-secondary-color-disabled,
      ${R("colorPrimaryCtaDisabledText",O)}));
  --_button-default-alert-secondary-bg-color-disabled: var(--bbva-button-default--_ambient--alert-secondary-bg-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--bg-color-disabled,
      ${R("colorPrimaryCtaDisabledBackground",O)}));
  /* Icon */
  --_button-default-icon-background: var(--bbva-button-default--_ambient--icon-background,
    var(--bbva-button-default--custom--primary-ambient--icon-background,
      ${R("colorPrimaryCtaMainBackgroundDefault",O)}));
  --_button-default-icon-color: var(--bbva-button-default--_ambient--icon-color,
    var(--bbva-button-default--custom--primary-ambient--icon-color,
      ${R("colorPrimaryCtaMainTextDefault",O)}));
  --_button-default-icon-background-disabled: var(--bbva-button-default--_ambient--icon-background-disabled,
    var(--bbva-button-default--custom--primary-ambient--icon-background-disabled,
      ${R("colorPrimaryCtaDisabledBackground",O)}));
  --_button-default-icon-color-disabled: var(--bbva-button-default--_ambient--icon-color-disabled,
    var(--bbva-button-default--custom--primary-ambient--icon-color-disabled,
      ${R("colorPrimaryCtaDisabledText",O)}));
  --_button-default-icon-background-active: var(--bbva-button-default--_ambient--icon-background-active,
    var(--bbva-button-default--custom--primary-ambient--icon-background-active,
      ${R("colorPrimaryCtaMainBackgroundPressed",O)}));
  --_button-default-icon-color-active: var(--bbva-button-default--_ambient--icon-color-active,
    var(--bbva-button-default--custom--primary-ambient--icon-color-active,
      ${R("colorPrimaryCtaMainTextPressed",O)}));
  /* Icon no-background alternative */
  --_button-default-icon-no-background-alternative-color:
    var(--bbva-button-default--_ambient--icon-no-background-alternative-color,
      var(--bbva-button-default--custom--primary-ambient--icon-no-background-alternative-color,
        ${R("colorPrimaryLinkComplementaryDefault",O)}));
  --_button-default-icon-no-background-alternative-color-active:
    var(--bbva-button-default--_ambient--icon-no-background-alternative-color-active,
      var(--bbva-button-default--custom--primary-ambient--icon-no-background-alternative-color-active,
        ${R("colorPrimaryLinkComplementaryPressed",O)}));
  /* Interactive styles */
  --_button-default-interaction-bg-color: var(--bbva-button-default--_ambient--interaction-bg-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-bg-color,
      ${R("colorPrimaryCtaMainBackgroundDefault",O)}));
  --_button-default-interaction-icon-color: var(--bbva-button-default--_ambient--interaction-icon-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-icon-color,
      ${R("colorPrimaryCtaMainTextDefault",O)}));
  --_button-default-interaction-border-color: var(--bbva-button-default--_ambient--interaction-border-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-border-color,
      transparent));
  --_button-default-interaction-bg-color-active: var(--bbva-button-default--_ambient--interaction-bg-color-active,
    var(--bbva-button-default--custom--primary-ambient--interaction-bg-color-active,
      ${R("colorPrimaryCtaMainBackgroundPressed",O)}));
  --_button-default-interaction-disabled-bg-color: var(--bbva-button-default--_ambient--interaction-disabled-bg-color,
    var(--bbva-button-default--custom--primary-ambient--interaction-disabled-bg-color,
      ${R("colorPrimaryCtaDisabledBackground",O)}));
}
`;const kt=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-button-default--_ambient--color: initial;
    --bbva-button-default--_ambient--focus-border-color: initial;
    --bbva-button-default--_ambient--bg-color: initial;
    --bbva-button-default--_ambient--color-active: initial;
    --bbva-button-default--_ambient--bg-color-active: initial;
    --bbva-button-default--_ambient--bg-color-disabled: initial;
    --bbva-button-default--_ambient--color-disabled: initial;
    --bbva-button-default--_ambient--secondary-color: initial;
    --bbva-button-default--_ambient--secondary-border-color: initial;
    --bbva-button-default--_ambient--secondary-color-active: initial;
    --bbva-button-default--_ambient--secondary-bg-color-active: initial;
    --bbva-button-default--_ambient--secondary-color-disabled: initial;
    --bbva-button-default--_ambient--secondary-bg-color-disabled: initial;
    --bbva-button-default--_ambient--icon-no-background-color: initial;
    --bbva-button-default--_ambient--icon-no-background-color-active: initial;
    --bbva-button-default--_ambient--positive-color: initial;
    --bbva-button-default--_ambient--positive-bg-color: initial;
    --bbva-button-default--_ambient--positive-color-active: initial;
    --bbva-button-default--_ambient--positive-bg-color-active: initial;
    --bbva-button-default--_ambient--positive-color-disabled: initial;
    --bbva-button-default--_ambient--positive-bg-color-disabled: initial;
    --bbva-button-default--_ambient--alert-secondary-color: initial;
    --bbva-button-default--_ambient--alert-secondary-bg-color: initial;
    --bbva-button-default--_ambient--alert-secondary-active-color: initial;
    --bbva-button-default--_ambient--alert-secondary-active-bg-color: initial;
    --bbva-button-default--_ambient--alert-secondary-color-disabled: initial;
    --bbva-button-default--_ambient--alert-secondary-bg-color-disabled: initial;
    --bbva-button-default--_ambient--icon-background: initial;
    --bbva-button-default--_ambient--icon-background-active: initial;
    --bbva-button-default--_ambient--icon-background-disabled: initial;
    --bbva-button-default--_ambient--icon-no-background-alternative-color: initial;
    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: initial;
    --bbva-button-default--_ambient--icon-color: initial;
    --bbva-button-default--_ambient--icon-color-active: initial;
    --bbva-button-default--_ambient--icon-color-disabled: initial;
    --bbva-button-default--_ambient--interaction-bg-color: initial;
    --bbva-button-default--_ambient--interaction-icon-color: initial;
    --bbva-button-default--_ambient--interaction-border-color: initial;
    --bbva-button-default--_ambient--interaction-bg-color-active: initial;
    --bbva-button-default--_ambient--interaction-disabled-bg-color: initial;
  }
`,Ct=t`
  /* Default styles */
  /* Static */
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--primary-alt-ambient--color,
      ${R("colorPrimaryAltCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--focus-border-color,
      ${R("colorPrimaryAltSurfaceAmbientFocus",O)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color,
      ${R("colorPrimaryAltCtaMainBackgroundDefault",O)}
    );
    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--color-active,
      ${R("colorPrimaryAltCtaMainTextDefault",O)}
    );
    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-active,
      ${R("colorPrimaryAltCtaMainBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",O)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",O)}
    );

    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color,
      ${R("colorPrimaryAltCtaComplementaryTextDefault",O)}
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-border-color,
      ${R("colorPrimaryAltCtaComplementaryBorderDefault",O)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color-active,
      ${R("colorPrimaryAltCtaComplementaryBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",O)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--secondary-bg-color-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",O)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-color,
      ${R("colorPrimaryAltLinkMainDefault",O)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-color-active,
      ${R("colorPrimaryAltLinkMainPressed",O)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-alternative-color,
      ${R("colorPrimaryAltLinkComplementaryDefault",O)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-no-background-alternative-color-active,
      ${R("colorPrimaryAltLinkComplementaryPressed",O)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color,
      ${R("colorPrimaryAltCtaPositiveTextDefault",O)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color,
      ${R("colorPrimaryAltCtaPositiveBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color-active,
      ${R("colorPrimaryAltCtaPositiveTextPressed",O)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-active,
      ${R("colorPrimaryAltCtaPositiveBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",O)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",O)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-color,
      ${R("colorPrimaryAltLinkInverseDefault",O)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color,
      ${R("colorPrimarySurfaceAmbientDefault",O)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-bg-color-active,
      ${R("colorPrimarySurfaceAlternativeDefault",O)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient-alert-secondary-color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",O)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--bg-color-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",O)}
    );

    /* Icon styles */
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background,
      ${R("colorPrimaryAltCtaMainBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background-active,
      ${R("colorPrimaryAltCtaMainBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-background-disabled,
      ${R("colorPrimaryAltCtaDisabledBackground",O)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color,
      ${R("colorPrimaryAltCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-active,
      ${R("colorPrimaryAltCtaMainTextPressed",O)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-disabled,
      ${R("colorPrimaryAltCtaDisabledText",O)}
    );

    /* Interactive */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-bg-color,
      ${R("colorPrimaryAltCtaMainBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-icon-color,
      ${R("colorPrimaryAltCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-bg-color-active,
      ${R("colorPrimaryAltCtaMainBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--primary-alt-ambient--interaction-disabled-bg-color,
      ${R("colorPrimaryAltCtaDisabledBackground",O)}
    );
  }
`,At=t`
  /* Default styles */
  /* Static */
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--secondary-ambient--color,
      ${R("colorSecondaryCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--secondary-ambient--focus-border-color,
      ${R("colorSecondarySurfaceAmbientFocus",O)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--secondary-ambient--bg-color,
      ${R("colorSecondaryCtaMainBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--secondary-ambient--color-active,
      ${R("colorSecondaryCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--bg-color-active,
      ${R("colorSecondaryCtaMainBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--bg-color-disabled,
      ${R("colorSecondaryCtaDisabledBackground",O)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--color-disabled,
      ${R("colorSecondaryCtaDisabledText",O)}
    );
    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-color,
      ${R("colorSecondaryCtaComplementaryTextDefault",O)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--secondary-ambient--secondary-border-color,
      ${R("colorSecondaryCtaComplementaryBorderDefault",O)}
    );

    --bbva-button-default--_ambient--secondary-color-active: var(
      --bbva-button-default--custom--secondary-ambient--color-active,
      ${R("colorSecondaryCtaComplementaryTextPressed",O)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color-active,
      ${R("colorSecondaryCtaComplementaryBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-color-disabled,
      ${R("colorSecondaryCtaDisabledText",O)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--secondary-bg-color-disabled,
      ${R("colorSecondaryCtaDisabledBackground",O)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-color,
      ${R("colorSecondaryLinkMainDefault",O)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-color-active,
      ${R("colorSecondaryLinkMainPressed",O)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-alternative-color,
      ${R("colorSecondaryLinkComplementaryDefault",O)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-no-background-alternative-color-active,
      ${R("colorSecondaryLinkComplementaryPressed",O)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--secondary-ambient--positive-color,
      ${R("colorSecondaryCtaPositiveTextDefault",O)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--positive-bg-color,
      ${R("colorSecondaryCtaPositiveBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--secondary-ambient--positive-color-active,
      ${R("colorSecondaryCtaPositiveTextPressed",O)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--positive-bg-color-active,
      ${R("colorSecondaryCtaPositiveBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--positive-color-disabled,
      ${R("colorSecondaryCtaDisabledText",O)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${R("colorSecondaryCtaDisabledBackground",O)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-color,
      ${R("colorSecondaryLinkInverseDefault",O)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-bg-color,
      ${R("colorSecondarySurfaceAlternativeDefault",O)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-active: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-active-color,
      ${R("colorSecondaryLinkInversePressed",O)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--alert-secondary-active-bg-color,
      ${R("colorSecondarySurfaceAlternativePressed",O)}
    );

    /* Icon styles */
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--secondary-ambient--icon-background,
      ${R("colorSecondaryCtaMainBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-background-active,
      ${R("colorSecondaryCtaMainBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--secondary-ambient--icon-color-active,
      ${R("colorSecondaryCtaMainTextPressed",O)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--secondary-ambient--icon-background-disabled,
      ${R("colorSecondaryCtaDisabledBackground",O)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--secondary-ambient--icon-color,
      ${R("colorSecondaryCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--icon-color-disabled,
      ${R("colorSecondaryCtaDisabledText",O)}
    );

    /* Interactive styles */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-bg-color,
      ${R("colorSecondaryCtaMainBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-icon-color,
      ${R("colorSecondaryCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--secondary-ambient--interaction-bg-color-active,
      ${R("colorSecondaryCtaMainBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--secondary-ambient--interaction-disabled-bg-color,
      ${R("colorSecondaryCtaDisabledBackground",O)}
    );
  }
`,xt=t`
  /* Default styles */
  /* Static */
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-button-default--_ambient--color: var(
      --bbva-button-default--custom--secondary-alt-ambient--color,
      ${R("colorSecondaryAltCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--focus-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--focus-border-color,
      ${R("colorSecondaryAltSurfaceAmbientFocus",O)}
    );

    --bbva-button-default--_ambient--bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color,
      ${R("colorSecondaryAltCtaMainBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--color-active,
      ${R("colorSecondaryAltCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color-active,
      ${R("colorSecondaryAltCtaMainBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--bg-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--bg-color-disabled,
      ${R("colorSecondaryAltCtaDisabledBackground",O)}
    );

    --bbva-button-default--_ambient--color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--color-disabled,
      ${R("colorSecondaryAltCtaDisabledText",O)}
    );

    /* Secondary styles */
    --bbva-button-default--_ambient--secondary-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color,
      ${R("colorSecondaryAltCtaComplementaryTextDefault",O)}
    );

    --bbva-button-default--_ambient--secondary-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color,
      transparent
    );

    --bbva-button-default--_ambient--secondary-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-border-color,
      ${R("colorSecondaryAltCtaComplementaryBorderDefault",O)}
    );

    --bbva-button-default--_ambient--secondary-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color-active,
      ${R("colorSecondaryAltCtaComplementaryTextPressed",O)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color-active,
      ${R("colorSecondaryAltCtaComplementaryBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--secondary-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-color-disabled,
      ${R("colorSecondaryAltCtaDisabledText",O)}
    );

    --bbva-button-default--_ambient--secondary-bg-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--secondary-bg-color-disabled,
      ${R("colorSecondaryAltCtaDisabledBackground",O)}
    );

    /* Icon no-background styles */
    --bbva-button-default--_ambient--icon-no-background-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-color,
      ${R("colorSecondaryAltLinkMainDefault",O)}
    );

    --bbva-button-default--_ambient--icon-no-background-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-color-active,
      ${R("colorSecondaryAltLinkMainPressed",O)}
    );

    /* Icon no-background alternative styles */

    --bbva-button-default--_ambient--icon-no-background-alternative-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-alternative-color,
      ${R("colorSecondaryAltLinkComplementaryDefault",O)}
    );

    --bbva-button-default--_ambient--icon-no-background-alternative-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-no-background-alternative-color-active,
      ${R("colorSecondaryAltLinkComplementaryPressed",O)}
    );

    /* Positive styles */
    --bbva-button-default--_ambient--positive-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color,
      ${R("colorSecondaryAltCtaPositiveTextDefault",O)}
    );

    --bbva-button-default--_ambient--positive-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-bg-color,
      ${R("colorSecondaryCtaPositiveBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--positive-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color-active,
      ${R("colorSecondaryAltCtaPositiveTextPressed",O)}
    );

    --bbva-button-default--_ambient--positive-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-bg-color-active,
      ${R("colorSecondaryAltCtaPositiveBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--positive-color-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--positive-color-disabled,
      ${R("colorSecondaryAltCtaDisabledText",O)}
    );

    --bbva-button-default--_ambient--positive-bg-color-disabled: var(
      --bbva-button-default--custom--primary-alt-ambient--positive-bg-color-disabled,
      ${R("colorSecondaryAltCtaDisabledBackground",O)}
    );

    /* Alert styles */
    --bbva-button-default--_ambient--alert-secondary-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-color,
      ${R("colorSecondaryAltLinkInverseDefault",O)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-bg-color,
      ${R("colorSecondaryAltSurfaceAlternativeDefault",O)}
    );

    --bbva-button-default--_ambient--alert-secondary-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--alert-secondary-active-color,
      ${R("colorSecondaryAltLinkInversePressed",O)}
    );

    --bbva-button-default--_ambient--alert-secondary-bg-color-active: var(
      --bbva-button-default--custom--primary-alt-ambient--alert-secondary-active-bg-color,
      ${R("colorSecondaryAltSurfaceAlternativePressed",O)}
    );

    /* Icon styles*/
    --bbva-button-default--_ambient--icon-background: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background,
      ${R("colorSecondaryAltCtaMainBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--icon-background-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background-active,
      ${R("colorSecondaryAltCtaMainBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--icon-background-disabled: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-background-disabled,
      ${R("colorSecondaryAltCtaDisabledBackground",O)}
    );

    --bbva-button-default--_ambient--icon-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color,
      ${R("colorSecondaryAltCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--icon-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--icon-color-active,
      ${R("colorSecondaryAltCtaMainTextPressed",O)}
    );

    --bbva-button-default--_ambient--icon-color-disabled: var(
      --bbva-button-default--custom--secondary-ambient--icon-color-disabled,
      ${R("colorSecondaryAltCtaDisabledText",O)}
    );

    /* Interactive styles */
    --bbva-button-default--_ambient--interaction-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-bg-color,
      ${R("colorSecondaryAltCtaMainBackgroundDefault",O)}
    );

    --bbva-button-default--_ambient--interaction-icon-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-icon-color,
      ${R("colorSecondaryAltCtaMainTextDefault",O)}
    );

    --bbva-button-default--_ambient--interaction-border-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-border-color,
      transparent
    );

    --bbva-button-default--_ambient--interaction-bg-color-active: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-bg-color-active,
      ${R("colorSecondaryAltCtaMainBackgroundPressed",O)}
    );

    --bbva-button-default--_ambient--interaction-disabled-bg-color: var(
      --bbva-button-default--custom--secondary-alt-ambient--interaction-disabled-bg-color,
      ${R("colorSecondaryAltCtaDisabledBackground",O)}
    );
  }
`,Tt={primary:t`
    ${kt}
    ${w.primary}
    ${I.primary}
  `,primaryAlt:t`
    ${Ct}
    ${w.primaryAlt}
    ${I.primaryAlt}
  `,secondary:t`
    ${At}
    ${w.secondary}
    ${I.secondary}
  `,secondaryAlt:t`
    ${xt}
    ${w.secondaryAlt}
    ${I.secondaryAlt}
  `},Dt=Object.values(Tt);var $t=t`
:host {
  position: relative;
  min-width: var(--button-default-min-width, 8rem);
  max-width: 100%;
  height: 3rem;
  box-sizing: border-box;
  padding: 0.75rem 2rem;
  border: none;
  border-radius: var(--button-default-border-radius, var(--borderRadiusSmall, ${e(r.small)}));
  margin-left: var(--button-default-margin-left, 0);
  background-color: var(--_button-default-bg-color);
  color: var(--_button-default-color);
  text-align: center;
  transition: background-color 0.15s ease-out;
  transition-timing-function: cubic-bezier(0, 0, 0.1, 1);
}
:host [data-tag-name=bbva-type-text] {
  color: var(--_button-default-color);
}
:host [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-color);
}

:host([fullwidth]) {
  width: 100%;
}

.text {
  display: block;
}
.text.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.text.slot-text {
  font-size: var(--typographyTypeSmall, ${e(h.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(y.typeSmall)});
}

:host([variant=alert]),
:host([variant=alert-secondary]),
:host([variant=alert-positive]) {
  height: 2.5rem;
}
:host([variant=alert]) .icon,
:host([variant=alert-secondary]) .icon,
:host([variant=alert-positive]) .icon {
  min-width: 1rem;
  margin-right: 0.5rem;
}

:host,
[data-tag-name=bbva-type-text] {
  font-style: var(--button-default-font-weight, var(--fontFacePrimaryMediumFontStyle, ${e(a.medium.fontStyle)}));
  font-weight: var(--button-default-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(a.medium.fontWeight)}));
}

.wrapper {
  display: contents;
}

button {
  box-sizing: border-box;
  padding: 0;
}

:host([focus-visible]:not([aria-disabled=true])) {
  box-shadow: none;
}

:host([focus-visible]) {
  border-radius: 0 !important;
  outline: 2px solid var(--_button-default-focus-border-color);
  outline-offset: 4px;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:not([href])) {
  padding: 0.75rem 2rem;
  border: none;
  border-radius: var(--button-default-border-radius, var(--borderRadiusSmall, ${e(r.small)}));
  color: var(--_button-default-color);
}

:host([size=L]:not([href]):not([variant=icon])) {
  height: 3.5rem;
}

:host([aria-disabled=true]) {
  transition: background-color 0.15s ease-in-out;
  transition-timing-function: cubic-bezier(0.2, 0, 0.1, 1);
}
:host([aria-disabled=true]) .text, :host([aria-disabled=true]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-color-disabled);
  transition: color 0.15s ease-in-out;
  transition-timing-function: cubic-bezier(0.2, 0, 0.1, 1);
}

:host([variant=icon]:not([href])) {
  border: none;
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${e(r.small)}));
  background-color: var(--_button-default-icon-background);
}
:host([variant=icon]:not([href])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-color);
}

:host([variant~=icon][variant~=no-background][variant~=alternative]:not([href])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-no-background-alternative-color);
}

:host([variant~=icon][variant~=no-background][variant~=alternative][active]:not([href])[active]:not([href])[active]:not([disabled])) [data-tag-name=bbva-type-icon],
:host([variant~=icon][variant~=no-background][variant~=alternative]:host(:hover)) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-no-background-alternative-color-active);
}

:host([variant~=no-background][focus-visible]) {
  outline-offset: 0;
}

:host([variant~=icon][variant~=no-background][loading]) {
  pointer-events: none;
  cursor: default;
}
:host([variant~=icon][variant~=no-background][loading]) [data-tag-name=bbva-type-icon] {
  min-width: auto;
}

:host([variant=icon][disabled]) {
  border: none;
  background-color: var(--_button-default-icon-background-disabled);
}
:host([variant=icon][disabled]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-color-disabled);
}

:host([variant=icon][active]),
:host([variant=icon]:host(:hover)) {
  border: none;
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${e(r.small)}));
  background-color: var(--_button-default-icon-background-active);
}
:host([variant=icon][active]) [data-tag-name=bbva-type-icon],
:host([variant=icon]:host(:hover)) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-color-active);
}

:host(:not([href])[active]:not([aria-disabled=true])), :host(:not([href]):host(:hover)) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
}

:host(:not([href])[active]),
:host([variant=alert]:not([href])[active]) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
}

:host([active]),
:host([variant=alert][active]),
:host([variant=alert]:host(:hover)) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
  transition: background-color 0.15s ease-in-out;
  transition-timing-function: cubic-bezier(0.2, 0, 0.1, 1);
}

:host([variant=secondary]) {
  border: 0.0625rem solid var(--_button-default-secondary-border-color);
  background-color: var(--_button-default-secondary-bg-color);
  color: var(--_button-default-secondary-color);
}
:host([variant=secondary]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-secondary-color);
}
:host([variant=secondary]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-secondary-color);
}

:host([variant=alert-secondary]) {
  background-color: var(--_button-default-alert-secondary-bg-color);
  color: var(--_button-default-alert-secondary-color);
}
:host([variant=alert-secondary]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-alert-secondary-color);
}
:host([variant=alert-secondary]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-alert-secondary-color);
}

:host([variant=positive]),
:host([variant=alert-positive]) {
  background-color: var(--_button-default-positive-bg-color);
  color: var(--_button-default-positive-color);
}
:host([variant=positive]) [data-tag-name=bbva-type-text],
:host([variant=alert-positive]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-positive-color);
}
:host([variant=positive]) [data-tag-name=bbva-type-icon],
:host([variant=alert-positive]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-positive-color);
}

:host([aria-disabled=true]),
:host([variant=alert][aria-disabled=true]) {
  background-color: var(--_button-default-bg-color-disabled);
}
:host([aria-disabled=true]) [data-tag-name=bbva-type-icon],
:host([variant=alert][aria-disabled=true]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-color-disabled);
}

:host([variant=secondary][active]),
:host([variant=secondary]:host(:hover)),
:host([variant=secondary][active]:not([aria-disabled=true])) {
  border: none;
  background-color: var(--_button-default-secondary-bg-color-active);
  color: var(--_button-default-secondary-color-active);
}
:host([variant=secondary][active]) [data-tag-name=bbva-type-text],
:host([variant=secondary]:host(:hover)) [data-tag-name=bbva-type-text],
:host([variant=secondary][active]:not([aria-disabled=true])) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-secondary-color-active);
}
:host([variant=secondary][active]) [data-tag-name=bbva-type-icon],
:host([variant=secondary]:host(:hover)) [data-tag-name=bbva-type-icon],
:host([variant=secondary][active]:not([aria-disabled=true])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-secondary-color-active);
}

:host([variant=alert-secondary][active]),
:host([variant=alert-secondary]:host(:hover)),
:host([variant=alert-secondary][active]:not([aria-disabled=true])) {
  border-color: transparent;
  background-color: var(--_button-default-alert-secondary-bg-color-active);
  color: var(--_button-default-alert-secondary-color-active);
}
:host([variant=alert-secondary][active]) [data-tag-name=bbva-type-text],
:host([variant=alert-secondary]:host(:hover)) [data-tag-name=bbva-type-text],
:host([variant=alert-secondary][active]:not([aria-disabled=true])) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-alert-secondary-color-active);
}
:host([variant=alert-secondary][active]) [data-tag-name=bbva-type-icon],
:host([variant=alert-secondary]:host(:hover)) [data-tag-name=bbva-type-icon],
:host([variant=alert-secondary][active]:not([aria-disabled=true])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-alert-secondary-color-active);
}

:host([variant=secondary][aria-disabled=true]),
:host([variant=alert-secondary][aria-disabled=true]) {
  border: none;
  background-color: var(--_button-default-secondary-bg-color-disabled);
}
:host([variant=secondary][aria-disabled=true]) [data-tag-name=bbva-type-text],
:host([variant=alert-secondary][aria-disabled=true]) [data-tag-name=bbva-type-text] {
  color: var(--_button-default-color-disabled);
}

:host([variant=positive][active]),
:host([variant=alert-positive][active]),
:host([variant=positive]:host(:hover)),
:host([variant=alert-positive]:host(:hover)),
:host([variant=positive][active]:not([aria-disabled=true])),
:host([variant=alert-positive][active]:not([aria-disabled=true])) {
  background-color: var(--_button-default-positive-bg-color-active);
  color: var(--_button-default-positive-color-active);
}

:host([variant=positive][aria-disabled=true]),
:host([variant=alert-positive][aria-disabled=true]) {
  background-color: var(--_button-default-positive-bg-color-disabled);
  color: var(--_button-default-positive-color-disabled);
}

:host([variant~=icon][variant~=no-background]:not([href])) {
  background: transparent;
}
:host([variant~=icon][variant~=no-background]:not([href])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-no-background-color);
}

:host([variant=icon]:not([href])[disabled]) {
  border: none;
  background-color: var(--_button-default-icon-background-disabled);
}
:host([variant=icon]:not([href])[disabled]) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-color-disabled);
}

:host([variant~=icon]) {
  display: inline-flex;
  min-width: var(--button-default-min-width, 3rem);
  max-width: var(--button-default-min-width, 3rem);
  box-sizing: border-box;
  align-items: center;
  justify-content: center;
  padding: 0.75rem;
}

:host([variant~=icon][icon-size="32"]) {
  padding: 0.5rem;
}

:host([variant=icon]:not([href])[active]),
:host([variant=icon]:not([href])[active]:not([disabled])) {
  border: none;
  border-radius: var(--button-default-icon-border-radius, var(--borderRadiusSmall, ${e(r.small)}));
  background-color: var(--_button-default-icon-background-active);
}
:host([variant=icon]:not([href])[active]) [data-tag-name=bbva-type-icon],
:host([variant=icon]:not([href])[active]:not([disabled])) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-color-active);
}

:host([variant=icon][hidden]),
[hidden] {
  display: none !important;
}

:host([variant~=icon][variant~=no-background][disabled]:not([href])[disabled]) {
  opacity: 0.4;
}

:host([variant~=icon][variant~=no-background][active]:not([href])[active]:not([href])[active]:not([disabled])) [data-tag-name=bbva-type-icon],
:host([variant~=icon][variant~=no-background]:host(:hover)) [data-tag-name=bbva-type-icon] {
  fill: var(--_button-default-icon-no-background-color-active);
}

:host([variant~=interaction]) {
  right: 0;
  display: inline-flex;
  min-width: var(--button-default-min-width, 3rem);
  max-width: var(--button-default-max-width, 3rem);
  box-sizing: border-box;
  align-items: center;
  justify-content: center;
  padding: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.transcript {
  padding: 0.75rem;
  border: 0;
}

.action::before {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  display: block;
  background-color: var(--_button-default-interaction-bg-color);
  content: "";
}
:host([variant~=interaction][talking]) .action::before {
  background-color: transparent;
}
.action-icon {
  position: relative;
  fill: var(--_button-default-interaction-icon-color);
}
:host([variant~=interaction][disabled]) .action {
  cursor: default;
  pointer-events: none;
}
:host([variant~=interaction][disabled]) .action-icon {
  color: var(--_button-default-interaction-disabled-icon-color);
}
:host([variant~=interaction][disabled]) .action::before {
  background-color: var(--_button-default-interaction-disabled-bg-color);
}
.action-glow .before {
  position: absolute;
  top: 50%;
  left: 50%;
  display: none;
  width: 6rem;
  height: 6rem;
  border-radius: 50%;
  animation: lowerpulse 2s infinite;
  animation-play-state: paused;
  background-color: var(--_button-default-interaction-bg-color);
  opacity: 0.4;
  transform: translate(-50%, -50%) scale(1);
}
:host([variant~=interaction][talking]) .action-glow .before, :host(:hover[variant~=interaction]) .action-glow .before {
  display: block;
  animation-play-state: running;
}
:host([variant~=interaction]:not([talking])) .action-glow .before {
  animation: animationempty;
}
.action-glow .after {
  position: absolute;
  top: 50%;
  left: 50%;
  display: none;
  width: 5rem;
  height: 5rem;
  border-radius: 50%;
  animation: upperpulse 2s infinite;
  animation-play-state: paused;
  background-color: var(--_button-default-interaction-bg-color-active);
  transform: translate(-50%, -50%) scale(1);
}
:host([variant~=interaction][talking]) .action-glow .after, :host(:hover[variant~=interaction]) .action-glow .after {
  display: block;
  animation-play-state: running;
}
:host([variant~=interaction]:not([talking])) .action-glow .after {
  animation: animationempty;
}

/* MIC LISTENING ANIMATION */
@keyframes lowerpulse {
  0% {
    opacity: 0;
    transform: translate(-50%, -50%) scale(0);
  }
  50% {
    opacity: 0.4;
    transform: translate(-50%, -50%) scale(1);
  }
  100% {
    opacity: 0;
    transform: translate(-50%, -50%) scale(0);
  }
}
@keyframes upperpulse {
  0% {
    transform: translate(-50%, -50%) scale(0.83);
  }
  50% {
    transform: translate(-50%, -50%) scale(1);
  }
  100% {
    transform: translate(-50%, -50%) scale(0.83);
  }
}
@keyframes animationempty {
  0%, 100% {
    display: block;
  }
}
`;class Rt extends(E(i(n))){static get is(){return"bbva-button-default"}static get properties(){return{text:{type:String},icon:{type:String},buttonTranscriptLabel:{type:String,attribute:"button-transcript-label"},interaction:{type:Boolean},size:{type:String},keepTalkingAnimation:{type:Boolean,attribute:"keep-talking-animation"},iconTalkingAnimation:{type:String,attribute:"icon-talking-animation"},fullwidth:{type:Boolean,attribute:"fullwidth"},hasEllipsis:{type:Boolean,attribute:"has-ellipsis"},variant:{type:String},iconSize:{type:String,attribute:"icon-size"},loading:{type:Boolean,reflect:!0}}}static get scopedElements(){return{"bbva-type-icon":B,"bbva-type-text":L}}constructor(){super(),this.type="button",this.buttonTranscriptLabel="bbva-button-default-interaction-record-button",this.interaction=!1,this.size="",this.keepTalkingAnimation=!1,this.iconTalkingAnimation=l(),this.fullwidth=!1,this.hasEllipsis=!1,this.loading=!1,delete this.href}static get styles(){return[super.styles,Pt,$t,Dt,c("bbva-button-default-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._endRecord=this._endRecord.bind(this),this.interaction&&(this.addEventListener("mousedown",this._startRecord),this.addEventListener("keydown",this._keydownRecord),this.addEventListener("keyup",this._keyupRecord),this.addEventListener("blur",this._endRecord))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),document.removeEventListener("mouseup",this._endRecord),this.removeEventListener("mousedown",this._startRecord),this.removeEventListener("keydown",this._keydownRecord),this.removeEventListener("keyup",this._keyupRecord),this.removeEventListener("blur",this._endRecord)}_startRecord(){document.addEventListener("mouseup",this._endRecord),this._talking=!0,this.keepTalkingAnimation&&(this.icon=this.iconTalkingAnimation)}set _talking(t){t!==this._isTalking&&(t?(this.setAttribute("talking",""),this.dispatchEvent(new CustomEvent("button-interaction-mic-request",{detail:!0,composed:!0,bubbles:!0}))):(this.removeAttribute("talking"),this.dispatchEvent(new CustomEvent("button-interaction-mic-cancel",{detail:!0,composed:!0,bubbles:!0}))),this._isTalking=t,this.requestUpdate())}get _talking(){return this._isTalking}_keydownRecord(t){32!==t.keyCode&&13!==t.keyCode||this._startRecord()}_keyupRecord(t){32!==t.keyCode&&13!==t.keyCode||this._endRecord()}_endRecord(){document.removeEventListener("mouseup",this._endRecord);this._isTalkingAnimation||!this.keepTalkingAnimation?(this._talking=!1,this._isTalkingAnimation=!1,this.icon=s()):this._isTalkingAnimation=!0}get _icon(){return d`
      <bbva-type-icon
        class="icon"
        icon="${this.variant.includes("alert")?b():this.icon}"
        size="${this._setIconSize}"
        .loading="${this.isLoading}"
      ></bbva-type-icon>
    `}get _setIconSize(){if(this.variant.includes("alert"))return 16;const t={16:16,24:24,32:32};return this.variant.includes("no-background")&&t[this.iconSize]||t[24]}get isLoading(){return this.loading&&this.variant&&this.variant.substring("icon")&&this.variant.substring("no-background")}get _text(){return void 0!==this.text?d`
          <bbva-type-text
            class="text"
            tag="span"
            size="S"
            .text=${this.text}
            ?ellipsis="${this.hasEllipsis}"
            alignment="center"
          ></bbva-type-text>
        `:d` <slot class="text slot-text ${this.hasEllipsis?"ellipsis":""}"></slot> `}get _interaction(){return d`
      <div class="action transcript">
        <span id="action-container" class="action-glow">
          <span class="before"></span><span class="after"></span>
        </span>
        <span class="sr-only">${this.t(this.buttonTranscriptLabel)}</span>
        <bbva-type-icon class="action-icon" .icon="${this.icon}" size="24"></bbva-type-icon>
      </div>
    `}get _buttonDefault(){var t;const e=void 0!==this.icon||null!==(t=this.variant)&&void 0!==t&&t.includes("alert")?this._icon:u;return this.interaction?d`${this._interaction}`:d`${e}${this._text}${this._action}`}render(){return d`
      <div onclick="void(0)" class="wrapper ${this.fullwidth?"fullwidth":""}">
        ${this._buttonDefault}
      </div>
    `}}var wt=t`
:host {
  --_help-modal-content-bg-color:
  var(--bbva-help-modal--_ambient--content-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--content-bg-color,
      ${R("colorPrimaryAltSurfaceAmbientDefault",O)}));
  --_help-modal-title-icon-color:
  var(--bbva-help-modal--_ambient--title-icon-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--title-icon-color,
      ${R("colorPrimaryAltSupportInfoDefault",O)}));
  --_help-modal-title-icon-color-warning:
  var(--bbva-help-modal--_ambient--title-icon-color-warning,
    var(--bbva-help-modal--custom--primary-alt-ambient--title-icon-color-warning,
      ${R("colorPrimaryAltSupportErrorDefault",O)}));
  --_help-modal-title-icon-color-caution:
    var(--bbva-help-modal--_ambient--title-icon-color-caution,
      var(--bbva-help-modal--custom--primary-alt-ambient--title-icon-color-caution,
        ${R("colorPrimaryAltSupportWarningDefault",O)}));
  --_help-modal-title-color:
    var(--bbva-help-modal--_ambient--title-color,
      var(--bbva-help-modal--custom--primary-alt-ambient--title-color,
        ${R("colorPrimaryAltText01Default",O)}));
  --_help-modal-content-color:
    var(--bbva-help-modal--_ambient--content-color,
      var(--bbva-help-modal--custom--primary-alt-ambient--content-color,
        ${R("colorPrimaryAltText01Default",O)}));
  --_help-modal-footer-bg-color:
  var(--bbva-help-modal--_ambient--footer-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--footer-bg-color,
      ${R("colorPrimaryAltSurfaceAmbientDefault",O)}));
  --_help-modal-veil-bg-color:
  var(--bbva-help-modal--_ambient--veil-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--veil-bg-color,
      ${R("colorPrimaryAltSurfaceAmbientOverlay",O)}));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal--_ambient--ios-header-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--ios-header-bg-color,
      ${R("colorPrimaryAltSurfaceAmbientOverlay",O)}));
  --_help-modal-full-height-bg-color:
   var(--bbva-help-modal--_ambient--full-height-bg-color,
     var(--bbva-help-modal--custom--primary-alt-ambient--full-height-bg-color,
       ${R("colorPrimaryAltSurfaceAmbientDefault",O)}));
  --_help-modal-divider-color:
  var(--bbva-help-modal--_ambient--divider-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--divider-color,
      ${R("colorPrimaryAltFormatDivider",O)}));
}
`,It=t`
:host {
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2, 0, 0.1, 1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2, 0, 0.1, 1));
  --_veil-bg-color: var(--_help-modal-veil-bg-color);
  --_help-modal-padding-bottom: var(--bbva-help-modal-padding-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em));
  display: flex;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.veil {
  opacity: 0;
  position: fixed;
  transition: visibility 0.2s ease-in-out, opacity var(--_help-modal-veil-transition-duration) var(--_help-modal-veil-transition-easing);
  visibility: hidden;
  pointer-events: none;
}

.modal-main {
  display: flex;
  flex-direction: column;
  overflow-y: auto;
  width: 100%;
  height: 100%;
  padding-bottom: calc(var(--_help-modal-padding-bottom) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
  max-width: 45rem;
}

.transition-container {
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  position: fixed;
  transform: translateY(100%);
  transition: visibility var(--_help-modal-transition-duration), transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing);
  width: 100%;
  max-width: 45rem;
  margin: 0 auto;
  will-change: transform;
  z-index: 1;
}
.transition-container.half-height {
  max-height: 75%;
  top: auto;
}
.transition-container.half-height .modal-main {
  background-color: var(--_help-modal-content-bg-color);
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em);
}
.transition-container .help-modal {
  width: 100%;
  box-sizing: border-box;
  height: 100%;
  align-items: center;
  margin: auto;
  display: grid;
}

.modal-header {
  width: 100%;
  max-width: 45rem;
  background-color: var(--_help-modal-content-bg-color);
}

.divider {
  height: 1.5rem;
  padding-top: calc(((0.125 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  margin: 0;
}
.divider hr {
  margin-right: auto;
  margin-left: auto;
  width: 3.5rem;
  background-color: var(--_help-modal-divider-color);
}

.modal-container {
  width: 100%;
  padding: var(--bbva-help-modal-padding, 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${e(h.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(a.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${e(y.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-type-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) 0);
  transform: translateZ(0.01px);
}

:host([full-height]) .help-modal {
  background-color: var(--_help-modal-full-height-bg-color);
  display: block;
}
:host([full-height]) .slot-footer {
  padding: var(--bbva-help-modal-footer-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) 0);
}
:host([full-height]) .modal-header {
  width: 100%;
  position: sticky;
  position: -webkit-sticky;
  top: 0;
  z-index: 1;
}

.modal-content {
  outline: 0;
}
.modal-content [data-tag-name=bbva-type-text] {
  color: var(--_help-modal-content-color);
}

:host([modal-type=warning]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-warning);
}

:host([modal-type=caution]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-caution);
}

.modal-content-wrapper {
  max-width: var(--bbva-help-modal-content-max-width, 100%);
  width: var(--bbva-help-modal-content-width, 100%);
  color: var(--_help-modal-content-color);
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${e(h.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${e(y.typeSmall)}));
  text-align: left;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em);
}

[data-tag-name=bbva-button-default].footer-button {
  --button-default-max-width: calc(100% - 32px);
  width: 100%;
}

[data-tag-name=bbva-type-link].footer-button {
  text-align: center;
  margin: var(--bbva-help-modal-footer-last-button-margin, calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem));
}

:host([fixed-footer]) .modal-container {
  flex-grow: 1;
  overflow-y: auto;
  display: flex;
  flex-direction: column;
}
:host([fixed-footer]) .modal-main {
  height: calc(100% - 215px);
}
:host([fixed-footer]) .modal-footer {
  position: absolute;
  bottom: 0;
  width: 100%;
  box-shadow: var(--bbva-help-modal-footer-fixed-shadow, 0 0 4px 0 rgba(18, 18, 18, 0.3));
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em);
  background-color: var(--_help-modal-footer-bg-color);
}
:host([fixed-footer]) .modal-content-wrapper,
:host([fixed-footer]) .modal-content,
:host([fixed-footer]) .slot-content {
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  width: 100%;
}
:host([fixed-footer]) .transition-container .modal-main {
  padding-bottom: var(--bbva-help-modal-safe-area-inset-bottom, 0);
}

:host([visible]) .veil {
  visibility: visible;
  opacity: var(--_veil-opacity, 0.9);
  pointer-events: all;
}
:host([visible]) .transition-container {
  transform: translateY(0%);
}
:host([visible]) .transition-container .help-modal {
  display: flex;
  flex-direction: column;
}

:host(:not([visible])) {
  position: relative;
  height: auto;
  width: auto;
  --bbva-help-modal-transition-duration: 0.15s;
  --bbva-help-modal-veil-transition-duration: 0.15s;
  --bbva-help-modal-transition-easing: cubic-bezier(0.8, 0, 1, 1);
  --bbva-help-modal-veil-transition-easing: cubic-bezier(0.8, 0, 1, 1);
  --_modal-padding: 0;
}
:host(:not([visible])) .transition-container {
  visibility: hidden;
}
:host(:not([visible]))[full-height] .veil {
  transition: none;
}
:host(:not([visible])) div[tabindex="0"] > .veil {
  visibility: hidden;
  opacity: 0;
}

@supports (padding-top: constant(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}

:host([visible][full-height]) {
  --bbva-help-modal-veil-transition-duration: 0.15s;
}

:host(:not([visible])[full-height]) {
  --bbva-help-modal-transition-duration: 0.2s;
}
:host(:not([visible])[full-height]) .transition-container {
  transform: translateY(100%);
}
:host(:not([visible])[full-height]) .modal-main {
  max-width: none;
}

.transition-container[_should-display-fixed-header] {
  padding-top: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: fixed;
}
@supports (padding-top: constant(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}

@supports (padding-top: constant(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}
@supports (padding-bottom: constant(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: constant(safe-area-inset-bottom);
  }
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: env(safe-area-inset-bottom);
  }
}
@supports (will-change: transform) {
  .transition-container {
    will-change: transform;
  }
}
.iOS-fixed-header {
  background-color: var(--_help-modal-ios-header-bg-color);
  height: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: absolute;
  bottom: calc(100vh - var(--bbva-help-modal-safe-area-inset-top, 0));
  width: 100%;
  z-index: 5;
}

@media (min-width: 45rem) {
  :host([full-height]) .transition-container {
    padding-bottom: 0;
  }
  :host([full-height]) .modal-header {
    --bbva-header-main-max-width: 45rem;
  }
  :host([full-height]) .modal-container,
  :host([full-height]) .modal-footer {
    margin: auto;
  }
  :host([full-height]) .modal-container {
    max-width: 45rem;
    flex-grow: 1;
    overflow-y: auto;
  }
  :host([full-height]) .modal-footer {
    width: 45rem;
  }
  :host([full-height]) .modal-footer .slot-footer {
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em);
  }
  .modal-title [data-tag-name=bbva-type-text] {
    width: 40rem;
  }
}
`;class Et extends(E(i(p))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":Rt,"bbva-type-icon":B,"bbva-type-text":L,"bbva-header-main":M,"bbva-type-link":H}}static get properties(){return{closeModalElements:{type:Array,attribute:"close-modal-elements"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},headerButtons:{type:Array},headerShowLeftIcon:{type:Boolean,attribute:"header-show-left-icon"},headerLeftIconLabel:{type:String,attribute:"header-left-icon-label"},headerLeftIconAriaLabel:{type:String,attribute:"header-left-icon-aria-label"},headerPosition:{type:String,attribute:"header-position"},headerLogo:{type:String,attribute:"header-logo"},headerLeftIcon:{type:Object},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},disabledButton:{type:Boolean,attribute:"disabled-button"},disabledLink:{type:Boolean,attribute:"disabled-link"},titleLines:{type:Number,attribute:"title-lines"},_translate:{type:Number,state:!0}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=g(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link"],this.headerText="",this.headerType="",this.headerButtons=[],this.headerShowLeftIcon=!1,this.headerLeftIconLabel="",this.headerLeftIconAriaLabel="",this.headerPosition="",this.headerLogo="",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.disabledLink=!1,this._modalHeight=0,this._translate=0,this._swipe=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),requestAnimationFrame((()=>{this._modalHeight=this._modal.offsetHeight})),this.fullHeight||(_(this._header,"track",(t=>this._onTrack(t))),S(this._header,"pan-x")),this._checkHeight()}updated(t){if(super.updated&&super.updated(t),t.has("visible")){let t="close";this.visible?t="open":this._translate=0,this.dispatchEvent(new CustomEvent(`help-modal-${t}`,{detail:{status:t},bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("modal-state-change",{detail:{status:t,visible:this.visible,modal:this},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,wt,It,Tt.primaryAlt,F.primaryAlt,w.primaryAlt,I.primaryAlt,c("bbva-help-modal-shared-styles")]}_onTrack(t){var e;if(null!=t&&null!==(e=t.detail)&&void 0!==e&&e.state)switch(t.detail.state){case"start":this._trackStart();break;case"end":this._trackEnd(t.detail.dy);break;default:this._trackY(t.detail.dy)}}_trackStart(){this.setAttribute("dragging","")}_trackY(t){this._swipe=!0,this._translate=t}_trackEnd(t){t>this._modalHeight/3?(this.removeAttribute("dragging",""),this.visible=!1,this._translate=this._modalHeight,this._gestureCloseModal()):this._translate=0,this._swipe=!1}_gestureCloseModal(){this.dispatchEvent(new CustomEvent("help-modal-swipe-close",{detail:!0,bubbles:!0,composed:!0}))}get _fixedIOSHeader(){return d`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get _headerType(){return this.headerType||this.fullHeight?"modal-initial":"modal-short"}get helpModalHeader(){return this.headerText?d`
          <slot name="slot-header" class="header-slot">
            <bbva-header-main
              id="helpModalHeader"
              text="${this.headerText}"
              variant="${this._headerType}"
              position="${this.headerPosition}"
              logo="${this.headerLogo}"
              .buttons="${this.headerButtons}"
              ?show-left-icon="${this.headerShowLeftIcon}"
              .leftIcon="${this.headerLeftIcon}"
              left-icon-label="${this.headerLeftIconLabel}"
              left-icon-aria-label="${this.headerLeftIconAriaLabel}"
              @header-main-icon-click="${t=>this._handleClick(t,"header")}"
            ></bbva-header-main>
          </slot>
        `:""}get helpModalContent(){return d`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?d`<bbva-type-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-type-text>`:d`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return d`
      <div
        class="veil"
        @keyup="${!this.fullHeight&&this._keyupEvent}"
        @click="${!this.fullHeight&&this._onVeilClick}"
      ></div>
    `}get helpModalFooter(){return d`
      <div class="modal-footer">
        <slot name="slot-footer">
          <div class="slot-footer" ?hidden="${!this.buttonText&&!this.linkText}">
            <bbva-button-default
              ambient="primary-alt"
              class="footer-button"
              data-tag-name="bbva-button-default"
              ?hidden="${!this.buttonText}"
              ?disabled="${this.disabledButton}"
              @click="${t=>this._handleClick(t,"footer-button")}"
              >${this.buttonText}</bbva-button-default
            >
            ${this.linkText?d`<bbva-type-link
                  ambient="primary-alt"
                  class="footer-button"
                  data-tag-name="bbva-type-link"
                  ?disabled="${this.disabledLink}"
                  @click="${t=>this._handleClick(t,"footer-link")}"
                  ?hidden="${!this.linkText}"
                  >${this.linkText}</bbva-type-link
                >`:null}
          </div>
        </slot>
      </div>
    `}get helpModalTitle(){return d`
      <div id="helpModalTitle" class="modal-title">
        <slot name="slot-title">
          <bbva-type-icon
            class="title-icon"
            data-tag-name="bbva-type-icon"
            size="24"
            icon="${this.titleIcon}"
            ?hidden="${!this.titleIcon}"
            aria-hidden="true"
          ></bbva-type-icon>
          ${this.titleText?d` <bbva-type-text
                id="title-text"
                .text=${this.titleText}
                ?hidden="${!this.titleText}"
                ellipsis
                .lines="${this.titleLines}"
                unset
                size="${this.fullHeight?"L":"S"}"
                font-weight="500"
                tag="h2"
              >
              </bbva-type-text>`:null}
        </slot>
      </div>
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, 0.3)")}_runScrollReset(){const t=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==t||t.scrollTo(0,0)}))}))}_setFooterShadow(t){t.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(t,e){var a,o;this.dispatchEvent(new CustomEvent(`help-modal-${e}-click`,{detail:{index:null==t||null===(a=t.detail)||void 0===a?void 0:a.index},bubbles:!0,composed:!0})),(this.closeModalElements.includes(e)||null!==(o=t.detail)&&void 0!==o&&o.closeOnClick)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick({},"veil")}_shouldDisplayFixedHeader(){const t=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(t[0])}get _modalContent(){return d`
      ${this._fixedIOSHeader}
      <section
        style="${this._swipe?`transform: translateY(${this._translate}px)`:""}"
        class="transition-container  ${P({"half-height":!this.fullHeight})}"
        ?_should-display-fixed-header="${this._shouldDisplayFixedHeader()}"
      >
        <div class="help-modal">
          <div class="modal-header">${this.helpModalHeader}</div>
          <div class="modal-main">
            <div class="modal-container" @scroll="${this._setFooterShadow}">
              <div class="modal-content-wrapper">
                ${this.helpModalTitle} ${this.helpModalContent}
              </div>
            </div>
            ${this.helpModalFooter}
          </div>
        </div>
      </section>
    `}}var Bt=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--ambientsLight100, ${e(k.light100)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.items__item {
  display: flex;
}

.illustration {
  margin-top: 1rem;
}

.main-container {
  padding: 0 1rem 1rem 1rem;
}

.items__item-icon-container {
  padding-top: 1.125rem;
  margin-right: 0.5rem;
}

.description {
  word-wrap: break-word;
}
`;class Lt extends(C(q(A(i(v))))){static get is(){return"bbva-feature-pfm-dashboard-check-up"}static get properties(){return{financialHealthDataApiVersion:{type:String},customerServicesPayrollPortabilitiesApiVersion:{type:String},_accounts:{type:Array},_isInitialized:{type:Boolean},accountCurrency:{type:String},accountLevel:{type:String},accountType:{type:String},checkUpIndicators:{type:Object},statusIllustrations:{type:Object},statusPayroll:{type:Object},_microIllustration:{type:String},_titleMessage:{type:String},_textButton:{type:String},_tipDescription:{type:String},_showModal:{type:Boolean},_healthDataParsed:{type:Object},offerList:{type:Array},_infoText:{type:String},_secondInfoText:{type:String},errorCodeList:{type:Array},_reasons:{type:Array}}}static get scopedElements(){const t=[Z,N,M,bt,St,j,B,L,Et,...Lt.configurationScopedElements()];return Lt.scopedElementsFromClasses(t)}constructor(){super(),this.config={fixedHeader:!0,back:!0},this._isInitialized=!1,this.financialHealthDataApiVersion="1",this.checkUpIndicators={arco:"ARCO",payroll:"PAYROLL",data:"DATA"},this.offerList=[],this._indicators=[],this.statusIllustrations={},this.statusPayroll={},this.accountCurrency="MXN",this.accountLevel="04",this.accountType="LIC",this.statusIllustration={},this._microIllustration="",this._titleMessage="",this._infoText="",this._secondInfoText="",this._textButton="",this._tipDescription="",this._showModal=!1,this._healthDataParsed={},this.errorCodeList=[],this._reasons=[],this.customerServicesPayrollPortabilitiesApiVersion="0"}static get styles(){return[U.primary,w.primary,I.primary,Bt,c("bbva-feature-pfm-dashboard-check-up-shared-styles")]}static get _reasonIcons(){return{0:g,1:x}}setGlomoSetting(t){var e,a;this.errorCodeList=null==t||null===(e=t.pfmDashboardCheckUp)||void 0===e?void 0:e.errorCodeList,this.offerList=null==t||null===(a=t.pfmDashboardCheckUp)||void 0===a?void 0:a.offerList}setIndicators(t){this._indicators=t.reduce(((t,e)=>(t.push(...e.indicators),t)),[])}setAccounts(t){const e=t.reduce(((t,e)=>(t.push(...e.products),t)),[]);this._accounts=e.map((t=>({alias:t.name,name:t.name,productId:t.id,id:t.id,number:t.originalProduct.number,masked:t.description.masked,availableBalance:{currentBalances:[{amount:t.primaryAmount.amount,currency:t.primaryAmount.currency}]},primaryAmount:{amount:t.primaryAmount.amount,currency:t.primaryAmount.currency,label:"dashboard-account-current-balance"},description:t.description,level:t.level,status:t.status,numberType:{id:t.numberType.id,name:"Customer Account Code"},contractType:{id:"ACCOUNT",name:"ACCOUNTS"},currencies:[{currency:t.primaryAmount.currency}],type:"ACCOUNTS",family:"accounts",detail:t.detail})))}_initializeProperties(){this.config={fixedHeader:!0,back:!0},this._microIllustration="",this._titleMessage="",this._infoText="",this._secondInfoText="",this._textButton="",this._tipDescription="",this._showModal=!1,this._healthDataParsed={},this.showSpinner()}init(){if(this._isInitialized)return;this._isInitialized=!0,this._initializeProperties();this._validatePayrollAccounts()?this._requestFinancialHealthData():this._validateAccounts()}_validatePayrollAccounts(){return this._indicators.find((t=>t.indicatorId===this.checkUpIndicators.payroll)).isActive}_requestFinancialHealthData(){this._dataProviderAccounsFinancialHealth=this.shadowRoot.querySelector("[data-tag-name=bbva-local-financial-health-api-dm]");const t=moment().format("YYYY-MM-DD");this._dataProviderAccounsFinancialHealth.getFinancialHealthData({fromDate:t})}handleFinancialHealthDataSuccess(t){const e=(t.detail||[])[0];if(e&&e.business.length>0){this._setCheckUpData(e);const t=this.constructor._normalizeText(e.healthStatus.description).toLowerCase();this._dispatchEvent("page-view",{level2:t})}else this._setNoCheckUpMessage();this._hideSpinner()}static _normalizeText(t){return t.normalize("NFD").replace(/[\u0300-\u036f]/g,"")}_setCheckUpData(t){const e=t.healthStatus.description;this._microIllustration=this.statusIllustrations[this.constructor._normalizeText(e)],this._titleMessage=this.t("bbva-feature-pfm-checkup-title",{status:e}),this._reasons=this._getHealthDataReasons(t.healthReasons)||[],this._setTip(t.business)}_getHealthDataReasons(t){return t.map((t=>{const e=t.whyHealthDetail.split("//");return{status:this.constructor._reasonIcons[e[0]](),description:e[1]}}))||[]}_setTip(t){const e=t.map((t=>{const e=this._getTypeTip(t.tip.id);return{type:e.type,action:e.offer,id:t.tip.id,business:t.businessType.name,title:this.constructor._getTipFormatted(t.tip.tittle)}})).reduce(((t,e)=>(t["offer"===e.type?"a":"b"].push(e),t)),{a:[],b:[]}),a=e.a.concat(e.b);this._tipDescription=a[0].title}_getTypeTip(t){const e={type:"info",offer:null},a=this.offerList.find((e=>e.tipId===t));return a&&(e.type="offer",e.offer=a),e}static _getTipFormatted(t){return t.split("//").join(" ")}_validateAccounts(){const t=this._accounts.find((t=>Object.prototype.hasOwnProperty.call(t,"detail")&&Object.prototype.hasOwnProperty.call(t,"numberType")&&Object.prototype.hasOwnProperty.call(t,"id"))),e=t.detail.specificAmounts.find((t=>Object.prototype.hasOwnProperty.call(t,"amounts"))).amounts.find((t=>Object.prototype.hasOwnProperty.call(t,"currency")));t&&e.currency===this.accountCurrency&&t.detail.level===this.accountLevel&&t.numberType.id!==this.accountType?this._requestGetPayrollPortabilities(t):(this._setNoCheckUpMessage(),this._hideSpinner())}_requestGetPayrollPortabilities(t){this.shadowRoot.querySelector("[data-tag-name=bbva-local-customer-services-payroll-portabilities-api-dm]").getPayrollPortabilities({"receiverContract.id":t.id})}handlePayrollPortabilitiesSucessful(t){const e=(t.detail||[]).find((t=>((t||{}).status||{}).id===this.statusPayroll.pending||((t||{}).status||{}).id===this.statusPayroll.inProgress));this._setChangePayrollMessage(!e),this._hideSpinner()}_setChangePayrollMessage(t){this._microIllustration="daytoday",this._titleMessage=this.t("bbva-feature-pfm-checkup-change-payroll-title"),this._infoText=this.t("bbva-feature-pfm-checkup-change-payroll-description"),this._textButton=t?this.t("bbva-feature-pfm-checkup-change-payroll-button-text"):""}_setNoCheckUpMessage(){this._microIllustration="daytoday",this._titleMessage=this.t("bbva-feature-pfm-checkup-no-data-title"),this._infoText=this.t("bbva-feature-pfm-checkup-no-data-description"),this._secondInfoText=this.t("bbva-feature-pfm-checkup-no-data-second-description")}_setErrorMessage(){this._microIllustration="error",this._titleMessage=this.t("bbva-feature-pfm-checkup-error-title"),this._infoText=this.t("bbva-feature-pfm-checkup-error-description"),this._showModal=!0,this._hideSpinner()}showSpinner(){this.showLoader(),this.config.loader={visible:!0}}_hideSpinner(){this.clearLoader(),this.config.loader={visible:!1}}_handleHeaderMainClick(t){const e={0:()=>this.navigateToBack(),1:()=>this._openSideBar()},{index:a}=t.detail;e[a]()}navigateToBack(){this._isInitialized=!1,this._dispatchEvent("go-back")}_navigateToPayroll(){const t=this._accounts.find((t=>t.detail.indicators.find((t=>t.id===this.statusPayroll.principalAccount)).isActive));this._dispatchEvent("navigate-to-payroll",{product:t})}_openSideBar(){this._dispatchEvent("open-sidebar")}_handleModalHeaderClick(){this.navigateToBack()}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e||!0,bubbles:!0,composed:!0}))}get _leftIcon(){return{id:"btn-back",icon:T(),accessibilityText:this.t("bbva-feature-pfm-checkup-accessibility-text-return")}}get _headerButtons(){return[{id:"btn-menu",icon:D(),accessibilityText:this.t("bbva-feature-pfm-checkup-accessibility-text-menu")}]}retry(){this._isInitialized=!0,this.init()}render(){return d`${super.render()}
    <bbva-header-main show-left-icon
      .leftIcon="${this._leftIcon}"
      text="${this.t("bbva-feature-pfm-checkup-header-text")}"
      .buttons="${this._headerButtons}" slot="customHeaderContainer"
      @header-main-icon-click="${this._handleHeaderMainClick}"></bbva-header-main>
    <div class="main-container">
      <bbva-clip-microillustration .microillustration="${this._microIllustration}" class="illustration"></bbva-clip-microillustration>
      <bbva-type-text text="${this._titleMessage}" size="3XL" font-weight="700"></bbva-type-text>
      ${this._reasons.length?d`
      <div class="items">
        ${this._reasons.map((t=>d`
          <div class="items__item">
            <div class="items__item-icon-container"><bbva-type-icon .icon=${t.status} size="16" aria-hidden="true"></bbva-type-icon></div>
            <bbva-type-text text="${t.description}" size="S" font-weight="500"></bbva-type-text>
          </div>`))}
      </div>
      <bbva-notification-message class="message" .messageTitle="${this._tipDescription}" book-title=""></bbva-notification-message>
      `:d`
      <bbva-type-text class="description" text="${this._infoText}" size="S" font-weight="350"></bbva-type-text>
      ${this._textButton?d`
      <bbva-button-default fullwidth text="${this._textButton}" @click="${this._navigateToPayroll}"></bbva-button-default>`:""}
      `}
    </div>
    <bbva-help-modal
    full-height
    fixed-footer
    ?visible="${this._showModal}"
    aria-label="${this.t("bbva-feature-pfm-checkup-error-title")}"
    header-text="${this.t("bbva-feature-pfm-checkup-header-text")}"
    button-text="${this.t("bbva-feature-pfm-checkup-retry-call-service")}"
    @help-modal-header-click="${this._handleModalHeaderClick}"
    @help-modal-footer-button-click=${this.retry}>
      <div slot="slot-content">
        <bbva-clip-microillustration .microillustration="${this._microIllustration}" class="illustration"></bbva-clip-microillustration>
        <bbva-type-text text="${this._titleMessage}" size="3XL" font-weight="700"></bbva-type-text>
        <bbva-type-text class="description" text="${this._infoText}" size="S" font-weight="350"></bbva-type-text>
        <bbva-type-text class="description" text="${this._secondInfoText}" size="S" font-weight="350"></bbva-type-text>
      </div>
    </bbva-help-modal>

    <bbva-local-financial-health-api-dm
    version="${this.financialHealthDataApiVersion}"
    host="${this.host}"
    ?native="${this.native}"
    @dispatch-financial-health-successful="${this.handleFinancialHealthDataSuccess}"
    @dispatch-financial-health-error="${this._setErrorMessage}"
    @api-dm-error="${this._setErrorMessage}"></bbva-local-financial-health-api-dm>

    <bbva-local-customer-services-payroll-portabilities-api-dm
    version="${this.customerServicesPayrollPortabilitiesApiVersion}"
    host="${this.host}"
    ?native="${this.native}"
    @customer-services-payroll-portabilites-successful="${this.handlePayrollPortabilitiesSucessful}"
    @customer-services-payroll-portabilites-error="${this._setErrorMessage}"
    @api-dm-error="${this._setErrorMessage}"></bbva-local-customer-services-payroll-portabilities-api-dm>`}}class Ot extends Lt{static get is(){return"bbva-feature-pfm-dashboard-check-up-mx"}static get properties(){return{}}}customElements.define(Ot.is,Ot);const Mt=$((t=>class extends t{static get properties(){return{config:{type:Object},data:{type:Object},appStartedText:{type:String},stringNormalizeExceptions:{type:Array},dynamicMethodsName:{type:Array},dependsOnAppStartedLaunched:{type:Boolean},_isAppStartedLaunched:{type:Boolean}}}constructor(){super(),this.config={items:{},buttons:{continue:""},steps:{}},this.data={},this.appStartedText="app started:",this.stringNormalizeExceptions=["paymentCurrency","currency","operationNumber"],this.dynamicMethodsName=[],this.dependsOnAppStartedLaunched=!1,this._isAppStartedLaunched=!1}persistData(t){Object.assign(this.data,t)}buildDynamicMethods(){this.dynamicMethodsName.forEach((t=>{this[t]=()=>this._dispatch(`analytics-${this._camelToKebabCase(t)}`,this.data)}))}_camelToKebabCase(t){return t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`))}persistDataString(t){Object.assign(this.data,this.parseDataToString(t))}_toStringProcess(t,e){const a=t.toString();return this.stringNormalizeExceptions.includes(e)?a:this._normalizeStr(a)}_normalizeStr(t){let e=t;if("string"==typeof t){const a="ÁÃÀÄÂÉËÈÊÍÏÌÎÓÖÒÔÚÜÙÛÇáãàäâéëèêíïìîóöòôúüùûç",o="AAAAAEEEEIIIIOOOOUUUUCaaaaaeeeeiiiioooouuuuc",r=new RegExp(`[${a}]`,"ug");e=t.replace(r,(t=>o.charAt(a.indexOf(t)))).toLowerCase()}return e}parseDataToString(t,e){if(!t)return t;switch(typeof t){case"string":case"boolean":case"number":return this._toStringProcess(t,e);case"object":if(Array.isArray(t))return t.map((t=>this.parseDataToString(t)));const a={...t};return Object.keys(a).forEach((e=>{a[e]=this.parseDataToString(t[e],e)})),a;case"function":return this.parseDataToString(t());default:return t.toString()}}firePersistedData(t){this.persistData(t),this._dispatch("analytics-persisted-data",this.data)}fireNormalizedPersistedData(t){let e=t;"string"==typeof e&&(e=this.normalizeString(e)),"object"==typeof e&&Object.keys(e).forEach((t=>{e[t]=this.normalizeString(e[t])})),this.firePersistedData(e)}resetData(){this.data={},this._isAppStartedLaunched=!1}firePageVisit(){this._dispatch("analytics-page-visit",this.data),this._isAppStartedLaunched=!1}firePageView(t){this._dispatch("analytics-page-view"+(t?`-${t}`:""))}fireModal(){this._dispatch("analytics-modal")}fireModalWithData(){this._dispatch("analytics-modal",this.data)}fireInternalLink(t){this._dispatch("analytics-internal-link",t)}fireInternalLinkCard(t){this._dispatch("analytics-internal-link-card",t)}fireExternalLink(){this._dispatch("analytics-external-link")}fireItemAppStarted(t){if(!this._isAppStartedLaunched){const e=(null==t?void 0:t.id)||t,a=this._getTextConfig(e,"items");a&&(this.fireAppStarted(a),this._isAppStartedLaunched=this.dependsOnAppStartedLaunched)}}fireAppOnClickStart(){this._dispatch("analytics-app-on-click-start",this.data)}fireAppStarted(t){this.persistData({detail:`${this.appStartedText}${t}`}),this._dispatch("analytics-app-started",this.data)}fireAdvancedMark(){this._dispatch("analytics-advanced-mark",this.data)}fireAppCompleted(){this._dispatch("analytics-app-completed",this.data),this.resetData()}fireFrequentAppCompleted(){this._dispatch("analytics-frequent-app-completed",this.data),this.resetData()}normalizeString(t){return t.toLowerCase().normalize("NFD").replace(/[^a-zA-Z0-9 ]/g,"")}_getTextConfig(t,e){var a,o;return null===(a=this.config)||void 0===a||null===(o=a[e])||void 0===o?void 0:o[t]}getPathValue(t,e){return e.split(".").reduce(((t,e)=>t[e]),t)}_dispatch(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}}));class Ht extends(Mt(v)){static get is(){return"bbva-analyticmanager-pfm-dashboard-check-up"}static get properties(){return{errorLiterals:{type:Object}}}firePageViewFiancialHealthStatus(t){const e=null==t?void 0:t[0];if(e){var a;const t=this._normalizeStr(null===(a=e.healthStatus)||void 0===a?void 0:a.description);this._dispatch("analytics-page-view",{level2:t,errorPage:""})}}firePageError(){this._dispatch("analytics-page-view",{level2:this.errorLiterals.level2,errorPage:this.errorLiterals.errorPage})}}customElements.define(Ht.is,Ht);
