import{z as e,a8 as r,ac as a,a9 as t}from"./952f98a9.js";const o=(e,r,a)=>{e.dispatchEvent(new CustomEvent(r,{detail:a,bubbles:!0,composed:!0}))};var i=e`:host {
  display: block;
  position: absolute;
  top: 0;
  bottom: 0;
  right: 0;
  left: 0;
  box-sizing: border-box;
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-0: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-1: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-2: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-3: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-4: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-expandable-step-content-max-height: none;
  --bbva-list-info-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-list-info-icon-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-expandable-step] {
  --bbva-expandable-step-current-step-color: var(--colorsSecondary500, ${r(t.secondary500)});
  --bbva-expandable-step-content-max-height: auto;
}

[data-tag-name=bbva-expandable-step][completed] {
  padding-bottom: 1rem;
}
[data-tag-name=bbva-expandable-step][completed] hr[divider=small].step-divider {
  display: none;
}

[data-tag-name=bbva-expandable-step][completed][hide-padding-bottom] {
  padding-bottom: 0rem;
}
[data-tag-name=bbva-expandable-step][completed][hide-padding-bottom] hr[divider=small].step-divider {
  display: block;
  margin: 1rem 0rem 0rem;
}

[data-tag-name=bbva-expandable-step][completed]:last-of-type {
  padding-bottom: 7.625rem;
}

.offer-hero {
  background-color: var(--bbva-core-blue, var(--colorsPrimaryCore, ${r(t.primaryCore)}));
  margin: -3.5rem -1rem 0rem;
  padding-top: 1rem;
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-panel-info-image-width: 64px;
  --bbva-panel-info-image-height: 64px;
}

.quote__title {
  margin: 1rem 0rem 0.5rem;
}
.quote__description {
  margin-bottom: 1rem;
}
.quote .form-loan__field {
  margin-bottom: 1rem;
}
.quote .form-loan__field--select {
  margin-top: 0.5rem;
}
.quote .form-loan__field:last-child {
  margin-bottom: 0rem;
}
.quote__loan-amount {
  align-items: flex-start;
  padding-top: 1rem;
  --gridSpacerVariant: 0px;
}
.quote .payment-term__title {
  margin: 1rem 0rem;
}
.quote .payment-term__description {
  padding-bottom: 0.5rem;
  --gridSpacerVariant: 0;
}
.quote .payment-term__range {
  margin-top: 1.5rem;
  margin-bottom: 1.5rem;
  --bbva-form-range-bg-bar-filled-color-step-0: var(--colorsPrimaryCore);
  --bbva-form-range-bg-bar-filled-color-step-1: var(--colorsPrimaryCore);
  --bbva-form-range-bg-bar-filled-color-step-2: var(--colorsPrimaryCore);
  --bbva-form-range-bg-bar-filled-color-step-3: var(--colorsPrimaryCore);
  --bbva-form-range-bg-bar-filled-color-step-4: var(--colorsPrimaryCore);
}
.quote .considerations {
  padding-bottom: 1rem;
}
.quote .considerations__title {
  margin-bottom: 1rem;
}
.quote__rates-list {
  margin-bottom: 1.5rem;
}
.quote__notification-message {
  margin: 1.5rem 0rem;
}
.quote .amortization-table {
  padding: 2rem 0rem 0.5rem;
  align-items: center;
}
.quote__summary {
  margin-top: 0rem;
  --typographyTypeXSmall: var(--typographyTypeSmall, ${r(a.typeSmall)});
}
.quote__summaryCallmeBack {
  bottom: 2rem;
  z-index: 0;
}

.callmeBack {
  display: flex;
  align-items: center;
  justify-content: center;
  min-height: 3.5rem;
  --bbva-panel-button-fixed-padding: 0;
  --bbva-panel-button-box-shadow: 0;
  margin: 0;
  z-index: 0;
}

.user-data__field {
  margin-top: 1rem;
}
.user-data__field--half {
  margin-top: 0.5rem;
}
.user-data__privacy-file {
  display: flex;
  justify-content: center;
  padding-top: 0.5rem;
  padding-bottom: 2.5rem;
  --gridSpacerVariant: 0;
}

.terms {
  padding-bottom: 1rem;
}
.terms__links {
  padding-top: 0.5rem;
  padding-bottom: 1rem;
}
.terms__link {
  padding: 1rem 0rem;
  --typographyTypeSmall: var(--typographyTypeMedium, ${r(a.typeMedium)});
}
.terms__notification-message {
  margin-top: 1rem;
  margin-bottom: 1.5rem;
}

[data-tag-name=bbva-expandable-step] .step-summary {
  display: none;
}

[data-tag-name=bbva-expandable-step][completed] .step-summary {
  display: block;
}

.step-summary__item {
  padding-top: 0rem;
  line-height: 24px;
}
.step-summary__terms-check {
  padding-bottom: 0rem;
}

.receipt {
  line-height: 1.5rem;
  padding-bottom: 1.5rem;
}
.receipt hr[divider] {
  margin-top: 1rem;
}
.receipt__date {
  display: flex;
  gap: 0.25rem;
  justify-content: center;
  margin: 0.5rem 0rem;
}
.receipt__notification-message {
  margin: 2rem 1rem;
}
.receipt__contact {
  --typographyTypeLarge: 15px;
  --fontFacePrimaryMediumFontWeight: 400;
  --bbva-list-definition-title-title-color: #666666;
  --bbva-list-definition-title-subtitle-color: #121212;
  --typographyTypeSmall: 16px;
  --fontFacePrimaryBookFontWeight: 500;
}
.receipt__icon {
  margin: 1rem auto 1.5rem;
}

.text-center {
  text-align: center;
}

.step-button-container {
  display: flex;
  justify-content: center;
  flex-direction: column;
  align-items: center;
}

.padding-x {
  padding-left: 1rem;
  padding-right: 1rem;
}

.margin-x {
  margin-left: 1rem;
  margin-right: 1rem;
}

.no-margin-x {
  padding-left: 0rem;
  padding-right: 0rem;
}

.cat-description {
  --_highlight-font-size: 1.125rem;
}

.cat-summary {
  --bbva-text-dark-mode-highlight-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
}

hr[divider=small] {
  margin: 0.5rem 0rem 1rem;
  opacity: 0.4;
}
hr[divider=small]:first-of-type {
  margin: 1rem 0rem;
}
`;export{o as f,i as s};
