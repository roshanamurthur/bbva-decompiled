import{z as t,a8 as e,ac as a,ad as o,ab as r,an as i,ct as l,aN as n,ah as c,h as s,i as b,ak as d,bo as m,bp as u,bq as h,as as f,at as p,av as v,dI as y,aT as g,bb as $,dZ as _,ex as x,ai as I,L as S,aM as F,ey as A,ep as k,be as w,bF as E}from"./952f98a9.js";import{R as T,S as P,u as z,D as B,T as D,A as C,V,v as O,W as L,G as R,F as M,x as N,f as q,ex as j}from"./216055dc.js";import{B as U}from"./854beed0.js";import{b as H,B as W}from"./84dff06e.js";var X=t`
:host {
  position: relative;
  display: block;
  box-sizing: border-box;
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

.field {
  position: relative;
  height: 3rem;
  flex: auto;
  border-bottom: 0.125rem solid var(--_form-field-border-color);
  background-color: var(--_form-field-bg-color);
}
:host([focus-visible]:not(:focus)) .field.desktop {
  border-bottom-color: var(--_form-field-focused-border-color);
  outline: 0.125rem solid var(--_form-field-focus-border-color);
  outline-offset: 0.1875rem;
}
:host([invalid]:not([action-into-form])) .field {
  border-bottom-color: var(--_form-field-invalid-field-border-color);
  background-color: var(--_form-field-invalid-field-bg-color);
}

:host([field-size=S]) .field {
  height: 2.5rem;
}
:host([field-size=S]) .field .clear {
  top: -0.1875rem;
}
:host([field-size=S]) .field .label {
  top: -0.1875rem;
}

:host([field-size=L]) .field {
  height: 4rem;
}
:host([field-size=L]) .field .clear {
  top: 0.625rem;
}
:host([field-size=L]) .field .label {
  top: 0.625rem;
}

.slot-input ::slotted(input) {
  position: relative;
  width: 100%;
  max-width: calc(100% - 3rem);
  height: 100%;
  box-sizing: border-box;
  padding: 1.25rem 0 0.25rem 1rem;
  border: none;
  margin: 0;
  appearance: none;
  background-color: transparent;
  box-shadow: none;
  color: var(--_form-field-input-color);
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${e(a.typeSmall)}));
  outline: none;
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_form-field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

:host([clear-icon=""]) .slot-input ::slotted(input) {
  max-width: none;
  padding-right: 1rem;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: 0.25rem;
  color: var(--_form-field-input-placeholder-color);
}

.slot-input ::slotted(input:not(:focus):placeholder-shown) {
  opacity: 0;
}

:host([type=number]) .slot-input ::slotted(input) {
  -moz-appearance: textfield;
}

:host([type=search]) .slot-input ::slotted(input) {
  -webkit-appearance: textfield;
}

.label {
  position: absolute;
  top: 0;
  right: 1rem;
  left: 1rem;
  color: var(--_form-field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${e(a.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${e(r.book.fontWeight)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${e(o.typeSmall)}));
  transform: translateY(0.75rem);
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  will-change: transform;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_form-field-focused-label-color);
  transform: translateY(0.15rem) scale(0.8);
}
.label :host([invalid]) {
  color: var(--_form-field-invalid-field-label-color);
}
:host([readonly]) .label {
  color: var(--_form-field-readonly-label-color);
}

.label-out {
  display: flex;
  align-items: end;
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
}
.label-out [data-tag-name=bbva-button-default] {
  height: 1.5rem;
  padding: 0;
}

.clear {
  position: absolute;
  top: 4px;
  right: 0;
  display: none;
  margin: 0 0.5rem;
  --bbva-button-default--_ambient--link-color: var(--_form-field-action-icon-color);
}
:host([typing]) .clear {
  display: flex;
}

:host([invalid]) {
  /* Remove Firefox invalid inputs red border */
}
:host([invalid]) .slot-input ::slotted(input),
:host([invalid]) .slot-input ::slotted(input:invalid) {
  box-shadow: none;
  color: var(--_form-field-invalid-field-color);
}
:host([invalid]) .label {
  color: var(--_form-field-invalid-field-label-color);
}
:host([invalid]) .clear, :host([invalid]):host([action-into-form][action-variant]) .action {
  --bbva-button-default--_ambient--link-color: var(--_form-field-invalid-field-label-color);
  --bbva-button-default--_ambient--icon-no-background-color: var(--_form-field-invalid-error-icon-color);
  --bbva-button-default--_ambient--icon-no-background-color-active: var(--_form-field-invalid-error-icon-color);
}

:host([action-into-form]) .action {
  flex: 0 0 auto;
  --bbva-button-default--_ambient--link-color: var(--_form-field-action-icon-color);
}
:host([action-into-form]):host([action-variant=no-background]) .action {
  margin: 0 0.5rem 0 0;
}
:host([action-into-form]) .wrapper {
  display: flex;
  align-items: center;
  border-bottom: 2px solid var(--_form-field-border-color);
  background-color: var(--_form-field-bg-color);
}
:host([action-into-form]):host([invalid]) .field, :host([action-into-form]) .field {
  border-bottom: none;
  background-color: transparent;
}
:host([action-into-form]) .wrapper-action {
  display: flex;
  padding: 0.25rem 0.75rem 0.25rem 0.5rem;
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-type-icon] {
  fill: var(--_form-field-no-action-icon-color);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-type-icon][disabled] {
  color: unset;
}
:host([action-into-form]):host([readonly]) .wrapper-action [data-tag-name=bbva-type-icon] {
  fill: var(--_form-field-readonly-icon-color);
}
:host([action-into-form]):host([invalid]) .wrapper {
  border-bottom-color: var(--_form-field-invalid-field-border-color);
  background-color: var(--_form-field-invalid-field-bg-color);
}
:host([action-into-form]):host([invalid]) .wrapper-action [data-tag-name=bbva-type-icon] {
  fill: var(--_form-field-invalid-action-icon-color);
  --bbva-button-default--_ambient--color: var(--_form-field-invalid-action-icon-color);
}

:host(:not([action-into-form])) .wrapper .field {
  border-bottom: none;
  background-color: transparent;
}

:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: none;
}
:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: 0.125rem solid var(--_form-field-border-color);
}

:host([action-into-form][icon-variant][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: 0.125rem solid var(--_form-field-border-color);
}
:host([action-into-form][icon-variant][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: none;
}

.message {
  display: flex;
  align-items: flex-start;
  justify-content: flex-start;
  color: var(--_form-field-message-color);
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${e(a.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${e(o.type3XSmall)}));
}

.notification {
  padding-top: 0.5rem;
  margin-left: 1rem;
}

:host(:not([action-into-form])[disabled]) .field, :host([disabled]) [data-tag-name=bbva-type-icon], :host([disabled]) .wrapper {
  opacity: 0.4;
}
`,Y=t`
:host {
  --_form-field-bg-color:
      var(--bbva-form-field--_ambient--bg-color,
          var(--bbva-form-field--custom--primary-ambient--bg-color,
              ${T("colorPrimaryFormInputBackgroundDefault",P)}));
  --_form-field-input-color:
      var(--bbva-form-field--_ambient--input-color,
          var(--bbva-form-field--custom--primary-ambient--input-color,
              ${T("colorPrimaryFormInputFieldTextDefault",P)}));
  --_form-field-invalid-field-color:
      var(--bbva-form-field--_ambient--invalid-field-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-field-color,
              ${T("colorPrimaryFormInputFieldTextError",P)}));
  --_form-field-input-placeholder-color:
      var(--bbva-form-field--_ambient--input-placeholder-color,
          var(--bbva-form-field--custom--primary-ambient--input-placeholder-color,
              ${T("colorPrimaryFormInputPlaceholderDefault",P)}));
  --_form-field-readonly-input-color:
      var(--bbva-form-field--_ambient--readonly-input-color,
          var(--bbva-form-field--custom--primary-ambient--readonly-input-color,
              ${T("colorPrimaryFormInputPlaceholderDefault",P)}));
  --_form-field-label-color:
      var(--bbva-form-field--_ambient--label-color,
          var(--bbva-form-field--custom--primary-ambient--label-color,
              ${T("colorPrimaryFormInputPlaceholderDefault",P)}));
  --_form-field-focused-label-color:
      var(--bbva-form-field--_ambient--focused-label-color,
          var(--bbva-form-field--custom--primary-ambient--focused-label-color,
              ${T("colorPrimaryFormInputPlaceholderDefault",P)}));
  --_form-field-readonly-label-color:
      var(--bbva-form-field--_ambient--readonly-label-color,
          var(--bbva-form-field--custom--primary-ambient--readonly-label-color,
              ${T("colorPrimaryFormInputPlaceholderDefault",P)}));
  --_form-field-border-color:
      var(--bbva-form-field--_ambient--border-color,
          var(--bbva-form-field--custom--primary-ambient--border-color,
              ${T("colorPrimaryFormInputBorderInactive",P)}));
  --_form-field-focused-border-color:
      var(--bbva-form-field--_ambient--focused-border-color,
          var(--bbva-form-field--custom--primary-ambient--focused-border-color,
              ${T("colorPrimaryFormInputBorderActive",P)}));
  --_form-field-focus-border-color:
      var(--bbva-form-field--_ambient--focus-border-color,
          var(--bbva-form-field--custom--primary-ambient--focus-border-color,
              ${T("colorPrimarySurfaceAmbientFocus",P)}));
  --_form-field-invalid-field-bg-color:
      var(--bbva-form-field--_ambient--invalid-field-bg-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-field-bg-color,
              ${T("colorPrimaryFormInputBackgroundError",P)}));
  --_form-field-invalid-field-border-color:
      var(--bbva-form-field--_ambient--invalid-field-border-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-field-border-color,
              ${T("colorPrimaryFormInputBorderError",P)}));
  --_form-field-invalid-field-label-color:
      var(--bbva-form-field--_ambient--invalid-field-label-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-field-label-color,
              ${T("colorPrimaryFormInputPlaceholderError",P)}));
  --_form-field-action-icon-color:
      var(--bbva-form-field--_ambient--action-icon-color,
          var(--bbva-form-field--custom--primary-ambient--action-icon-color,
              ${T("colorPrimaryFormInputIconDefault",P)}));
  --_form-field-no-action-icon-color:
      var(--bbva-form-field--_ambient--no-action-icon-color,
          var(--bbva-form-field--custom--primary-ambient--no-action-icon-color,
              ${T("colorPrimaryFormInputIconReadOnly",P)}));
  --_form-field-invalid-action-icon-color:
      var(--bbva-form-field--_ambient--invalid-action-icon-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-action-icon-color,
              ${T("colorPrimaryFormInputPlaceholderError",P)}));
  --_form-field-readonly-icon-color:
      var(--bbva-form-field--_ambient--readonly-icon-color,
          var(--bbva-form-field--custom--primary-ambient--readonly-icon-color,
              ${T("colorPrimaryFormInputIconReadOnly",P)}));
  --_form-field-invalid-error-icon-color:
      var(--bbva-form-field--_ambient--invalid-error-icon-color,
          var(--bbva-form-field--custom--primary-ambient--invalid-error-icon-color,
              ${T("colorPrimaryFormInputIconError",P)}));
}
`;const Z=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-field--_ambient--bg-color: initial;
    --bbva-form-field--_ambient--input-placeholder-color: initial;
    --bbva-form-field--_ambient--invalid-field-color: initial;
    --bbva-form-field--_ambient--input-color: initial;
    --bbva-form-field--_ambient--readonly-input-color: initial;
    --bbva-form-field--_ambient--readonly-icon-color: initial;
    --bbva-form-field--_ambient--label-color: initial;
    --bbva-form-field--_ambient--focused-label-color: initial;
    --bbva-form-field--_ambient--readonly-label-color: initial;
    --bbva-form-field--_ambient--border-color: initial;
    --bbva-form-field--_ambient--focused-border-color: initial;
    --bbva-form-field--_ambient--focus-border-color: initial;
    --bbva-form-field--_ambient--invalid-field-bg-color: initial;
    --bbva-form-field--_ambient--invalid-field-border-color: initial;
    --bbva-form-field--_ambient--invalid-field-label-color: initial;
    --bbva-form-field--_ambient--action-icon-color: initial;
    --bbva-form-field--_ambient--no-action-icon-color: initial;
    --bbva-form-field--_ambient--invalid-action-icon-color: initial;
    --bbva-form-field--_ambient--invalid-error-icon-color: initial;
  }
`,K=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-field--_ambient--bg-color: var(
      --bbva-form-field--custom--primary-alt-ambient--bg-color,
      ${T("colorPrimaryAltFormInputBackgroundDefault",P)}
    );

    --bbva-form-field--_ambient--input-color: var(
      --bbva-form-field--custom--primary-alt-ambient--input-color,
      ${T("colorPrimaryAltFormInputFieldTextDefault",P)}
    );

    --bbva-form-field--_ambient--invalid-field-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-field-color,
      ${T("colorPrimaryAltFormInputFieldTextError",P)}
    );

    --bbva-form-field--_ambient--input-placeholder-color: var(
      --bbva-form-field--custom--primary-alt-ambient--input-placeholder-color,
      ${T("colorPrimaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--readonly-input-color: var(
      --bbva-form-field--custom--primary-alt-ambient--readonly-input-color,
      ${T("colorPrimaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--readonly-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--readonly-icon-color,
      ${T("colorPrimaryAltFormInputIconReadOnly",P)}
    );

    --bbva-form-field--_ambient--no-action-icon-color: var(
      --bbva-form-field--custom--primary-alt-ambient--no-action-icon-color,
      ${T("colorPrimaryAltFormInputIconReadOnly",P)}
    );

    --bbva-form-field--_ambient--label-color: var(
      --bbva-form-field--custom--primary-alt-ambient--label-color,
      ${T("colorPrimaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--focused-label-color: var(
      --bbva-form-field--custom--primary-alt-ambient--focused-label-color,
      ${T("colorPrimaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--readonly-label-color: var(
      --bbva-form-field--custom--primary-alt-ambient--readonly-label-color,
      ${T("colorPrimaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--border-color: var(
      --bbva-form-field--custom--primary-alt-ambient--border-color,
      ${T("colorPrimaryAltFormInputBorderInactive",P)}
    );

    --bbva-form-field--_ambient--focused-border-color: var(
      --bbva-form-field--custom--primary-alt-ambient--focused-border-color,
      ${T("colorPrimaryAltFormInputBorderActive",P)}
    );

    --bbva-form-field--_ambient--focus-border-color: var(
      --bbva-form-field--custom--primary-alt-ambient--focus-border-color,
      ${T("colorPrimaryAltSurfaceAmbientFocus",P)}
    );

    --bbva-form-field--_ambient--invalid-field-bg-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-field-bg-color,
      ${T("colorPrimaryAltFormInputBackgroundError",P)}
    );

    --bbva-form-field--_ambient--invalid-field-border-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-field-border-color,
      ${T("colorPrimaryAltFormInputBorderError",P)}
    );

    --bbva-form-field--_ambient--invalid-field-label-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-field-label-color,
      ${T("colorPrimaryAltFormInputPlaceholderError",P)}
    );

    --bbva-form-field--_ambient--action-icon-color: var(
      --bbva-form-field--custom--primary-alt-ambient--action-icon-color,
      ${T("colorPrimaryAltFormInputIconDefault",P)}
    );

    --bbva-form-field--_ambient--invalid-action-icon-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-action-icon-color,
      ${T("colorPrimaryAltFormInputPlaceholderError",P)}
    );

    --bbva-form-field--_ambient--invalid-error-icon-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-error-icon-color,
        ${T("colorPrimaryAltFormInputIconError",P)}
    );
  }
`,G=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-field--_ambient--bg-color: var(
      --bbva-form-field--custom--secondary-ambient--bg-color,
      ${T("colorSecondaryFormInputBackgroundDefault",P)}
    );

    --bbva-form-field--_ambient--input-color: var(
      --bbva-form-field--custom--secondary-ambient--input-color,
      ${T("colorSecondaryFormInputFieldTextDefault",P)}
    );

    --bbva-form-field--_ambient--invalid-field-color: var(
      --bbva-form-field--custom--primary-alt-ambient--invalid-field-color,
      ${T("colorSecondaryFormInputFieldTextError",P)}
    );

    --bbva-form-field--_ambient--input-placeholder-color: var(
      --bbva-form-field--custom--secondary-ambient--input-placeholder-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--readonly-input-color: var(
      --bbva-form-field--custom--secondary-ambient--readonly-input-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--label-color: var(
      --bbva-form-field--custom--secondary-ambient--label-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--focused-label-color: var(
      --bbva-form-field--custom--secondary-ambient--focused-label-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--readonly-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--readonly-icon-color,
      ${T("colorSecondaryFormInputIconReadOnly",P)}
    );

    --bbva-form-field--_ambient--readonly-label-color: var(
      --bbva-form-field--custom--secondary-ambient--readonly-label-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--border-color: var(
      --bbva-form-field--custom--secondary-ambient--border-color,
      ${T("colorSecondaryFormInputBorderInactive",P)}
    );

    --bbva-form-field--_ambient--focused-border-color: var(
      --bbva-form-field--custom--secondary-ambient--focused-border-color,
      ${T("colorSecondaryFormInputBorderActive",P)}
    );

    --bbva-form-field--_ambient--focus-border-color: var(
      --bbva-form-field--custom--secondary-ambient--focus-border-color,
      ${T("colorSecondarySurfaceAmbientFocus",P)}
    );

    --bbva-form-field--_ambient--invalid-field-bg-color: var(
      --bbva-form-field--custom--secondary-ambient--invalid-field-bg-color,
      ${T("colorSecondaryFormInputBackgroundError",P)}
    );

    --bbva-form-field--_ambient--invalid-field-border-color: var(
      --bbva-form-field--custom--secondary-ambient--invalid-field-border-color,
      ${T("colorSecondaryFormInputBorderError",P)}
    );

    --bbva-form-field--_ambient--invalid-field-label-color: var(
      --bbva-form-field--custom--secondary-ambient--invalid-field-label-color,
      ${T("colorSecondaryFormInputPlaceholderError",P)}
    );

    --bbva-form-field--_ambient--action-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--action-icon-color,
      ${T("colorSecondaryFormInputIconDefault",P)}
    );

    --bbva-form-field--_ambient--no-action-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--no-action-icon-color,
      ${T("colorSecondaryFormInputIconReadOnly",P)}
    );

    --bbva-form-field--_ambient--invalid-action-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--invalid-action-icon-color,
      ${T("colorSecondaryFormInputPlaceholderError",P)}
    );

    --bbva-form-field--_ambient--invalid-error-icon-color: var(
      --bbva-form-field--custom--secondary-ambient--invalid-error-icon-color,
        ${T("colorSecondaryFormInputIconError",P)}
    );
  }
`,Q=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-field--_ambient--bg-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--bg-color,
      ${T("colorSecondaryAltFormInputBackgroundDefault",P)}
    );

    --bbva-form-field--_ambient--input-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--input-color,
      ${T("colorSecondaryAltFormInputFieldTextDefault",P)}
    );

    --bbva-form-field--_ambient--invalid-field-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-field-color,
      ${T("colorSecondaryAltFormInputFieldTextError",P)}
    );

    --bbva-form-field--_ambient--input-placeholder-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--input-placeholder-color,
      ${T("colorSecondaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--readonly-input-color: var(
      --bbva-form-field--custom--secondary-ambient--readonly-input-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--readonly-icon-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--readonly-icon-color,
      ${T("colorSecondaryAltFormInputIconReadOnly",P)}
    );

    --bbva-form-field--_ambient--label-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--label-color,
      ${T("colorSecondaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--focused-label-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--focused-label-color,
      ${T("colorSecondaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--readonly-label-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--readonly-label-color,
      ${T("colorSecondaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-field--_ambient--border-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--border-color,
      ${T("colorSecondaryAltFormInputBorderInactive",P)}
    );

    --bbva-form-field--_ambient--focused-border-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--focused-border-color,
      ${T("colorSecondaryAltFormInputBorderActive",P)}
    );

    --bbva-form-field--_ambient--focus-border-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--focus-border-color,
      ${T("colorSecondaryAltSurfaceAmbientFocus",P)}
    );

    --bbva-form-field--_ambient--invalid-field-bg-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-field-bg-color,
      ${T("colorSecondaryAltFormInputBackgroundError",P)}
    );

    --bbva-form-field--_ambient--invalid-field-border-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-field-border-color,
      ${T("colorSecondaryAltFormInputBorderError",P)}
    );

    --bbva-form-field--_ambient--invalid-field-label-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-field-label-color,
      ${T("colorSecondaryAltFormInputPlaceholderError",P)}
    );

    --bbva-form-field--_ambient--action-icon-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--action-icon-color,
      ${T("colorSecondaryAltFormInputIconDefault",P)}
    );

    --bbva-form-field--_ambient--no-action-icon-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--no-action-icon-color,
      ${T("colorSecondaryAltFormInputIconReadOnly",P)}
    );

    --bbva-form-field--_ambient--invalid-action-icon-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-action-icon-color,
      ${T("colorSecondaryAltFormInputPlaceholderError",P)}
    );

    --bbva-form-field--_ambient--invalid-error-icon-color: var(
      --bbva-form-field--custom--secondary-alt-ambient--invalid-error-icon-color,
        ${T("colorSecondaryAltFormInputIconError",P)}
    );
  }
`;const J=z([Object.freeze({__proto__:null,primary:Z,primaryAlt:K,secondary:G,secondaryAlt:Q}),B,D,C,V]),tt=Object.values(J);class et extends(O(i(L(l)))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-type-text":R,"bbva-notification-help":M,"bbva-type-icon":N,"bbva-button-default":q}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},accessibleDescription:{type:String,attribute:"accessible-description"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},iconVariant:{type:String,attribute:"icon-variant"},fieldSize:{type:String,attribute:"field-size"},_desktop:{type:Boolean,state:!0},resetValue:{type:Boolean,attribute:"reset-value"},customUpdateValue:{type:Boolean,attribute:"custom-update-value"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=16,this.actionAccessibleText="bbva-form-input-field-submit",this.actionIntoForm=!1,this.clearIcon="",this.clearIconSize=24,this.clearAccessibleText="bbva-form-input-field-clear",this.optionalLabel="bbva-form-input-field-optional-label",this.errorIcon=n(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=c(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1,this.fieldSize="M",this._desktop=!1,this.customUpdateValue=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("bbva-core-input-validate",this._dispatchInputValidate)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("bbva-core-input-validate",this._dispatchInputValidate)}_dispatchInputValidate(){this.dispatchEvent(new CustomEvent("form-field-input-validate",{detail:{invalid:this.invalid},bubbles:!0,composed:!0}))}firstUpdated(t){super.firstUpdated(t),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const e=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",e.style.display="none",e.innerHTML=this.inputInnerStyles,this.appendChild(e)}updated(t){super.updated(t),t.has("value")&&(this.autoValidate||void 0===t.get("value")||(this.invalid=this.required?this._isEmpty:this.invalid),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""),this._isEmpty||this.disabled||this.readonly?this.removeAttribute("typing"):this.setAttribute("typing",""),this.customUpdateValue&&this.dispatchEvent(new CustomEvent("form-input-custom-update-value",{detail:{value:this.value},bubbles:!0,composed:!0}))),t.has("resetValue")&&this.resetValue&&this.clearInput()}get _errorVisible(){return this.errorMessage&&this.invalid}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}get accessibleDescriptionMessage(){const t=this.invalid?this.errorMessage:"";return t&&this.infoMessage?`${t}. ${this.infoMessage}`:t||this.infoMessage||this.accessibleDescription}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.t(this.label)}`:`${this.t(this.label)} ${this.t(this.optionalLabel)}`}get _input(){return s`
      <span class="slot-input">
        <slot name="_input"></slot>
      </span>

      <input
        tabindex="${this.readonly?"-1":"0"}"
        aria-describedby="description${this._formElementId}"
        aria-label="${this.inputLabel}"
        autocomplete="${this._autocomplete}"
        ?disabled="${this.disabled}"
        form="${b(this.form)}"
        id="${this._formElementId}"
        @input="${this._onInputInput}"
        @change="${this._onInputChange}"
        @keypress="${this._onInputKeypress}"
        @keydown="${this._keydown}"
        max="${b(this.max)}"
        maxlength="${b(this.maxlength)}"
        min="${b(this.min)}"
        minlength="${b(this.minlength)}"
        name="${b(this.name)}"
        pattern="${b(this.pattern)}"
        placeholder="${b(this.placeholder)}"
        ?readonly="${this.readonly}"
        ?required="${this.required}"
        slot="_input"
        step="${b(this.step)}"
        type="${this.type}"
        .value="${this.value}"
      />

      <span style="display: none;" slot="_input" id="description${this._formElementId}"
        >${this.accessibleDescriptionMessage}</span
      >
    `}get _helpIcon(){return this.helpIcon?s`
          <bbva-button-default
            @click="${this._helpClicked}"
            variant="icon no-background"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            aria-label="${this.t("bbva-form-input-field-help-text")}"
          >
          </bbva-button-default>
        `:""}get _labelOut(){return this.labelOut?s`
        <div class="label-out">
          <bbva-type-text
            id="labelOutText"
            unset
            tag="legend"
            text=${this.required?`${this.t(this.labelOut)}`:`${this.t(this.labelOut)} ${this.t(this.optionalLabel)}`}
            size="S"
            font-weight="500"
          >
          </bbva-type-text>
          ${this._helpIcon}
        </div>
      `:""}static get styles(){return[super.styles,X,Y,tt,d("bbva-form-input-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return s`
      <div
        class="field ${this._desktop?"desktop":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
        @keydown="${this._keydown}"
      >
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return s`
      <div
        class="wrapper"
        @keydown="${t=>13===t.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field} ${!this.iconVariant&&this.actionType?this.actionButton:this.rightIcon}
      </div>
    `}get clearButton(){return this.clearIcon?s`
          <bbva-button-default
            tabindex="0"
            class="clear"
            .icon="${this.clearIcon}"
            .size="${this.clearIconSize}"
            @click="${this.clearInput}"
            variant="icon no-background"
            aria-label="${this.t(this.clearAccessibleText)}"
          >
          </bbva-button-default>
        `:""}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return s` <bbva-button-default
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      variant="icon${this.actionVariant?` ${this.actionVariant}`:""}"
    >
    </bbva-button-default>`}get rightIcon(){return this.actionIcon?s`
          <div class="wrapper-action">
            <bbva-type-icon
              .icon="${this.actionIcon}"
              .size="${this.actionIconSize}"
            ></bbva-type-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?s`
          <div class="message error" role="alert">
            <bbva-notification-help
              variant="alert"
              class="message-error notification"
              accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-alert-icon")}"
              icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              text=${this.t(this.errorMessage)}
              disabled-tabindex
            ></bbva-notification-help>
          </div>
        `:""}get messageInfo(){return this.infoMessage?s`
          <bbva-notification-help
            class="notification"
            accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-info-icon")}"
            .icon="${this.infoIcon}"
            text=${this.t(this.infoMessage)}
            disabled-tabindex
          ></bbva-notification-help>
        `:""}get labelBlock(){return s`
      <bbva-type-text
        unset
        size="2XS"
        tag="label"
        for="${this._formElementId}"
        text="${this.inputLabel}"
        class="label"
        aria-hidden="true"
        @click="${this.focus}"
      ></bbva-type-text>
    `}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const t=this._rootNode.activeElement,e=this.shadowRoot.activeElement||t;this._field.contains(e)||t===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus",{detail:!0,bubbles:!0,composed:!0}))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur",{detail:!0,bubbles:!0,composed:!0}))}_keydown(){this.removeAttribute("focus-visible")}clearInput(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus(),this.resetValue=!1}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return s`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}}var at=t`
@charset "UTF-8";
:host {
  display: block;
  box-sizing: border-box;
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

.slot-input ::slotted(input) {
  padding-left: 1rem;
}

.back {
  position: absolute;
  top: 0;
  left: 0;
  display: flex;
  width: 100%;
  height: 100%;
  align-items: center;
  padding: 0.75rem 1rem 0.75rem;
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${e(a.typeSmall)}));
}
:host([focused]) .back, :host([filled]) .back {
  padding: 1.25rem 1rem 0.25rem;
}
.back-amount {
  flex: auto;
  opacity: 0;
}
:host([focused]) .back-amount, :host([filled]) .back-amount {
  max-width: calc(100% - 3rem);
  flex: none;
}
.back-currency {
  order: 1;
  color: var(--_form-amount-currency-color);
}
:host([readonly]) .back-currency {
  color: var(--_form-amount-readonly-currency-color);
}
.back-currency::before {
  content: " ";
}
:host([focused]) .back-currency, :host([filled]) .back-currency {
  order: -1;
}
:host([focused]) .back-currency::before, :host([filled]) .back-currency::before {
  content: " ";
}
:host([focused]) .back-currency.right, :host([filled]) .back-currency.right {
  order: 1;
}
:host([focused]) .back-currency.hide-currency, :host([filled]) .back-currency.hide-currency {
  opacity: 0;
}
:host([focused]) .back-currency:not(.right)::after, :host([focused]) .back-currency.right::before, :host([filled]) .back-currency:not(.right)::after, :host([filled]) .back-currency.right::before {
  content: " ";
}

:host([invalid]) .back-currency,
:host([focused][invalid]) .back-currency {
  color: var(--_form-amount-currency-invalid-color);
}

:host([invalid][auto-validate]) .back-currency {
  color: var(--_form-amount-currency-invalid-auto-validate-color);
}

.with-clip .slot-input ::slotted(input) {
  padding-left: 5rem;
}
.with-clip .label {
  left: 5rem;
}
:host([focused]) .with-clip .back, :host([filled]) .with-clip .back {
  padding-left: 5rem;
}

.clip {
  position: absolute;
  display: inline-flex;
  height: 100%;
  align-items: center;
  margin: 0 1rem;
}

.lines {
  font-weight: 600;
}
`,ot=t`
:host {
  --_form-amount-currency-color:
      var(--bbva-form-amount--_ambient--currency-color,
          var(--bbva-form-amount--custom--primary-ambient--currency-color,
              ${T("colorPrimaryFormInputPlaceholderDefault",P)}));
  --_form-amount-readonly-currency-color:
          var(--bbva-form-amount--_ambient--readonly-currency-color,
              var(--bbva-form-amount--custom--primary-ambient--readonly-currency-color,
                  ${T("colorPrimaryFormInputPlaceholderDefault",P)}));
  --_form-amount-currency-invalid-color:
          var(--bbva-form-amount--_ambient--currency-invalid-color,
              var(--bbva-form-amount--custom--primary-ambient--currency-invalid-color,
                  ${T("colorPrimaryFormInputPlaceholderError",P)}));
  --_form-amount-currency-invalid-auto-validate-color:
          var(--bbva-form-amount--_ambient--currency-invalid-auto-validate-color,
              var(--bbva-form-amount--custom--primary-ambient--currency-invalid-auto-validate-color,
                  ${T("colorPrimaryFormInputFieldTextError",P)}));
}
`;const rt=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-amount--_ambient--currency-color: initial;
    --bbva-form-amount--_ambient--readonly-currency-color: initial;
    --bbva-form-amount--_ambient--currency-invalid-color: initial;
    --bbva-form-amount--_ambient--currency-invalid-auto-validate-color: initial;
  }
`,it=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-amount--_ambient--currency-color: var(
      --bbva-form-amount--custom--primary-alt-ambient--currency-color,
      ${T("colorPrimaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-amount--_ambient--readonly-currency-color: var(
      --bbva-form-amount--custom--primary-alt-ambient--readonly-currency-color,
      ${T("colorPrimaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-amount--_ambient--currency-invalid-color: var(
      --bbva-form-amount--custom--primary-alt-ambient--currency-invalid-color,
      ${T("colorPrimaryAltFormInputFieldTextError",P)}
    );

    --bbva-form-amount--_ambient--currency-invalid-auto-validate-color: var(
      --bbva-form-amount--custom--primary-alt-ambient--currency-invalid-auto-validate-color,
      ${T("colorPrimaryAltFormInputFieldTextError",P)}
    );
  }
`,lt=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-amount--_ambient--currency-color: var(
      --bbva-form-amount--custom--secondary-ambient--currency-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-amount--_ambient--readonly-currency-color: var(
      --bbva-form-amount--custom--secondary-ambient--readonly-currency-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-amount--_ambient--currency-invalid-color: var(
      --bbva-form-amount--custom--secondary-ambient--currency-invalid-color,
      ${T("colorSecondaryFormInputPlaceholderError",P)}
    );

    --bbva-form-amount--_ambient--currency-invalid-auto-validate-color: var(
      --bbva-form-amount--custom--secondary-ambient--currency-invalid-auto-validate-color,
      ${T("colorSecondaryFormInputFieldTextError",P)}
    );
  }
`,nt=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-amount--_ambient--currency-color: var(
      --bbva-form-amount--custom--secondary-alt-ambient--currency-color,
      ${T("colorSecondaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-amount--_ambient--readonly-currency-color: var(
      --bbva-form-amount--custom--secondary-alt-ambient--readonly-currency-color,
      ${T("colorSecondaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-amount--_ambient--currency-invalid-color: var(
      --bbva-form-amount--custom--secondary-alt-ambient--currency-invalid-color,
      ${T("colorSecondaryAltFormInputPlaceholderError",P)}
    );

    --bbva-form-amount--_ambient--currency-invalid-auto-validate-color: var(
      --bbva-form-amount--custom--secondary-alt-ambient--currency-invalid-auto-validate-color,
      ${T("colorSecondaryAltFormInputFieldTextError",P)}
    );
  }
`;const ct=z([Object.freeze({__proto__:null,primary:rt,primaryAlt:it,secondary:lt,secondaryAlt:nt}),J,H]),st=Object.values(ct);m(),u(),h();const bt={apple:{logo:"applepay",text:"bbva-clip-card-pay-compatibility-apple"},google:{logo:"googlepay",text:"bbva-clip-card-pay-compatibility-google"}};class dt extends(f(p(O(i(et))))){static get is(){return"bbva-form-amount"}static get scopedElements(){return{"bbva-type-text":R,"bbva-notification-help":M,"bbva-type-icon":N,"bbva-button-default":q,"bbva-clip-flag":U,"bbva-clip-card":W}}static get properties(){return{flag:{type:String},showCard:{type:Boolean,attribute:"show-card"},flagLabel:{type:String,attribute:"flag-label"},cardStatus:{type:String,attribute:"card-status",reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},cardVariant:{type:String,attribute:"card-variant"},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},accessibilityText:{type:String,attribute:"accessibility-text"},accessibleDescription:{type:String,attribute:"accessible-description"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},partnerLogo:{type:String,attribute:"partner-logo"},partnerLogoVariant:{type:String,attribute:"partner-logo-variant"},partner:{type:Boolean},_currencyBlock:{type:Object},_isFocused:{type:Boolean}}}constructor(){super(),this.flag="",this.flagLabel="",this.cardType="",this.cardVariant="",this.showCard=!1,this.cardStatus="",this.partner=!1,this.cardImage="",this.payCompatibility="",this.payCompatibilityInfo=bt,this.accessibilityText="bbva-form-input-amount-clip-card-image",this._currencyBlock={},this._isFocused=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._focusIn=this._focusIn.bind(this),this._focusOut=this._focusOut.bind(this),this.addEventListener("blur",this._focusOut),this.addEventListener("focusout",this._focusOut),this.addEventListener("focusin",this._focusIn)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("blur",this._focusOut),this.removeEventListener("focusout",this._focusOut),this.removeEventListener("focusin",this._focusIn)}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._currencyBlock=this.shadowRoot.querySelector(".back-currency")}updated(t){super.updated&&super.updated(t),t.has("language")&&(this.allowedPattern=`[0-9${this._separator}${this._groupChar}]`),t.has("value")&&(this.value.charAt(this.value.length-1)===this._groupChar?this.value=this.value.substring(0,this.value.length-1)+this._separator:(this._setCurrencyWidth(),this.formatValue(this.value)))}static get styles(){return[super.styles,at,ot,st,d("bbva-form-amount-shared-styles")]}get amount(){return this.value?Number(this.value.replace(new RegExp(`\\${this._groupChar}`,"g"),"").replace(new RegExp(`\\${this._separator}`),".")):0}set amount(t){Number.isFinite(t)&&(this.value=this._stringifyAmount(t))}_stringifyAmount(t){return String(t).replace(/\./g,this._separator)}get flagBlock(){return s`
      ${this.flag?s`
            <span class="clip">
              <bbva-clip-flag icon="${b(this.flag)}" size="small"></bbva-clip-flag>
            </span>
          `:""}
    `}get cardBlock(){return s`
      ${this.showCard?s`
            <span class="clip">
              <bbva-clip-card
                size="s"
                status="${this.cardStatus}"
                card-type="${this.cardType}"
                variant="${this.cardVariant}"
                pay-compatibility="${this.payCompatibility}"
                card-image="${this.cardImage}"
                accessibility-text="${this.t(this.accessibilityText)}"
                ?partner="${this.partner}"
                partner-logo="${b(this.partnerLogo)}"
                partner-logo-variant="${b(this.partnerLogoVariant)}"
                disabled-tabindex
              ></bbva-clip-card>
            </span>
          `:""}
    `}get _isRightAligned(){return this._alignRight}get inputLabel(){return`${this.label}`}get field(){return s`
      <div
        class="field ${this.flag||this.showCard?"with-clip":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.cardBlock}${this.backAmount} ${this.labelledInput}
        ${this.clearButton}
      </div>
    `}get backAmount(){return s`
      <span class="back" aria-hidden="true">
        <span
          class="back-currency ${v({right:this._isRightAligned,"hide-currency":this.placeholder&&!this.value})}"
        >
          ${this._currency}
        </span>
        <span class="back-amount">${this.value}</span>
      </span>
    `}_setCurrencyWidth(){const e=this._currencyBlock.offsetWidth,a=this._isRightAligned?0:e,o=t`
      ${a/16}rem
    `,r=t`
      calc(100% - ${e+48}px)
    `;this._formElement.style.setProperty("margin-left",o),this._formElement.style.setProperty("max-width",r)}_formatNumber(t,e){return e?t.replace(/\D/g,"").replace(/\B(?=(\d{3})+(?!\d))/g,this._groupChar):t.replace(/\D/g,"")}_formatCurrency(t,e){let a;if(t.indexOf(e)>=0){const o=t.indexOf(e);let r=t.substring(0,o),i=t.substring(o);r=this._formatNumber(r,!0),i=this._formatNumber(i,!1),i=i.substring(0,this.decimalDigits),a=this.decimalDigits?r+e+i:r}else a=this._formatNumber(t,!0);return a}formatValue(t){if(""===t||null==t)return void this._fireChange(t,this.amount);const e=String(t),a=this._formElement,o=e.length;let r=a.selectionStart;const i=this._formatCurrency(e,this._separator);if(a.value=i,e===i&&this._fireChange(i,this.amount),this.value=a.value,this._isFocused){r=i.length-o+r,a.setSelectionRange(r,r)}}_checkTrailingDecimal(){this.value&&this.value.endsWith(this._separator)&&(this.value=this.value.replace(this._separator,""))}_focusIn(){this._isFocused=!0}_focusOut(){this._isFocused=!1,this._checkTrailingDecimal()}_fireChange(t,e){this.dispatchEvent(new CustomEvent("form-amount-input-change",{detail:{value:t,amount:e},bubbles:!0,composed:!0}))}}var mt=t`
:host {
  display: block;
  box-sizing: border-box;
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
`;const ut=z([J]),ht=Object.values(ut);class ft extends(O(et)){static get is(){return"bbva-form-attach"}static get properties(){return{inputType:{type:String,attribute:"input-type"},accessibleDescription:{type:String,attribute:"accessible-description"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"}}}constructor(){super(),this.actionIcon="",this.actionIntoForm=!0,this.actionType="submit",this.actionVariant="no-background",this.inputType=""}static get styles(){return[super.styles,mt,ht,d("bbva-form-attach-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.actionIcon=this._icons}get _icons(){const t={camera:y(),contact:g()};return this.inputType in t&&t[this.inputType]}}var pt=t`
:host {
  display: block;
  box-sizing: border-box;
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

.with-flag .slot-input ::slotted(input) {
  padding-left: 5rem;
}
.with-flag .label {
  left: 5rem;
}

.flag {
  position: absolute;
  display: inline-flex;
  height: 100%;
  align-items: center;
  margin: 0 1rem;
}
`;const vt=z([J]),yt=Object.values(vt);class gt extends(O(et)){static get is(){return"bbva-form-text"}static get scopedElements(){return{"bbva-clip-flag":U,"bbva-type-icon":N,"bbva-type-text":R,"bbva-notification-help":M,"bbva-button-default":q}}static get properties(){return{flag:{type:String},flagLabel:{type:String,attribute:"flag-label"},accessibleDescription:{type:String,attribute:"accessible-description"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"}}}constructor(){super(),this.type="text"}static get styles(){return[super.styles,pt,yt,d("bbva-form-text-shared-styles")]}get field(){return s`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return s`
      ${this.flag?s`
            <span class="flag">
              <bbva-clip-flag icon="${b(this.flag)}" size="small"></bbva-clip-flag>
            </span>
          `:""}
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}var $t=t`
:host {
  display: block;
  box-sizing: border-box;
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

.slot-input ::slotted(input) {
  padding-right: 3rem;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: 100%;
}
:host(:not([filled])) .slot-input ::slotted(input) {
  opacity: 0;
}
:host([readonly][filled]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input), :host([focused]) .slot-input ::slotted(input) {
  opacity: 1;
}

.clear {
  display: flex;
  width: 2.5rem;
  height: 2.5rem;
  align-items: center;
  justify-content: center;
}
.clear [data-tag-name=bbva-type-icon] {
  fill: var(--_form-date-clear-icon-color);
}

:host([invalid]) .clear [data-tag-name=bbva-type-icon] {
  fill: var(--_form-date-invalid-clear-icon-color);
}

:host([readonly]) .clear [data-tag-name=bbva-type-icon] {
  color: var(--_form-date-readonly-clear-icon-color);
}
`,_t=t`
:host {
  --_form-date-clear-icon-color:
      var(--bbva-form-date--_ambient--clear-icon-color,
          var(--bbva-form-date--custom--primary-ambient--clear-icon-color,
          ${T("colorPrimaryFormInputIconReadOnly",P)}));
  --_form-date-readonly-clear-icon-color:
      var(--bbva-form-date--_ambient--readonly-clear-icon-color,
          var(--bbva-form-date--custom--primary-ambient--readonly-clear-icon-color,
              ${T("colorPrimaryFormInputIconReadOnly",P)}));
  --_form-date-invalid-clear-icon-color:
      var(--bbva-form-date--_ambient--invalid-clear-icon-color,
          var(--bbva-form-date--custom--primary-ambient--invalid-clear-icon-color,
              ${T("colorPrimaryFormInputIconError",P)}));
}
`;const xt=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-date--_ambient--clear-icon-color: initial;
    --bbva-form-date--_ambient--readonly-clear-icon-color: initial;
    --bbva-form-date--_ambient--invalid-clear-icon-color: initial;
  }
`,It=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-date--_ambient--clear-icon-color: var(
      --bbva-form-date--custom--primary-alt-ambient--clear-icon-color,
      ${T("colorPrimaryAltFormInputIconReadOnly",P)}
    );

    --bbva-form-date--_ambient--readonly-clear-icon-color: var(
      --bbva-form-date--custom--primary-alt-ambient--readonly-clear-icon-color,
      ${T("colorPrimaryAltFormInputIconReadOnly",P)}
    );

    --bbva-form-date--_ambient--invalid-clear-icon-color: var(
      --bbva-form-date--custom--primary-alt-ambient--invalid-clear-icon-color,
      ${T("colorPrimaryAltFormInputIconError",P)}
    );
  }
`,St=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-date--_ambient--clear-icon-color: var(
      --bbva-form-date--custom--secondary-ambient--clear-icon-color,
      ${T("colorSecondaryFormInputIconReadOnly",P)}
    );

    --bbva-form-date--_ambient--readonly-clear-icon-color: var(
      --bbva-form-date--custom--secondary-ambient--readonly-clear-icon-color,
      ${T("colorSecondaryFormInputIconReadOnly",P)}
    );

    --bbva-form-date--_ambient--invalid-clear-icon-color: var(
      --bbva-form-date--custom--secondary-ambient--invalid-clear-icon-color,
      ${T("colorSecondaryFormInputIconError",P)}
    );
  }
`,Ft=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-date--_ambient--clear-icon-color: var(
      --bbva-form-date--custom--secondary-alt-ambient--clear-icon-color,
      ${T("colorSecondaryAltFormInputIconReadOnly",P)}
    );

    --bbva-form-date--_ambient--readonly-clear-icon-color: var(
      --bbva-form-date--custom--secondary-alt-ambient--readonly-clear-icon-color,
      ${T("colorSecondaryAltFormInputIconReadOnly",P)}
    );

    --bbva-form-date--_ambient--invalid-clear-icon-color: var(
      --bbva-form-date--custom--secondary-alt-ambient--invalid-clear-icon-color,
      ${T("colorSecondaryAltFormInputIconError",P)}
    );
  }
`;const At=z([Object.freeze({__proto__:null,primary:xt,primaryAlt:It,secondary:St,secondaryAlt:Ft}),D,J]),kt=Object.values(At);class wt extends(O(et)){static get is(){return"bbva-form-date"}static get scopedElements(){return{"bbva-type-icon":N,"bbva-type-text":R,"bbva-notification-help":M,"bbva-button-default":q}}constructor(){super(),this.type="date",this.clearIcon=$()}static get styles(){return[super.styles,$t,_t,kt,d("bbva-form-date-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return s`
      <div
        class="field"
        @keydown="${this._onFocusin}"
        @click="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n      input::-webkit-date-and-time-value{ \n        text-align:left; \n      }\n    `}get clearIconBlock(){return s`
      <span class="clear">
        <bbva-type-icon .icon="${this.clearIcon}" .size="${this.clearIconSize}"></bbva-type-icon>
      </span>
    `}}var Et=t`
:host {
  display: block;
  box-sizing: border-box;
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

.with-flag .slot-input ::slotted(input) {
  padding-left: 5rem;
}
.with-flag .label {
  left: 5rem;
}

.flag {
  position: absolute;
  display: inline-flex;
  height: 100%;
  align-items: center;
  margin: 0 1rem;
}
`;const Tt=z([J]),Pt=Object.values(Tt);class zt extends(O(et)){static get is(){return"bbva-form-number"}static get scopedElements(){return{"bbva-clip-flag":U,"bbva-type-text":R,"bbva-type-icon":N,"bbva-notification-help":M,"bbva-button-default":q}}static get properties(){return{flag:{type:String},flagLabel:{type:String,attribute:"flag-label"},accessibleDescription:{type:String,attribute:"accessible-description"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"}}}constructor(){super(),this.type="number"}static get styles(){return[super.styles,Et,Pt,d("bbva-form-number-shared-styles")]}get field(){return s`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return s`
      ${this.flag?s`
            <span class="flag">
              <bbva-clip-flag icon="${b(this.flag)}" size="small"></bbva-clip-flag>
            </span>
          `:""}
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}var Bt=t`
:host {
  display: block;
  box-sizing: border-box;
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

.wrapper {
  display: flex;
}

.field {
  flex: auto;
}
`;const Dt=z([J,V]),Ct=Object.values(Dt);class Vt extends(O(i(et))){static get is(){return"bbva-form-search"}static get scopedElements(){return{"bbva-type-icon":N,"bbva-type-text":R,"bbva-notification-help":M,"bbva-button-default":q}}static get properties(){return{disabledButton:{type:Boolean,attribute:"disabled-button"},focused:{type:Boolean},variant:{type:String},iconVariant:{type:String,attribute:"icon-variant"},accessibleDescription:{type:String,attribute:"accessible-description"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"}}}constructor(){super(),this.type="search",this.actionType="submit",this.actionIcon=_(),this.actionAccessibleText="bbva-form-input-search-submit",this.actionIntoForm=!0}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.actionIcon=this._icons}firstUpdated(t){super.firstUpdated(t),this._field=this.shadowRoot.querySelector(".field"),this._action=this.shadowRoot.querySelector(".action")}updated(t){super.updated&&super.updated(t),t.has("variant")&&"trigger"===this.variant&&this._field.addEventListener("click",this.handleInputClick),(t.has("value")||t.has("focused"))&&(this.disabledButton=!this.value&&!this.focused)}static get styles(){return[super.styles,Bt,Ct,d("bbva-form-search-shared-styles")]}handleInputClick(){this.dispatchEvent(new CustomEvent("form-search-input-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.value&&this.dispatchEvent(new CustomEvent("form-search-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}get _icons(){const t={access:x(),search:_()};return this.iconVariant in t?t[this.iconVariant]:t.search}}var Ot=t`
:host {
  display: block;
  box-sizing: border-box;
}

.clear {
  display: flex;
  width: 3rem;
  height: 3rem;
  align-items: center;
  justify-content: center;
}
.clear [data-tag-name=bbva-type-icon] {
  fill: var(--_form-time-clear-icon-color);
}

:host([invalid]) .clear [data-tag-name=bbva-type-icon] {
  fill: var(--_form-time-invalid-clear-icon-color);
}

:host([readonly]) .clear [data-tag-name=bbva-type-icon] {
  color: var(--_form-time-readonly-clear-color);
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

.slot-input ::slotted(input) {
  padding-right: 3rem;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: 100%;
}
:host(:not([filled])) .slot-input ::slotted(input) {
  opacity: 0;
}
:host([readonly][filled]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input), :host([focused]) .slot-input ::slotted(input) {
  opacity: 1;
}
`,Lt=t`
:host {
  --_form-time-clear-icon-color:
      var(--bbva-form-time--_ambient--clear-icon-color,
          var(--bbva-form-time--custom--primary-ambient--clear-icon-color,
              ${T("colorPrimaryFormInputIconReadOnly",P)}));
  --_form-time-invalid-clear-icon-color:
  var(--bbva-form-time--_ambient--invalid-clear-icon-color,
      var(--bbva-form-time--custom--primary-ambient--invalid-clear-icon-color,
          ${T("colorPrimaryFormInputIconError",P)}));
  --_form-time-readonly-clear-color:
      var(--bbva-form-time--_ambient--readonly-clear-color,
          var(--bbva-form-time--custom--primary-ambient--readonly-clear-color,
              ${T("colorPrimaryFormInputIconReadOnly",P)}));
}
`;const Rt=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-time--_ambient--clear-icon-color: initial;
    --bbva-form-time--_ambient--invalid-clear-icon-color: initial;
    --bbva-form-time--_ambient--readonly-clear-color: initial;
  }
`,Mt=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-time--_ambient--clear-icon-color: var(
      --bbva-form-time--custom--primary-alt-ambient--clear-icon-color,
      ${T("colorPrimaryAltFormInputIconReadOnly",P)}
    );

    --bbva-form-time--_ambient--invalid-clear-icon-color: var(
      --bbva-form-time--custom--primary-alt-ambient--invalid-clear-icon-color,
      ${T("colorPrimaryAltFormInputIconError",P)}
    );

    --bbva-form-time--_ambient--readonly-clear-color: var(
      --bbva-form-time--custom--primary-alt-ambient--readonly-clear-color,
      ${T("colorPrimaryAltFormInputIconReadOnly",P)}
    );
  }
`,Nt=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-time--_ambient--clear-icon-color: var(
      --bbva-form-time--custom--secondary-ambient--clear-icon-color,
      ${T("colorSecondaryFormInputIconReadOnly",P)}
    );

    --bbva-form-time--_ambient--invalid-clear-icon-color: var(
      --bbva-form-time--custom--secondary-ambient--invalid-clear-icon-color,
      ${T("colorSecondaryFormInputIconError",P)}
    );

    --bbva-form-time--_ambient--readonly-clear-color: var(
      --bbva-form-time--custom--secondary-ambient--readonly-clear-color,
      ${T("colorSecondaryFormInputIconReadOnly",P)}
    );
  }
`,qt=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-time--_ambient--clear-icon-color: var(
      --bbva-form-time--custom--secondary-alt-ambient--clear-icon-color,
      ${T("colorSecondaryAltFormInputIconReadOnly",P)}
    );

    --bbva-form-time--_ambient--invalid-clear-icon-color: var(
      --bbva-form-time--custom--secondary-alt-ambient--invalid-clear-icon-color,
      ${T("colorSecondaryAltFormInputIconError",P)}
    );

    --bbva-form-time--_ambient--readonly-clear-color: var(
      --bbva-form-time--custom--secondary-alt-ambient--readonly-clear-color,
      ${T("colorSecondaryAltFormInputIconReadOnly",P)}
    );
  }
`;const jt=z([Object.freeze({__proto__:null,primary:Rt,primaryAlt:Mt,secondary:Nt,secondaryAlt:qt}),J]),Ut=Object.values(jt);class Ht extends(O(et)){static get is(){return"bbva-form-time"}static get scopedElements(){return{"bbva-type-icon":N,"bbva-type-text":R,"bbva-notification-help":M,"bbva-button-default":q}}constructor(){super(),this.type="time",this.clearIcon=h()}static get styles(){return[super.styles,Ot,Lt,Ut,d("bbva-form-time-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return s`
      <div
        class="field"
        @click="${this._onFocusin}"
        @keydown="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get clearIconBlock(){return s`
      <span class="clear">
        <bbva-type-icon .icon="${this.clearIcon}" .size="${this.clearIconSize}"></bbva-type-icon>
      </span>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}}var Wt=t`
:host {
  display: flex;
  box-sizing: border-box;
  align-items: flex-start;
  margin: 0.5rem 1rem 0;
  color: var(--_form-password-hint-text-color);
  font-size: var(--typographyType3XSmall, ${e(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e(o.type3XSmall)});
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
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
  font-size: 1px;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.mark {
  width: 1rem;
  height: 1rem;
  margin-right: 0.25rem;
}

.icon {
  fill: var(--_form-password-hint-icon-color);
}

.unmarked {
  display: block;
  border: 1px solid var(--_form-password-hint-icon-color);
  border-radius: 50%;
}
`,Xt=t`
:host {
  --_form-password-hint-icon-color:
      var(--bbva-form-password-hint--_ambient--icon-color,
          var(--bbva-form-password-hint--custom--primary-ambient--icon-color,
              ${T("colorPrimarySupportSuccessDefault",P)}));
  --_form-password-hint-text-color:
      var(--bbva-form-password-hint--_ambient--text-color,
          var(--bbva-form-password-hint--custom--primary-ambient--text-color,
              ${T("colorPrimaryFormInputPlaceholderDefault",P)}));
}
`;const Yt=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-password-hint--_ambient--icon-color: initial;
    --bbva-form-password-hint--_ambient--text-color: initial;
  }
`,Zt=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-password-hint--_ambient--icon-color: var(
      --bbva-form-password-hint--custom--primary-alt-ambient--icon-color,
      ${T("colorPrimaryAltSupportSuccessDefault",P)}
    );

    --bbva-form-password-hint--_ambient--text-color: var(
      --bbva-form-password-hint--custom--primary-alt-ambient--text-color,
      ${T("colorPrimaryFormInputPlaceholderDefault",P)}
    );
  }
`,Kt=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-password-hint--_ambient--icon-color: var(
      --bbva-form-password-hint--custom--secondary-ambient--icon-color,
      ${T("colorSecondarySupportSuccessDefault",P)}
    );

    --bbva-form-password-hint--_ambient--text-color: var(
      --bbva-form-password-hint--custom--secondary-ambient--text-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );
  }
`,Gt=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-password-hint--_ambient--icon-color: var(
      --bbva-form-password-hint--custom--secondary-alt-ambient--icon-color,
      ${T("colorSecondaryAltSupportSuccessDefault",P)}
    );

    --bbva-form-password-hint--_ambient--text-color: var(
      --bbva-form-password-hint--custom--secondary-alt-ambient--text-color,
      ${T("colorSecondaryAltFormInputPlaceholderDefault",P)}
    );
  }
`;const Qt=z([Object.freeze({__proto__:null,primary:Yt,primaryAlt:Zt,secondary:Kt,secondaryAlt:Gt}),J,D]),Jt=Object.values(Qt),te=I(),ee="bbva-form-input-form-password-hint-checked",ae="bbva-form-input-form-password-hint-unchecked";class oe extends(i(O(S))){static get is(){return"bbva-form-password-hint"}static get scopedElements(){return{"bbva-type-icon":N}}static get properties(){return{checked:{type:Boolean,reflect:!0}}}constructor(){super(),this.checked=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","listitem")}static get styles(){return[Wt,Xt,Jt,d("bbva-form-password-hint-shared-styles")]}render(){return s`
      ${this.checked?this._markedTpl:this._unmarkedTpl}
      <div class="text">
        <slot></slot>
        <span class="sr-only">${this._srCheckedMessage}</span>
      </div>
    `}get _markedTpl(){return s` <bbva-type-icon class="mark icon" icon="${te}"></bbva-type-icon> `}get _unmarkedTpl(){return s` <span class="mark unmarked" aria-hidden="true"></span> `}get _srCheckedMessage(){return this.checked?this.t(ee):this.t(ae)}}var re=t`
:host {
  display: block;
  box-sizing: border-box;
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
`;const ie=z([J,Qt]),le=Object.values(ie);class ne extends(O(F(i(et)))){static get is(){return"bbva-form-password"}static get scopedElements(){return{"bbva-type-text":R,"bbva-type-icon":N,"bbva-notification-help":M,"bbva-button-default":q,"bbva-form-password-hint":oe}}static get properties(){return{toggleIcon:{type:String,attribute:"toggle-icon"},toggleVisibleIcon:{type:String,attribute:"toggle-visible-icon"},toggleIconSize:{type:Number,attribute:"toggle-icon-size"},toggleAccessibleText:{type:String,attribute:"toggle-accessible-text"},toggleVisibleAccessibleText:{type:String,attribute:"toggle-visible-accessible-text"},visible:{type:Boolean},hintsListLabel:{type:String,reflect:!0,attribute:"hints-list-label"},accessibleDescription:{type:String,attribute:"accessible-description"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},_hasHints:{type:Boolean,reflect:!0}}}constructor(){super(),this.actionType="button",this.actionVariant="no-background",this.actionIntoForm=!0,this.type="password",this.toggleVisibleIcon=A(),this.toggleIconSize=24,this.toggleAccessibleText="bbva-form-input-password-toggle",this.toggleVisibleAccessibleText="bbva-form-input-password-toggle-visible",this.visible=!1,this.toggleIcon=k(),this.actionIcon=this.toggleIcon,this.actionIconSecondary=this.toggleVisibleIcon,this.actionAccessibleText=this.toggleAccessibleText,this.actionSecondaryAccessibleText=this.toggleVisibleAccessibleText,this.hintsListLabel="",this._hasHints=!1,this._onSlotsChange=this._onSlotsChange.bind(this),this.addEventListener("slotschanges",this._onSlotsChange)}updated(t){super.updated(t),t.has("visible")&&(this.type=this.visible?"text":"password")}static get styles(){return[super.styles,re,le,d("bbva-form-password-shared-styles")]}switchIcon(){this._secondary=!this._secondary,this.visible=!this.visible,this.focus(),this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this.visible,bubbles:!0,composed:!0}))}get _hintsTpl(){return s`
      <div
        class="hints"
        role=${b(this._hasHints?"list":void 0)}
        aria-label=${b(this._hintsListLabel?this.t(this._hintsListLabel):void 0)}
        ?hidden="${this.readonly||!this._hasHints}"
      >
        <slot name="hints"></slot>
      </div>
    `}get _hintsListLabel(){return this.hintsListLabel}_onSlotsChange(t){const{slotName:e,contentSlots:a}=t.detail;"hints"===e&&(this._hasHints=a.some((t=>{var e;return null===(e=t.assignedNodes.querySelector('slot[name="hint"]'))||void 0===e?void 0:e.assignedNodes().length})))}render(){return s`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo} ${this._hintsTpl}
    `}}var ce=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([disabled]) {
  opacity: 0.4;
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

.field {
  position: relative;
  max-height: 8.75rem;
  padding: 1.5rem 0 1rem;
  border-radius: var(--bbva-form-textarea-field-border-radius, var(--borderRadiusSmall, ${e(w.small)}));
  border-bottom: 0.125rem solid var(--_form-textarea-field-border-color);
  background-color: var(--_form-textarea-field-bg-color);
}
:host([focused]) .field {
  border-bottom-color: var(--_form-textarea-focused-field-border-color);
}
:host([invalid]) .field {
  border-bottom-color: var(--_form-textarea-invalid-field-border-color);
  background-color: var(--_form-textarea-invalid-field-bg-color);
}

.label,
.message,
.slot-textarea ::slotted(textarea) {
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(r.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(r.book.fontWeight)});
}

.label,
.slot-textarea ::slotted(textarea) {
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(o.typeSmall)});
}

.slot-textarea ::slotted(textarea) {
  width: calc(100% - 2rem);
  height: var(--area-height, 3.5rem);
  min-height: 3.5rem;
  max-height: 6.25rem;
  padding: 0 1rem 0 1rem;
  border: none;
  background: transparent;
  color: var(--_form-textarea-textarea-color);
  font-family: inherit;
  outline: none;
  overflow-x: hidden;
  resize: none;
  will-change: transform;
}
:host([readonly]) .slot-textarea ::slotted(textarea) {
  color: var(--_form-textarea-readonly-textarea-color);
}
:host(:not([invalid])) .slot-textarea ::slotted(textarea) {
  color: var(--_form-textarea-invalid-textarea-color);
}

.label {
  position: absolute;
  top: 0;
  right: 1rem;
  left: 1rem;
  color: var(--_form-textarea-label-color);
  transform: translateY(0.75rem);
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  will-change: transform;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_form-textarea-focused-label-color);
  transform: translateY(0.5rem) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_form-textarea-readonly-textarea-color);
}
:host([invalid]) .label {
  color: var(--_form-textarea-invalid-label-color);
}

.clear {
  position: absolute;
  top: 4px;
  right: 0;
  display: none;
  margin: 0 0.25rem;
}
:host([typing]) .clear {
  display: flex;
}
:host([invalid][focused]) .clear {
  --bbva-button-default--_ambient--icon-no-background-color: var(--_form-textarea-error-icon-color);
}

.message {
  display: flex;
  align-items: flex-start;
  justify-content: flex-start;
  color: var(--_form-textarea-message-color);
}
.message.counter {
  display: flex;
  align-items: center;
  justify-content: flex-end;
  padding-top: 0.5rem;
}
.message.counter [data-tag-name=bbva-type-text] {
  color: var(--_form-textarea-message-info-counter-color);
}

:host([maxlength][info-message]) .message {
  margin-top: 0;
}

.message-error[data-tag-name=bbva-notification-help] {
  --bbva-notification-help--_ambient--icon-color: var(--_form-textarea-message-error-icon-color);
}

.label-out {
  display: flex;
  padding: 0 0.875rem;
  margin: 0.5rem 0;
}
.label-out-text {
  display: inline;
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
  vertical-align: middle;
}
.label-out .optional {
  font-weight: normal;
}
.label-out .right-align-container {
  display: flex;
  width: auto;
  align-items: flex-end;
  padding: 0;
}
.label-out .right-align-container [data-tag-name=bbva-button-default] {
  height: 1.375rem;
  padding: 0;
}

.notification {
  padding-top: 0.5rem;
  margin-left: 1rem;
}
`,se=t`
:host {
  --_form-textarea-field-bg-color:
      var(--bbva-form-textarea--_ambient--field-bg-color,
          var(--bbva-form-textarea--custom--primary-ambient--field-bg-color,
              ${T("colorPrimaryFormInputBackgroundDefault",P)}));
  --_form-textarea-field-border-color:
      var(--bbva-form-textarea--_ambient--field-border-color,
          var(--bbva-form-textarea--custom--primary-ambient--field-border-color,
              ${T("colorPrimaryFormInputBorderInactive",P)}));
  --_form-textarea-focused-field-border-color:
     var(--bbva-form-textarea--_ambient--focused-field-border-color,
         var(--bbva-form-textarea--custom--primary-ambient--focused-field-border-color,
             ${T("colorPrimaryFormInputBorderActive",P)}));
  --_form-textarea-invalid-field-bg-color:
      var(--bbva-form-textarea--_ambient--invalid-field-bg-color,
          var(--bbva-form-textarea--custom--primary-ambient--invalid-field-bg-color,
              ${T("colorPrimaryFormInputBackgroundError",P)}));
  --_form-textarea-invalid-field-border-colors:
      var(--bbva-form-textarea--_ambient--invalid-field-border-colors,
          var(--bbva-form-textarea--custom--primary-ambient--invalid-field-border-colors,
              ${T("colorPrimaryFormInputBorderError",P)}));
  --_form-textarea-textarea-color:
         var(--bbva-form-textarea--custom--primary-ambient--textarea-color,
             ${T("colorPrimaryFormInputFieldTextDefault",P)});
  --_form-textarea-readonly-textarea-color:
      var(--bbva-form-textarea--_ambient--readonly-textarea-color,
          var(--bbva-form-textarea--custom--primary-ambient--readonly-textarea-color,
              ${T("colorPrimaryFormInputFieldTextDefault",P)}));
  --_form-textarea-invalid-textarea-color:
      var(--bbva-form-textarea--_ambient--invalid-textarea-color,
          var(--bbva-form-textarea--custom--primary-ambient--invalid-textarea-color,
              ${T("colorPrimaryText01Default",P)}));
  --_form-textarea-label-color:
      var(--bbva-form-textarea--_ambient--label-color,
          var(--bbva-form-textarea--custom--primary-ambient--label-color,
              ${T("colorPrimaryFormInputPlaceholderDefault",P)}));
  --_form-textarea-label-out-color:
      var(--bbva-form-textarea--_ambient--label-out-color,
          var(--bbva-form-textarea--custom--primary-ambient--label-out-color,
              ${T("colorPrimaryText01Default",P)}));
  --_form-textarea-focused-label-color:
      var(--bbva-form-textarea--_ambient--focused-label-color,
          var(--bbva-form-textarea--custom--primary-ambient--focused-label-color,
              ${T("colorPrimaryFormInputPlaceholderDefault",P)}));
  --_form-textarea-invalid-label-color:
      var(--bbva-form-textarea--_ambient--invalid-label-color,
          var(--bbva-form-textarea--custom--primary-ambient--invalid-label-color,
              ${T("colorPrimaryFormInputPlaceholderError",P)}));
  --_form-textarea-message-info-counter-color:
      var(--bbva-form-textarea--_ambient--message-info-counter-color,
          var(--bbva-form-textarea--custom--primary-ambient--message-info-counter-color,
              ${T("colorPrimaryText02Default",P)}));
  --_form-textarea-message-error-icon-color:
      var(--bbva-form-textarea--_ambient--message-icon-color,
          var(--bbva-form-textarea--custom--primary-ambient--message-icon-color,
              ${T("colorPrimarySupportErrorDefault",P)}));
  --_form-textarea-error-icon-color:
      var(--bbva-form-textarea--_ambient--error-icon-color,
          var(--bbva-form-textarea--custom--primary-ambient--error-icon-color,
              ${T("colorPrimaryFormInputIconError",P)}));
}
`;const be=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-textarea--_ambient--field-bg-color: initial;
    --bbva-form-textarea--_ambient--field-border-color: initial;
    --bbva-form-textarea--_ambient--focused-field-border-color: initial;
    --bbva-form-textarea--_ambient--invalid-field-bg-color: initial;
    --bbva-form-textarea--_ambient--invalid-field-border-colors: initial;
    --bbva-form-textarea--_ambient--textarea-color: initial;
    --bbva-form-textarea--_ambient--readonly-textarea-color: initial;
    --bbva-form-textarea--_ambient--invalid-textarea-color: initial;
    --bbva-form-textarea--_ambient--label-color: initial;
    --bbva-form-textarea--_ambient--label-out-color: initial;
    --bbva-form-textarea--_ambient--focused-label-color: initial;
    --bbva-form-textarea--_ambient--readonly-label-color: initial;
    --bbva-form-textarea--_ambient--invalid-label-color: initial;
    --bbva-form-textarea--_ambient--message-info-counter-color: initial;
    --bbva-form-textarea--_ambient--message-icon-color: initial;
    --bbva-form-textarea--_ambient--error-icon-color: initial;
  }
`,de=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-textarea--_ambient--field-bg-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--field-bg-color,
      ${T("colorPrimaryAltFormInputBackgroundDefault",P)}
    );

    --bbva-form-textarea--_ambient--field-border-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--field-border-color,
      ${T("colorPrimaryAltFormInputBorderInactive",P)}
    );

    --bbva-form-textarea--_ambient--focused-field-border-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--focused-field-border-color,
      ${T("colorPrimaryAltFormInputBorderActive",P)}
    );

    --bbva-form-textarea--_ambient--invalid-field-bg-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--invalid-field-bg-color,
      ${T("colorPrimaryAltFormInputBackgroundError",P)}
    );

    --bbva-form-textarea--_ambient--invalid-field-border-colors: var(
      --bbva-form-textarea--custom--primary-alt-ambient--invalid-field-border-colors,
      ${T("colorPrimaryAltFormInputBorderError",P)}
    );

    --bbva-form-textarea--_ambient--textarea-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--textarea-color,
      ${T("colorPrimaryAltFormInputFieldTextDefault",P)}
    );

    --bbva-form-textarea--_ambient--readonly-textarea-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--readonly-textarea-color,
      ${T("colorPrimaryAltFormInputFieldTextDefault",P)}
    );

    --bbva-form-textarea--_ambient--invalid-textarea-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--invalid-textarea-color,
      ${T("colorPrimaryAltText01Default",P)}
    );

    --bbva-form-textarea--_ambient--label-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--label-color,
      ${T("colorPrimaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-textarea--_ambient--label-out-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--label-out-color,
      ${T("colorPrimaryAltText01Default",P)}
    );

    --bbva-form-textarea--_ambient--focused-label-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--focused-label-color,
      ${T("colorPrimaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-textarea--_ambient--readonly-label-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--readonly-label-color,
      ${T("colorPrimaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-textarea--_ambient--invalid-label-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--invalid-label-color,
      ${T("colorPrimaryAltFormInputPlaceholderError",P)}
    );

    --bbva-form-textarea--_ambient--message-info-counter-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--message-info-counter-color,
      ${T("colorPrimaryAltText02Default",P)}
    );

    --bbva-form-textarea--_ambient--message-icon-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--message-icon-color,
      ${T("colorPrimaryAltSupportErrorDefault",P)}
    );

    --bbva-form-textarea--_ambient--error-icon-color: var(
      --bbva-form-textarea--custom--primary-alt-ambient--error-icon-color,
        ${T("colorPrimaryAltFormInputIconError",P)}
    );
  }
`,me=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-textarea--_ambient--field-bg-color: var(
      --bbva-form-textarea--custom--secondary-ambient--field-bg-color,
      ${T("colorSecondaryFormInputBackgroundDefault",P)}
    );

    --bbva-form-textarea--_ambient--field-border-color: var(
      --bbva-form-textarea--custom--secondary-ambient--field-border-color,
      ${T("colorSecondaryFormInputBorderInactive",P)}
    );

    --bbva-form-textarea--_ambient--focused-field-border-color: var(
      --bbva-form-textarea--custom--secondary-ambient--focused-field-border-color,
      ${T("colorSecondaryFormInputBorderActive",P)}
    );

    --bbva-form-textarea--_ambient--invalid-field-bg-color: var(
      --bbva-form-textarea--custom--secondary-ambient--invalid-field-bg-color,
      ${T("colorSecondaryFormInputBackgroundError",P)}
    );

    --bbva-form-textarea--_ambient--invalid-field-border-colors: var(
      --bbva-form-textarea--custom--secondary-ambient--invalid-field-border-colors,
      ${T("colorSecondaryFormInputBorderError",P)}
    );

    --bbva-form-textarea--_ambient--textarea-color: var(
      --bbva-form-textarea--custom--secondary-ambient--textarea-color,
      ${T("colorSecondaryFormInputFieldTextDefault",P)}
    );

    --bbva-form-textarea--_ambient--readonly-textarea-color: var(
      --bbva-form-textarea--custom--secondary-ambient--readonly-textarea-color,
      ${T("colorSecondaryFormInputFieldTextDefault",P)}
    );

    --bbva-form-textarea--_ambient--invalid-textarea-color: var(
      --bbva-form-textarea--custom--secondary-ambient--invalid-textarea-color,
      ${T("colorSecondaryText01Default",P)}
    );

    --bbva-form-textarea--_ambient--label-color: var(
      --bbva-form-textarea--custom--secondary-ambient--label-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-textarea--_ambient--label-out-color: var(
      --bbva-form-textarea--custom--secondary-ambient--label-out-color,
      ${T("colorSecondaryText01Default",P)}
    );

    --bbva-form-textarea--_ambient--focused-label-color: var(
      --bbva-form-textarea--custom--secondary-ambient--focused-label-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-textarea--_ambient--readonly-label-color: var(
      --bbva-form-textarea--custom--secondary-ambient--readonly-label-color,
      ${T("colorSecondaryFormInputPlaceholderDefault",P)}
    );

    --bbva-form-textarea--_ambient--invalid-label-color: var(
      --bbva-form-textarea--custom--secondary-ambient--invalid-label-color,
      ${T("colorSecondaryFormInputPlaceholderError",P)}
    );

    --bbva-form-textarea--_ambient--message-info-counter-color: var(
      --bbva-form-textarea--custom--secondary-ambient--message-info-counter-color,
      ${T("colorSecondaryText02Default",P)}
    );

    --bbva-form-textarea--_ambient--message-icon-color: var(
      --bbva-form-textarea--custom--secondary-ambient--message-icon-color,
      ${T("colorSecondarySupportErrorDefault",P)}
    );

    --bbva-form-textarea--_ambient--error-icon-color: var(
      --bbva-form-textarea--custom--secondary-ambient--error-icon-color,
        ${T("colorSecondaryFormInputIconError",P)}
    );
  }
`,ue=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-textarea--_ambient--field-bg-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--field-bg-color,
      ${T("colorSecondaryAltFormInputBackgroundDefault",P)}
    );

    --bbva-form-textarea--_ambient--field-border-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--field-border-color,
      ${T("colorSecondaryAltFormInputBorderInactive",P)}
    );

    --bbva-form-textarea--_ambient--focused-field-border-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--focused-field-border-color,
      ${T("colorSecondaryAltFormInputBorderActive",P)}
    );

    --bbva-form-textarea--_ambient--invalid-field-bg-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--invalid-field-bg-color,
      ${T("colorSecondaryAltFormInputBackgroundError",P)}
    );

    --bbva-form-textarea--_ambient--invalid-field-border-colors: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--invalid-field-border-colors,
      ${T("colorSecondaryAltFormInputBorderError",P)}
    );

    --bbva-form-textarea--_ambient--textarea-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--textarea-color,
      ${T("colorSecondaryAltFormInputFieldTextDefault",P)}
    );

    --bbva-form-textarea--_ambient--readonly-textarea-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--readonly-textarea-color,
      ${T("colorSecondaryAltFormInputFieldTextDefault",P)}
    );

    --bbva-form-textarea--_ambient--invalid-textarea-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--invalid-textarea-color,
      ${T("colorSecondaryAltText01Default",P)}
    );

    --bbva-form-textarea--_ambient--label-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--label-color,
      ${T("colorSecondaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-textarea--_ambient--label-out-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--label-out-color,
      ${T("colorSecondaryAltText01Default",P)}
    );

    --bbva-form-textarea--_ambient--focused-label-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--focused-label-color,
      ${T("colorSecondaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-textarea--_ambient--readonly-label-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--readonly-label-color,
      ${T("colorSecondaryAltFormInputPlaceholderDefault",P)}
    );

    --bbva-form-textarea--_ambient--invalid-label-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--invalid-label-color,
      ${T("colorSecondaryAltFormInputPlaceholderError",P)}
    );

    --bbva-form-textarea--_ambient--message-info-counter-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--message-info-counter-color,
      ${T("colorSecondaryAltText02Default",P)}
    );

    --bbva-form-textarea--_ambient--message-icon-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--message-icon-color,
      ${T("colorSecondaryAltSupportErrorDefault",P)}
    );

    --bbva-form-textarea--_ambient--error-icon-color: var(
      --bbva-form-textarea--custom--secondary-alt-ambient--error-icon-color,
        ${T("colorSecondaryAltFormInputIconError",P)}
    );
  }
`;const he=z([Object.freeze({__proto__:null,primary:be,primaryAlt:de,secondary:me,secondaryAlt:ue}),B,C,V]),fe=Object.values(he);class pe extends(O(i(j))){static get is(){return"bbva-form-textarea"}static get scopedElements(){return{"bbva-type-text":R,"bbva-button-default":q,"bbva-notification-help":M}}static get properties(){return{validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},characterCounterLabel:{type:String,attribute:"character-counter-label"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},accessibleDescription:{type:String,attribute:"accessible-description"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoMessage:{type:String,attribute:"info-message"},label:{type:String},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:String,attribute:"help-icon"},helpIconSize:{type:Number,attribute:"help-icon-size"},pattern:{type:String},resetValue:{type:Boolean,attribute:"reset-value"},_remainingCharacters:{type:Number}}}constructor(){super(),this.label="",this.labelOut="",this.optionalLabel="bbva-form-input-textarea-optional-label",this.characterCounterLabel="bbva-form-input-textarea-counter-label",this.clearIcon="",this._remainingCharacters=0,this.clearIconSize=24,this.clearAccessibleText="bbva-form-input-textarea-clear",this.errorIcon=n(),this.errorMessage="",this.infoIcon=c(),this.infoMessage="",this._onInputRaf=this._onInput,this.helpIconSize=16,this.pattern="",this.resetValue=!1,this.validateOnBlur=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field"),this._formElement=this.querySelector("textarea")}updated(t){super.updated(t),t.has("value")&&(this.autoValidate||void 0===t.get("value")||(this.invalid=this.required?this._isEmpty:this.invalid),this.autoValidate&&void 0!==t.get("value")&&(this.validate(),this.invalid=this.required&&this._isEmpty||this.invalid),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""),this._isEmpty||this.disabled||this.readonly?this.removeAttribute("typing"):this.setAttribute("typing",""),this._calculateCharacters()),t.has("resetValue")&&this.resetValue&&this.clearTextarea()}static get styles(){return[ce,se,fe,d("bbva-form-textarea-shared-styles")]}render(){return s`${this._labelOut} ${this.field} ${this._characterCounter} ${this.messageError}
    ${this.messageInfo}`}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),`${this.label} ${this.labelOut||this.required?this.t(this.optionalLabel):""}`}get _helpIcon(){return this.helpIcon?s`
          <div class="right-align-container">
            <bbva-button-default
              @click="${this._helpClicked}"
              variant="icon no-background"
              .icon="${this.helpIcon}"
              .iconSize="${this.helpIconSize}"
              aria-label="${this.t("bbva-form-input-field-help-text")}"
            >
            </bbva-button-default>
          </div>
        `:""}get _labelOut(){return this.labelOut?s`
        <div class="label-out">
          <div class="label-out-content">
            <bbva-type-text
              id="labelOutText"
              class="label-out-text"
              unset
              text=${this.required,`${this.labelOut}`}
              size="S"
            >
            </bbva-type-text>
            <bbva-type-text
              unset
              class="label-out-text optional"
              text="${this.t(this.optionalLabel)?`${this.t(this.optionalLabel)}`:""}"
              size="S"
            ></bbva-type-text>
          </div>
          ${this._helpIcon}
        </div>
      `:""}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}_onInput(){this.value=this._formElement.value,this.style.removeProperty("--area-height"),this.style.setProperty("--area-height",this._formElement.scrollHeight/16+"rem"),this._calculateCharacters()}get field(){return s`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this._labelledTextarea} ${this.clearButton}
      </div>
    `}get clearButton(){return this.clearIcon?s`
          <bbva-button-default
            class="clear"
            variant="icon no-background"
            .icon="${this.clearIcon}"
            .size="${this.clearIconSize}"
            @click="${this.clearTextarea}"
            aria-label="${this.t(this.clearAccessibleText)}"
          >
          </bbva-button-default>
        `:""}get messageError(){return this._errorVisible?s`
          <div class="message error" role="alert">
            <bbva-notification-help
              class="message-error notification"
              accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-alert-icon")}"
              icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              text=${this.t(this.errorMessage)}
              disabled-tabindex
            ></bbva-notification-help>
          </div>
        `:""}get _errorVisible(){return this.errorMessage&&this.invalid}get _characters(){return"number"==typeof this._remainingCharacters?this._remainingCharacters:this.maxlength}get _characterCounter(){return this.maxlength?s`
          <div class="message info counter">
            <bbva-type-text
              unset
              text="${this._characters} ${this.t(this.characterCounterLabel)}"
              size="2XS"
            >
            </bbva-type-text>
          </div>
        `:""}get messageInfo(){return this.infoMessage?s`
          <bbva-notification-help
            disabled-tabindex
            accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-info-icon")}"
            .icon="${this.infoIcon}"
            text=${this.t(this.infoMessage)}
            class="notification"
          ></bbva-notification-help>
        `:""}get _labelBlock(){return s`
      <bbva-type-text
        unset
        size="2XS"
        tag="label"
        for="${this._formElementId}"
        text="${this._textareaLabel}"
        class="label"
        aria-hidden="true"
        @click="${this.focus}"
      ></bbva-type-text>
    `}_calculateCharacters(){var t;this._remainingCharacters=this.maxlength-((null===(t=this._formElement)||void 0===t?void 0:t.value.length)||0)}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}validate(){let t=super.validate();if(this.pattern){t=new RegExp(this.pattern).test(this.value)}return this.invalid=!t,t}_onFocusout(){this.readonly||setTimeout((()=>{const{activeElement:t}=this._rootNode,e=this.shadowRoot.activeElement||t;this._field.contains(e)||t===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-textarea-input-focus",{detail:!0,bubbles:!0,composed:!0}))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-textarea-input-blur",{detail:!0,bubbles:!0,composed:!0}))}clearTextarea(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-textarea-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}}var ve=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;const ye=z([J,At,Tt,ct,ie,Dt,vt,jt,he,ut]),ge=Object.values(ye);class $e extends(O(S)){static get is(){return"bbva-form-input"}static get scopedElements(){return{"bbva-form-attach":ft,"bbva-form-text":gt,"bbva-form-amount":dt,"bbva-form-date":wt,"bbva-form-number":zt,"bbva-form-search":Vt,"bbva-form-password":ne,"bbva-form-time":Ht,"bbva-form-textarea":pe}}static get properties(){return{type:{type:String,reflect:!0},disabled:{type:Boolean,reflect:!0},value:{type:String},name:{type:String},required:{type:Boolean},readonly:{type:Boolean},autocomplete:{type:String},modeInput:{type:String,attribute:"mode-input"},label:{type:String},pattern:{type:String},allowedPattern:{type:String,attribute:"allowed-pattern"},max:{type:String},maxlength:{type:Number},min:{type:String},minlength:{type:Number},placeholder:{type:String},step:{type:Number},accessibleDescription:{type:String,attribute:"accessible-description"},autoValidate:{type:Boolean,attribute:"auto-validate"},form:{type:Object},actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},symbol:{type:String},symbolLeft:{type:Boolean,attribute:"symbol-left"},symbolRight:{type:Boolean,attribute:"symbol-right"},amount:{type:Number},language:{type:String},abbr:{type:Number},abbreviations:{type:Object},decimalDigits:{type:Number,attribute:"decimal-digits"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},zeroDecimalsHidden:{type:Boolean,attribute:"zero-decimals-hidden"},trailingZeroDecimalsHidden:{type:Boolean,attribute:"trailing-zero-decimals-hidden"},separatorChar:{type:String,attribute:"separator-char"},groupChar:{type:String,attribute:"group-char"},_intlLanguage:{attribute:!1},_intlAmountLanguage:{attribute:!1},flag:{type:String},flagLabel:{type:String,attribute:"flag-label"},items:{type:Array},minChars:{type:Number,attribute:"min-chars"},maxResults:{type:Number,attribute:"max-results"},filterValueKey:{type:String,attribute:"filter-value-key"},autoselect:{type:Boolean},selectOnBlur:{type:Boolean,attribute:"select-on-blur"},keepOnBlur:{type:Boolean,attribute:"keep-on-blur"},keepOnSelect:{type:Boolean,attribute:"keep-on-select"},preventValueUpdateOnSelect:{type:Boolean,attribute:"prevent-value-update-on-select"},overlay:{type:Boolean,reflect:!0},search:{type:Boolean},toggleIcon:{type:String,attribute:"toggle-icon"},toggleVisibleIcon:{type:String,attribute:"toggle-visible-icon"},toggleIconSize:{type:Number,attribute:"toggle-icon-size"},toggleAccessibleText:{type:String,attribute:"toggle-accessible-text"},toggleVisibleAccessibleText:{type:String,attribute:"toggle-visible-accessible-text"},visible:{type:Boolean},disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String},characterCounterLabel:{type:String,attribute:"character-counter-label"},iconVariant:{type:String,attribute:"icon-variant"},showCard:{type:Boolean,attribute:"show-card"},invalid:{type:Boolean,reflect:!0},autoFocus:{type:Boolean,attribute:"autofocus"},logo:{type:String},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},partner:{type:Boolean},partnerLogo:{type:String,attribute:"partner-logo"},cardVariant:{type:String,attribute:"card-variant"},inlineAutocomplete:{type:Boolean,attribute:"inline-autocomplete"},cardStatus:{type:String,attribute:"card-status",reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},fieldSize:{type:String,attribute:"field-size"},resetValue:{type:Boolean,attribute:"reset-value"},hintsListLabel:{type:String,reflect:!0,attribute:"hints-list-label"},customUpdateValue:{type:Boolean,attribute:"custom-update-value"}}}constructor(){super(),this.disabled=!1,this.logo="",this.cardStatus="",this.cardType="",this.cardImage="",this.partner=!1,this.cardVariant="",this.payCompatibility="",this.abbreviations={1:"da",2:"h",3:"k",6:"M",9:"B"},this.autoFocus=!1,this.actionAccessibleText="",this.actionIconSize=24,this.actionIconSecondary=this.toggleVisibleIcon,this.actionIconSecondarySize=24,this.actionSecondaryAccessibleText=this.toggleVisibleAccessibleText,this.allowedPattern="",this.autoselect=!1,this.autoValidate=!1,this.clearIcon=E(),this.clearIconSize=24,this.clearAccessibleText="",this.currencyCode="EUR",this.decimalDigits=2,this.decimalsHidden=!1,this.errorIcon="",this.errorMessage="",this.filterValueKey=null,this.hasError=!1,this.helpIconSize=24,this.hintsListLabel="",this.invalid=!1,this.infoMessage="",this.items=[],this.keepOnBlur=!1,this.keepOnSelect=!1,this.label="",this.labelOut="",this.localCurrency="EUR",this.maxResults=5,this.minChars=1,this.name="",this.optionalLabel="",this.overlay=!1,this.preventValueUpdateOnSelect=!1,this.required=!1,this.search=!1,this.selectOnBlur=!1,this.toggleAccessibleText="",this.toggleIcon="",this.toggleIconSize=24,this.toggleVisibleIcon="",this.toggleVisibleAccessibleText="",this.trailingZeroDecimalsHidden=!1,this.type="",this.value="",this.form={},this.visible=!1,this.zeroDecimalsHidden=!1,this.modeInput="text",this.fieldSize="M",this.resetValue=!1,this.readonly=!1,this.actionIntoForm=!1,this.validateOnBlur=!1,this.symbolLeft=!1,this.symbolRight=!1,this.customUpdateValue=!1}static get styles(){return[ve,ge,d("bbva-form-input-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("input",this._updateValue),this.addEventListener("form-field-input-clear",this._updateResetValue),this.addEventListener("form-textarea-input-clear",this._updateResetValue),this.addEventListener("form-field-input-validate",this._updateInvalid)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("input",this._updateValue),this.removeEventListener("form-field-input-clear",this._updateResetValue),this.removeEventListener("form-textarea-input-clear",this._updateResetValue),this.removeEventListener("form-field-input-validate",this._updateInvalid)}firstUpdated(){super.firstUpdated(),this.form=this.shadowRoot.firstElementChild}updated(t){super.updated&&super.updated(t)}_updateInvalid(t){this.invalid=t.detail.invalid}_updateResetValue(){this.resetValue=!1}async _updateValue(){await this.updateComplete;const{firstElementChild:t}=this.shadowRoot,{firstElementChild:e}=t;this.value=e.value||t.value,this.dispatchEvent(new CustomEvent("form-input-value-change",{detail:{value:this.value},bubbles:!0,composed:!0}))}get _formAttachTpl(){return s` <bbva-form-attach
      ?autofocus=${this.autoFocus}
      input-type=${this.type}
      action-icon=${b(this.actionIcon)}
      action-icon-secondary=${b(this.actionIconSecondary)}
      label=${b(this.label)}
      label-out=${b(this.labelOut)}
      ?required=${this.required}
      help-icon=${b(this.helpIcon)}
      placeholder=${b(this.placeholder)}
      value=${b(this.value)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      info-message=${b(this.infoMessage)}
      allowed-pattern=${b(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${b(this.pattern)}
      error-message=${b(this.errorMessage)}
      ?action-into-form=${this.actionIntoForm}
      action-variant=${b(this.actionVariant)}
      action-type=${b(this.actionType)}
      action-accessible-text=${b(this.actionAccessibleText)}
      action-secondary-accessible-text=${b(this.actionSecondaryAccessibleText)}
      ?validate-on-blur=${this.validateOnBlur}
      optional-label=${b(this.optionalLabel)}
      icon-variant=${b(this.iconVariant)}
      ?invalid=${this.invalid}
      field-size=${b(this.fieldSize)}
      ?reset-value="${this.resetValue}"
      clear-accessible-text=${b(this.clearAccessibleText)}
      accessible-description=${b(this.accessibleDescription)}
      clear-icon=${b(this.clearIcon)}
      maxlength=${b(this.maxlength)}
      inputmode=${b(this.modeInput)}
    ></bbva-form-attach>`}get _formDateTpl(){return s` <bbva-form-date
      ?autofocus=${this.autoFocus}
      label=${b(this.label)}
      label-out=${b(this.labelOut)}
      ?required=${this.required}
      value=${b(this.value)}
      ?disabled=${this.disabled}
      help-icon=${b(this.helpIcon)}
      ?readonly=${this.readonly}
      info-message=${b(this.infoMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      allowed-pattern=${b(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${b(this.pattern)}
      error-message=${b(this.errorMessage)}
      .min=${this.min}
      .max=${this.max}
      action-type=${b(this.actionType)}
      action-icon=${b(this.actionIcon)}
      action-icon-secondary=${b(this.actionIconSecondary)}
      action-accessible-text=${b(this.actionAccessibleText)}
      action-secondary-accessible-text=${b(this.actionSecondaryAccessibleText)}
      action-variant=${b(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      optional-label=${b(this.optionalLabel)}
      icon-variant=${b(this.iconVariant)}
      ?invalid=${this.invalid}
      ?reset-value="${this.resetValue}"
      field-size=${b(this.fieldSize)}
    ></bbva-form-date>`}get _formTextTpl(){return s` <bbva-form-text
      ?autofocus=${this.autoFocus}
      inputmode="${b(this.modeInput)}"
      label=${b(this.label)}
      label-out=${b(this.labelOut)}
      ?required=${this.required}
      help-icon=${b(this.helpIcon)}
      .flag-label=${this.flagLabel}
      .flag=${this.flag}
      placeholder=${b(this.placeholder)}
      value=${b(this.value)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      info-message=${b(this.infoMessage)}
      error-message=${b(this.errorMessage)}
      action-type=${b(this.actionType)}
      action-icon=${b(this.actionIcon)}
      maxlength=${b(this.maxlength)}
      minlength=${b(this.minlength)}
      action-icon-secondary=${b(this.actionIconSecondary)}
      action-accessible-text=${b(this.actionAccessibleText)}
      action-secondary-accessible-text=${b(this.actionSecondaryAccessibleText)}
      action-variant=${b(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      optional-label=${b(this.optionalLabel)}
      icon-variant=${b(this.iconVariant)}
      ?validate-on-blur=${this.validateOnBlur}
      ?invalid=${this.invalid}
      pattern=${b(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${b(this.allowedPattern)}
      aria-autocomplete="${this.inlineAutocomplete?"both":"list"}"
      ?reset-value="${this.resetValue}"
      clear-accessible-text=${b(this.clearAccessibleText)}
      accessible-description=${b(this.accessibleDescription)}
      field-size=${b(this.fieldSize)}
      clear-icon=${b(this.clearIcon)}
      ?custom-update-value=${this.customUpdateValue}
    ></bbva-form-text>`}get _formAmountTpl(){return s`<bbva-form-amount
      ?autofocus=${this.autoFocus}
      inputmode="${b(this.modeInput)}"
      label=${this.label}
      label-out=${b(this.labelOut)}
      ?required=${this.required}
      placeholder=${b(this.placeholder)}
      help-icon=${b(this.helpIcon)}
      amount=${b(this.amount)}
      ?readonly=${this.readonly}
      info-message=${b(this.infoMessage)}
      ?disabled=${this.disabled}
      currency-code=${b(this.currencyCode)}
      local-currency=${b(this.localCurrency)}
      language=${b(this.language)}
      ?symbol-right=${this.symbolRight}
      error-message=${b(this.errorMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      .flag=${this.flag}
      .flag-label=${this.flagLabel}
      ?show-card=${this.showCard}
      card-status=${this.cardStatus}
      card-variant=${this.cardVariant}
      card-type=${b(this.cardType)}
      pay-compatibility=${this.payCompatibility}
      ?partner=${this.partner}
      partner-logo=${b(this.partnerLogo)}
      card-image=${b(this.cardImage)}
      action-type=${b(this.actionType)}
      action-icon=${b(this.actionIcon)}
      action-icon-secondary=${b(this.actionIconSecondary)}
      action-accessible-text=${b(this.actionAccessibleText)}
      action-secondary-accessible-text=${b(this.actionSecondaryAccessibleText)}
      action-variant=${b(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      optional-label=${b(this.optionalLabel)}
      icon-variant=${b(this.iconVariant)}
      ?invalid=${this.invalid}
      pattern=${b(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${b(this.allowedPattern)}
      decimal-digits=${b(this.decimalDigits)}
      ?decimals-hidden=${this.decimalsHidden}
      ?trailing-zero-decimals-hidden=${this.trailingZeroDecimalsHidden}
      ?zero-decimals-hidden=${this.zeroDecimalsHidden}
      group-char=${b(this.groupChar)}
      separator-char=${b(this.separatorChar)}
      ?reset-value="${this.resetValue}"
      clear-accessible-text=${b(this.clearAccessibleText)}
      accessible-description=${b(this.accessibleDescription)}
      field-size=${b(this.fieldSize)}
      clear-icon=${b(this.clearIcon)}
      maxlength=${b(this.maxlength)}
    ></bbva-form-amount> `}get _formNumberTpl(){return s`<bbva-form-number
      ?autofocus=${this.autoFocus}
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      value=${b(this.value)}
      .flag=${this.flag}
      .flag-label=${this.flagLabel}
      placeholder=${b(this.placeholder)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      help-icon=${b(this.helpIcon)}
      info-message=${b(this.infoMessage)}
      error-message=${b(this.errorMessage)}
      min=${this.min}
      max=${this.max}
      ?invalid=${this.invalid}
      action-type=${b(this.actionType)}
      action-icon=${b(this.actionIcon)}
      action-icon-secondary=${b(this.actionIconSecondary)}
      action-accessible-text=${b(this.actionAccessibleText)}
      action-secondary-accessible-text=${b(this.actionSecondaryAccessibleText)}
      action-variant=${b(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      optional-label=${b(this.optionalLabel)}
      icon-variant=${b(this.iconVariant)}
      ?validate-on-blur=${this.validateOnBlur}
      pattern=${b(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${b(this.allowedPattern)}
      ?reset-value="${this.resetValue}"
      clear-accessible-text=${b(this.clearAccessibleText)}
      accessible-description=${b(this.accessibleDescription)}
      field-size=${b(this.fieldSize)}
      clear-icon=${b(this.clearIcon)}
      inputmode=${b(this.modeInput)}
    ></bbva-form-number> `}get _formSearchTpl(){return s`<bbva-form-search
      ?autofocus=${this.autoFocus}
      label=${b(this.label)}
      label-out=${b(this.labelOut)}
      ?required=${this.required}
      value=${b(this.value)}
      .placeholder=${this.placeholder}
      ?readonly=${this.readonly}
      info-message=${b(this.infoMessage)}
      error-message=${b(this.errorMessage)}
      ?disabled-button=${this.disabledButton}
      help-icon=${b(this.helpIcon)}
      ?disabled=${this.disabled}
      allowed-pattern=${b(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${b(this.pattern)}
      variant=${b(this.variant)}
      icon-variant=${b(this.iconVariant)}
      ?invalid=${this.invalid}
      action-type=${b(this.actionType)}
      action-icon=${b(this.actionIcon)}
      action-icon-secondary=${b(this.actionIconSecondary)}
      action-accessible-text=${b(this.actionAccessibleText)}
      action-secondary-accessible-text=${b(this.actionSecondaryAccessibleText)}
      action-variant=${b(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      optional-label=${b(this.optionalLabel)}
      ?validate-on-blur=${this.validateOnBlur}
      aria-autocomplete="${this.inlineAutocomplete?"both":"list"}"
      ?reset-value="${this.resetValue}"
      clear-accessible-text=${b(this.clearAccessibleText)}
      accessible-description=${b(this.accessibleDescription)}
      field-size=${b(this.fieldSize)}
      clear-icon=${b(this.clearIcon)}
    ></bbva-form-search> `}get _formPasswordTpl(){return s`<bbva-form-password
      ?autofocus=${this.autoFocus}
      label=${b(this.label)}
      label-out=${b(this.labelOut)}
      ?required=${this.required}
      value=${b(this.value)}
      ?readonly=${this.readonly}
      info-message=${b(this.infoMessage)}
      pattern=${b(this.pattern)}
      help-icon=${b(this.helpIcon)}
      hints-list-label=${b(this.hintsListLabel)}
      allowed-pattern=${b(this.allowedPattern)}
      error-message=${b(this.errorMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      ?auto-validate=${this.autoValidate}
      name=${b(this.name)}
      ?disabled=${this.disabled}
      ?invalid=${this.invalid}
      .min=${this.min}
      .max=${this.max}
      maxlength=${b(this.maxlength)}
      minlength=${b(this.minlength)}
      action-variant=${b(this.actionVariant)}
      toggle-icon=${b(this.toggleIcon)}
      toggle-visible-icon=${b(this.toggleVisibleIcon)}
      toggle-icon-size=${b(this.toggleIconSize)}
      toggle-accessible-text=${b(this.toggleAccessibleText)}
      toggle-visible-accessible-text=${b(this.toggleVisibleAccessibleText)}
      ?visible=${this.visible}
      action-type=${b(this.actionType)}
      action-icon=${b(this.actionIcon)}
      action-icon-secondary=${b(this.actionIconSecondary)}
      action-accessible-text=${b(this.actionAccessibleText)}
      action-secondary-accessible-text=${b(this.actionSecondaryAccessibleText)}
      ?action-into-form=${this.actionIntoForm}
      optional-label=${b(this.optionalLabel)}
      icon-variant=${b(this.iconVariant)}
      ?reset-value="${this.resetValue}"
      clear-accessible-text=${b(this.clearAccessibleText)}
      accessible-description=${b(this.accessibleDescription)}
      field-size=${b(this.fieldSize)}
      clear-icon=${b(this.clearIcon)}
      ?custom-update-value=${this.customUpdateValue}
      inputmode=${b(this.modeInput)}
      ><div slot="hints"><slot name="hint"></slot></div
    ></bbva-form-password> `}get _formTimeTpl(){return s` <bbva-form-time
      ?autofocus=${this.autoFocus}
      label=${b(this.label)}
      label-out=${b(this.labelOut)}
      ?required=${this.required}
      value=${b(this.value)}
      ?readonly=${this.readonly}
      info-message=${b(this.infoMessage)}
      error-message=${b(this.errorMessage)}
      help-icon=${b(this.helpIcon)}
      pattern=${b(this.pattern)}
      ?auto-validate=${this.autoValidate}
      ?validate-on-blur=${this.validateOnBlur}
      .min=${this.min}
      .max=${this.max}
      ?disabled=${this.disabled}
      ?invalid=${this.invalid}
      action-type=${b(this.actionType)}
      action-icon=${b(this.actionIcon)}
      action-icon-secondary=${b(this.actionIconSecondary)}
      action-accessible-text=${b(this.actionAccessibleText)}
      action-secondary-accessible-text=${b(this.actionSecondaryAccessibleText)}
      action-variant=${b(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      optional-label=${b(this.optionalLabel)}
      icon-variant=${b(this.iconVariant)}
      ?reset-value="${this.resetValue}"
      field-size=${b(this.fieldSize)}
    ></bbva-form-time>`}get _formTextareaTpl(){return s` <bbva-form-textarea
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      value=${b(this.value)}
      ?readonly=${this.readonly}
      info-message=${b(this.infoMessage)}
      ?disabled=${this.disabled}
      maxlength=${b(this.maxlength)}
      minlength=${b(this.minlength)}
      ?auto-validate=${this.autoValidate}
      error-message=${b(this.errorMessage)}
      ?autofocus=${this.autoFocus}
      ?invalid=${this.invalid}
      help-icon=${b(this.helpIcon)}
      ?validate-on-blur=${this.validateOnBlur}
      character-counter-label=${b(this.characterCounterLabel)}
      pattern=${b(this.pattern)}
      allowed-pattern=${b(this.allowedPattern)}
      ?reset-value="${this.resetValue}"
      clear-accessible-text=${b(this.clearAccessibleText)}
      accessible-description=${b(this.accessibleDescription)}
      field-size=${b(this.fieldSize)}
      clear-icon=${b(this.clearIcon)}
    ></bbva-form-textarea>`}_inputTpl(t){return{text:this._formTextTpl,camera:this._formAttachTpl,contact:this._formAttachTpl,amount:this._formAmountTpl,date:this._formDateTpl,number:this._formNumberTpl,search:this._formSearchTpl,time:this._formTimeTpl,password:this._formPasswordTpl,textarea:this._formTextareaTpl}[t]}render(){return s` ${this._inputTpl(this.type)} `}}export{$e as B,ne as a,ye as b,gt as c,wt as d,At as e,vt as f,pe as g,ct as h,Vt as i,he as j,Dt as k,oe as l,zt as m,et as n,J as o};
