import{dL as o,z as t}from"./952f98a9.js";o("bbva-banner-image-shared-styles",t`

  :host(.image-size-auto) img {
    width: auto;
  }

  :host(.no-padding) {
    padding: 0;
  }
`),o("bbva-button-default-shared-styles",t`
  :host(.notifications-filter) {
    position: absolute;
    width: 6.25rem;
    bottom: 3.75rem;
    left: 50%;
    transform: translate(-50%, -50%);
  }
  :host(.center-size-l) {
    position: relative;
    width: 8.625rem;
    left: 50%;
    margin-top: 1.5rem;
    transform: translate(-50%, -50%);
  }
`),o("bbva-button-icon-shared-styles",t`
  :host(.notifications-button-filter) {
    z-index: 10;
    position: fixed;
  }
  @supports (bottom: env(safe-area-inset-bottom)) {
    :host(.frequent-operations-button-filter) {
      --safe-area-inset-bottom: env(safe-area-inset-bottom);
    }
  }
  :host(.frequent-operations-button-filter) {
    position: sticky;
    float: right;
    z-index: 10;
    bottom: calc(var(--app__footer-height, 0rem) + var(--safe-area-inset-bottom, 0rem) + 1rem);
  }
`),o("bbva-button-sort-shared-styles",t`
  :host(.notifications-list) {
    margin: 1rem 1rem 0.75rem;
  }
`),o("bbva-form-checkbox-shared-styles",t`
  /* GLOMO-MX */
  :host(.bbva-form-checkbox-variant-icon-clip-color--colorsPrimaryCoreLight) {
    --bbva-form-checkbox-variant-icon-clip-color: var(--colorsPrimaryCoreLight);
  }
  :host(.bbva-form-checkbox-variant-icon-clip-color--colorsTertiaryType8Dark) {
    --bbva-form-checkbox-variant-icon-clip-color: var(--colorsTertiaryType8Dark);
  }
  /* Glomocells */
  :host(.bbva-clip-box-text-color--colorsPrimaryCoreLight) {
    --bbva-clip-box-text-color: var(--colorsPrimaryCoreLight); 
  }
  :host(.bbva-clip-box-bg-color--colorsPrimaryCoreLightened) {
    --bbva-clip-box-bg-color: var(--colorsPrimaryCoreLightened);
  }
  :host(.bbva-clip-box-text-color--colorsTertiaryType8Dark) {
    --bbva-clip-box-text-color: var(--colorsTertiaryType8Dark);
  }
`),o("bbva-form-predictive-shared-styles",t`
  :host(.navy-on-header) {
    padding: 0.5rem 1rem;
    background-color: var(--backgroundColorsDark400);
  }
  :host(.navy-on-header) .input {
    --_field-bg-color: var(--backgroundColorsDark200);
    --_field-clear-color: var(--backgroundColorsLight);
    --_field-input-color: var(--backgroundColorsLight);
    --_field-label-color: var(--backgroundColorsLight100);
    --_field-border-color: var(--backgroundColorsLight100);
    --_field-focused-label-color: var(--backgroundColorsLight100);
    --_field-focused-border-color: var(--backgroundColorsLight);
  }
`),o("bbva-header-category-shared-styles",t`
  :host(.center-message-notifications) {
    margin: .6rem .1rem .5rem;
  }
  :host(.center-message-opportunities) {
    margin-top: 0.5rem;
    margin-bottom: 0.5rem;
  }
`),o("bbva-header-main-shared-styles",t`
    header button:focus {
        outline: var(--bbva-header-main-header-button-focus-outline, none);
    }
`),o("bbva-link-shared-styles",t`
  :host(.notifications-filter) {
    position: absolute;
    width: 6.25rem;
    bottom: 1.875rem;
    left: 50%;
    transform: translate(-50%, -50%);
  }
`),o("bbva-list-info-shared-styles",t`
  :host(.bbva-list-info-icon-color--colorsPrimaryCoreDark) {
    --bbva-list-info-icon-color: var(--colorsPrimaryCoreDark);
  }
`),o("bbva-help-modal-shared-styles",t`
  :host(.hide-padding-container) {      
    --bbva-help-modal-padding: 0 grid8Spacer(16px, em) 0;
  }

  :host(.padding-container-wrapper) .modal-content-wrapper {
    padding-top: 0;
  }

  :host(.editionModal[attach-to-body]#editionModal) {
    z-index: 99;
  }

  :host(.editionModal.modalPaddingNone[attach-to-body]#editionModal) {
    --bbva-help-modal-padding: 0;
  }

  :host(.exitConfirmationModal[attach-to-body]#resetUserActionsModal) {
    z-index: 101;
  }

  :host(.exitConfirmationModal[attach-to-body]#exitConfirmationModal) {
    z-index: 101;
  }

  :host(.addActionsModal[attach-to-body]#addActionsModal) {
    z-index: 100;
  }

  :host(.addActionsModal.modalPaddingNone[attach-to-body]#addActionsModal) {
    --bbva-help-modal-padding: 0;
  }

  :host(.limitExceedModal[attach-to-body]#limitExceedModal) {
    z-index: 101;
  }

  :host(.exitConfirmationModal[attach-to-body]#exitAddActionsConfirmationModal) {
    z-index: 101;
  }

  :host(.popularActionsErrorModal[attach-to-body]#popularActionsErrorModal) {
    z-index: 101;
  }
`),o("bbva-list-link-description-shared-styles",t`
  
  :host(.icon-align-right) {
    justify-content: space-between;
  }
`),o("bbva-list-link-shared-styles",t`

 :host(.core-blue) {
    --bbva-list-link-bg-color: var(--backgroundColorsDark200);
    --bbva-list-link-header-color: var(--backgroundColorsLight);
    --bbva-list-link-description-color: var(--backgroundColorsLight);
    --bbva-list-link-link-color: var(--backgroundColorsLight);
  }
`),o("bbva-notification-contextual-shared-styles",t`
  :host(.dashboard-assistant-available) {
    padding: 0 1rem 1rem;
    --bbva-notification-contextual-bg-color: var(--bbva-white, #fff);
  }
`),o("bbva-notification-message-shared-styles",t`
  :host(.coronita-margin) {
    margin-left: 1rem;
    margin-right: 1rem;
  }
  :host(.mt-24) {
    margin-top: 1.5rem;
  }
  :host(.mt-20) {
    margin-top: 1.25rem;
  }
  :host(.mt-16) {
    margin-top: 1rem;
  }
  :host(.mb-16) {
    margin-bottom: 1rem;
  }
`),o("bbva-notification-toast-shared-styles",t`
  :host(.z-index--999) {
    --bbva-z-index-notifications: 999;
  }
`),o("bbva-panel-info-shared-styles",t`
  :host(.tip-panel) {
    margin: 1rem;
    box-shadow: var(--boxShadowType1), 0 0 0 1rem var(--backgroundColorsLight100);
  }
  :host(.tip-panel) .panel-title {
    font-size: var(--typographyTypeLarge);
  }
  :host(.tip-panel) .text,
  :host(.tip-panel) .link {
    font-size: var(--typographyTypeSmall);
  }
  :host(.alert-message) {
    margin-top: 0.875rem;
    font-size: var(--typographyTypeXSmall);
    --bbva-panel-info-image-width: 5.5rem;
    --bbva-panel-info-image-height: 5.5rem;
  }
  :host(.dimentions-image) .image img {
    display: block;
    --bbva-panel-info-image-width: 5rem;
    --bbva-panel-info-image-height: 5rem;
    margin: 1rem auto 1rem;
  }
  :host(.signature-preview) .image img {
    display: block;
    --bbva-panel-info-image-width: 5rem;
    --bbva-panel-info-image-height: 5rem;
    margin: 0.5rem auto;
  }
  :host(.signature-preview) .content .description {
    --bbva-text-font-style: var(--fontFacePrimaryMediumItalicFontStyle);
  }
`),o("bbva-panel-offer-shared-styles",t`
  :host(.margins) {
    margin: 1rem;
    background-color: var(--bbva-white, #FFFFFF);
  }
`),o("bbva-panel-process-shared-styles",t`
  :host(.detail-summary) {
    background-color: var(--colorsSecondary100, #F4F4F4);
  }
`),o("bbva-text-shared-styles",t`
  :host(.product-selector-and-go) {
    padding: 0.5rem 1rem 0 1rem;
  }
  :host(.product-selector-and-go.only-products-of-one-type) {
    margin-bottom: -0.5rem;
  }
  :host(.text-margin-0) .text {
    margin: 0rem;
  }
  :host(.instruction-text) {
    padding: 0rem 1rem 0 1rem;
  }
  :host(.highlight-font-size--typographyTypeLarge) {
    --_highlight-font-size: var(--typographyTypeLarge);
  }
`),o("bbva-transition-container-shared-styles",t`
  :host([attach-to-body]#experiencesSection) {
    z-index: 99;
    --bbva-transition-container-padding: 0;
    --bbva-transition-container-padding-bottom: 0;
  }

  :host([attach-to-body]#smartServicingListView) {
    z-index: 99;
  }

  :host(.modalPaddingNone[attach-to-body]#smartServicingListView) {
    --bbva-transition-container-padding: 0;
    --_transition-container-padding: 0;
    --_transition-container-padding-bottom: 0;
  }
`),o("bbva-widget-faqs-detail-shared-styles",t`
  :host(.headerTitlePadding) {
    padding-top: 4.375rem;
  }
  
  :host(.headerTitlePaddingIos) {
    padding-top: 6.25rem;
  }
`);
