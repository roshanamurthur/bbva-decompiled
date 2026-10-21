import{z as e,a8 as o,ac as t,ad as a,ab as r,cA as l,h as i,ak as n,bf as c,an as s,aM as b,cB as m,bA as d,bz as p,bF as v,aN as u,ah as f,bx as h,i as y,av as _}from"./952f98a9.js";import{R as g,S as x,u as $,T as S,v as I,x as w,A,D as F,Y as P,V as O,W as E,F as T,G as B,Z as k,f as z}from"./216055dc.js";var D=e`
:host {
  --_form-option-focus-bg-color: var(--bbva-form-option--custom--primary-ambient--focus-bg-color,
    ${g("colorPrimaryAltSelectionInteraction01BackgroundSelected",x)});
  --_form-option-focus-color: var(--bbva-form-option--custom--primary-ambient--focus-color,
    ${g("colorPrimaryAltSelectionInteraction01TextSelected",x)});
  --_form-option-focus-unselected-maximum-label-color: var(--bbva-form-option--custom--primary-ambient--focus-unselected-maximum-label-color,
    ${g("colorPrimaryAltText02Default",x)});
  --_form-option-focus-selected-maximum-label-color: var(--bbva-form-option--custom--primary-ambient--focus-selected-maximum-label-color,
    ${g("colorPrimaryAltSelectionInteraction01TextSelected",x)});
  --_form-option-text-color:
   var(--bbva-form-option--custom--primary-ambient--text-color,
    ${g("colorPrimaryText01Default",x)});
  /** Expanded **/
  --_form-option-expanded-text-color: var(--bbva-form-option--_ambient--expanded-text-color,
    var(--bbva-form-option--custom--primary-ambient--expanded-text-color,
      ${g("colorPrimaryText01Default",x)}));
  --_form-option-expanded-option-label-color: var(--bbva-form-option--_ambient--expanded-option-label-color,
    var(--bbva-form-option--custom--primary-ambient--expanded-option-label-color,
      ${g("colorPrimaryText02Default",x)}));
  --_form-option-expanded-focus-bg-color: var(--bbva-form-option--_ambient--expanded-focus-bg-color,
    var(--bbva-form-option--custom--primary-ambient--expanded-focus-bg-color,
      ${g("colorPrimarySurfaceAlternativePressed",x)}));
  --_form-option-expanded-selected-bg-color: var(--bbva-form-option--_ambient--expanded-selected-bg-color,
    var(--bbva-form-option--custom--primary-ambient--expanded-selected-bg-color,
      ${g("colorPrimarySelectionInteraction01BackgroundSelected",x)}));
  --_form-option-expanded-selected-color: var(--bbva-form-option--_ambient--expanded-selected-color,
    var(--bbva-form-option--custom--primary-ambient--expanded-selected-color,
      ${g("colorPrimarySelectionInteraction01TextSelected",x)}));
  --_form-option-focus-outline-color: var(--bbva-form-option--_ambient--focus-outline-color,
    var(--bbva-form-option--custom--primary-ambient--focus-outline-color,
      ${g("colorPrimarySurfaceAmbientFocus",x)}));
}
`,L=e`
:host {
  display: grid;
  overflow: hidden;
  box-sizing: border-box;
  align-items: center;
  padding: 0 1rem;
  color: var(--_form-option-text-color);
  cursor: pointer;
  font-size: var(--typographyTypeSmall, ${o(t.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${o(r.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${o(r.book.fontWeight)});
  grid-template-columns: auto 1fr auto;
  line-height: var(--lineHeightTypeSmall, ${o(a.typeSmall)});
  outline: none;
  white-space: nowrap;
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

.clip {
  flex: none;
}
.clip ::slotted(*) {
  margin-right: 1rem;
}

.text {
  min-width: 0;
  flex: auto;
  margin: 0.75rem 0;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.maximum-card {
  display: grid;
  margin: 0.75rem 0;
  gap: 0 0;
  grid-template-areas: "label value" "text value";
  grid-template-columns: 3fr 1fr;
  grid-template-rows: 1fr 1fr;
}
.maximum-card .text {
  margin: 0;
  grid-area: text;
}
.maximum-card .option-label {
  color: var(--_form-option-focus-unselected-maximum-label-color);
  grid-area: label;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.maximum-card .option-value {
  align-self: center;
  margin-left: 1rem;
  grid-area: value;
  justify-self: end;
}

.maximum-other {
  display: grid;
  margin: 0.75rem 0;
  gap: 0 0;
  grid-template-columns: 1fr 1fr;
}
.maximum-other .text {
  margin: 0;
}
.maximum-other .option-value {
  align-self: center;
  justify-self: end;
}

[data-tag-name=bbva-type-icon] {
  flex: none;
  margin-left: 1rem;
}

:host([tabindex="0"]) {
  position: relative;
  z-index: 1;
  background-color: var(--_form-option-focus-bg-color);
  color: var(--_form-option-focus-color);
  outline: 0.125rem solid var(--_form-option-focus-outline-color);
  outline-offset: -0.125rem;
}
:host([tabindex="0"]) .maximum-card .option-label {
  color: var(--_form-option-focus-selected-maximum-label-color);
}

:host([aria-disabled=true]) {
  cursor: default;
  opacity: 0.4;
}

:host([expanded]) {
  color: var(--_form-option-expanded-text-color);
}
:host([expanded]) .option-label {
  color: var(--_form-option-expanded-option-label-color);
}

:host([expanded][tabindex="0"]) {
  background-color: var(--_form-option-expanded-focus-bg-color);
}
:host([expanded][tabindex="0"]) .maximum-card .option-label {
  color: var(--_form-option-expanded-option-label-color);
}

:host([expanded][aria-selected=true]) {
  background-color: var(--_form-option-expanded-selected-bg-color);
  color: var(--_form-option-expanded-selected-color);
}
:host([expanded][aria-selected=true]) .maximum-card .option-label {
  color: var(--_form-option-expanded-selected-color);
}
`;const C=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-option--_ambient--expanded-text-color: initial;
    --bbva-form-option--_ambient--expanded-option-label-color: initial;
    --bbva-form-option--_ambient--expanded-focus-bg-color: initial;
    --bbva-form-option--_ambient--expanded-selected-bg-color: initial;
    --bbva-form-option--_ambient--expanded-selected-color: initial;
    --bbva-form-option--_ambient--focus-outline-color: initial;
  }
`,N=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-option--_ambient--expanded-text-color: var(
      --bbva-form-option--custom--primary-alt-ambient--expanded-text-color,
      ${g("colorPrimaryAltText01Default",x)}
    );

    --bbva-form-option--_ambient--expanded-option-label-color: var(
      --bbva-form-option--custom--primary-alt-ambient--expanded-option-label-color,
      ${g("colorPrimaryAltText02Default",x)}
    );

    --bbva-form-option--_ambient--expanded-focus-bg-color: var(
      --bbva-form-option--custom--primary-alt-ambient--expanded-focus-bg-color,
      ${g("colorPrimaryAltSurfaceAlternativePressed",x)}
    );

    --bbva-form-option--_ambient--expanded-selected-bg-color: var(
      --bbva-form-option--custom--primary-alt-ambient--expanded-selected-bg-color,
      ${g("colorPrimaryAltSelectionInteraction01BackgroundSelected",x)}
    );

    --bbva-form-option--_ambient--expanded-selected-color: var(
      --bbva-form-option--custom--primary-alt-ambient--expanded-selected-color,
      ${g("colorPrimaryAltSelectionInteraction01TextSelected",x)}
    );

    --bbva-form-option--_ambient--focus-outline-color: var(
      --bbva-form-option--custom--primary-alt-ambient--focus-outline-color,
      ${g("colorPrimaryAltSurfaceAmbientFocus",x)}
    );
  }
`,M=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-option--_ambient--expanded-text-color: var(
      --bbva-form-option--custom--secondary-ambient--expanded-text-color,
      ${g("colorSecondaryText01Default",x)}
    );

    --bbva-form-option--_ambient--expanded-option-label-color: var(
      --bbva-form-option--custom--secondary-ambient--expanded-option-label-color,
      ${g("colorSecondaryText02Default",x)}
    );

    --bbva-form-option--_ambient--expanded-focus-bg-color: var(
      --bbva-form-option--custom--secondary-ambient--expanded-focus-bg-color,
      ${g("colorSecondarySurfaceAlternativePressed",x)}
    );

    --bbva-form-option--_ambient--expanded-selected-bg-color: var(
      --bbva-form-option--custom--secondary-ambient--expanded-selected-bg-color,
      ${g("colorSecondarySelectionInteraction01BackgroundSelected",x)}
    );


    --bbva-form-option--_ambient--expanded-selected-color: var(
      --bbva-form-option--custom--secondary-ambient--expanded-selected-color,
      ${g("colorSecondarySelectionInteraction01TextSelected",x)}
    );


    --bbva-form-option--_ambient--focus-outline-color: var(
      --bbva-form-option--custom--secondary-ambient--focus-outline-color,
      ${g("colorSecondarySurfaceAmbientFocus",x)}
    );
  }
`,V=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-option--_ambient--expanded-text-color: var(
      --bbva-form-option--custom--secondary-alt-ambient--expanded-text-color,
      ${g("colorSecondaryAltText01Default",x)}
    );

    --bbva-form-option--_ambient--expanded-option-label-color: var(
      --bbva-form-option--custom--secondary-alt-ambient--expanded-option-label-color,
      ${g("colorSecondaryAltText02Default",x)}
    );

    --bbva-form-option--_ambient--expanded-focus-bg-color: var(
      --bbva-form-option--custom--secondary-alt-ambient--expanded-focus-bg-color,
      ${g("colorSecondaryAltSurfaceAlternativePressed",x)}
    );

    --bbva-form-option--_ambient--expanded-selected-bg-color: var(
      --bbva-form-option--custom--secondary-alt-ambient--expanded-selected-bg-color,
      ${g("colorSecondaryAltSelectionInteraction01BackgroundSelected",x)}
    );

    --bbva-form-option--_ambient--expanded-selected-color: var(
      --bbva-form-option--custom--secondary-alt-ambient--expanded-selected-color,
      ${g("colorSecondaryAltSelectionInteraction01TextSelected",x)}
    );

    --bbva-form-option--_ambient--focus-outline-color: var(
      --bbva-form-option--custom--secondary-alt-ambient--focus-outline-color,
      ${g("colorSecondaryAltSurfaceAmbientFocus",x)}
    );
  }
`;const R=$([Object.freeze({__proto__:null,primary:C,primaryAlt:N,secondary:M,secondaryAlt:V}),S]),q=Object.values(R);class j extends(I(l)){static get is(){return"bbva-form-option"}static get scopedElements(){return{"bbva-type-icon":w}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},optionLabel:{type:String,attribute:"option-label"},showOptionValue:{type:Boolean,attribute:"show-option-value"},extraLabel:{type:String,attribute:"extra-label"},expanded:{type:Boolean,reflect:!0}}}constructor(){super(),this.showOptionValue=!1,this.expanded=!1}get clip(){return this.querySelector("[slot=clip]")}get labelValue(){return this.optionLabel}get _content(){return this.optionLabel?i`
        <span class="maximum-card">
          <span id="option-label" class="option-label" aria-hidden="true">${this.optionLabel}</span>
          <span class="text">
            <slot></slot>
          </span>
          <span class="option-value">${this.extraLabel||this.value}</span>
        </span>
      `:this.optionLabel||!this.extraLabel&&!this.showOptionValue?i`
      <span class="text">
        <slot></slot>
      </span>
    `:i`
        <span class="maximum-other">
          <span class="text">
            <slot></slot>
          </span>
          <span class="option-value">${this.extraLabel||this.value}</span>
        </span>
      `}static get styles(){return[L,D,q,n("bbva-form-option-shared-styles")]}render(){return i`
      <span class="clip"> <slot name="clip"></slot> </span>
      ${this._content}
      ${this.selected&&this.icon?i`
            <span class="icon">
              <bbva-type-icon .icon="${this.icon}" .size="${this.iconSize}"></bbva-type-icon
            ></span>
          `:""}
    `}}var H=e`
:host {
  --bbva-form-select-mobile-breakpoint: 992px;
  position: relative;
  display: block;
  min-height: 4rem;
  box-sizing: border-box;
}
@supports (top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
  }
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
}

:host([focus-visible]) .button:focus {
  border-radius: 0;
  outline: 0.125rem solid var(--_form-select-focus-outline-color);
}

.slot-select ::slotted(select) {
  position: absolute;
  z-index: -1;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  pointer-events: none;
}

.info-title {
  margin-bottom: var(--bbva-form-select-margin-bottom, 0.5rem);
  color: var(--_form-select-title-color);
  font-family: inherit;
  font-size: var(--bbva-form-select-font-size, var(--typographyTypeSmall, ${o(t.typeSmall)}));
  font-weight: var(--bbva-form-select-font-weight, var(--fontFacePrimaryMediumFontWeight, ${o(r.medium.fontWeight)}));
  line-height: var(--bbva-form-select-line-height, var(--lineHeightTypeSmall, ${o(a.typeSmall)}));
}

.label-out {
  display: flex;
  margin: 0.5rem 0;
}
.label-out-text {
  display: inline;
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

.label {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  color: var(--_form-select-label-color);
  transform: translateY(0.75rem);
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  will-change: transform;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
[aria-invalid=true] .label {
  color: var(--_form-select-invalid-select-label-color);
}
:host([show-value]) .label {
  width: 70%;
}
:host([readonly]) .label {
  color: var(--_form-select-readonly-label-color);
}
:host([filled]) .label {
  width: 125%;
  transform: translateY(0.15rem) scale(0.8);
  transition: transform 0.2s ease-in-out;
}
:host([filled]):not([aria-invalid=true]) .label {
  color: var(--_form-select-filled-label-color);
}
.label-value {
  position: absolute;
  top: 0;
  right: 0;
  margin-left: 1rem;
  color: var(--_form-select-label-value-color);
  transform: translateY(0.75rem);
  transform-origin: top right;
  will-change: transform;
}

.content {
  display: flex;
}
.content-text {
  overflow: hidden;
  min-width: 0;
  flex: auto;
  color: var(--_form-select-filled-label-color);
  text-overflow: ellipsis;
  white-space: nowrap;
}
:host([readonly]) .content-text {
  color: var(--_form-select-readonly-label-color);
}
.content-value {
  flex: none;
  margin-left: 1rem;
  color: var(--_form-select-label-value-color);
}
[aria-invalid=true] .content-value {
  color: var(--_form-select-invalid-select-label-value-color);
}

.button {
  position: relative;
  width: 100%;
  height: 3rem;
  padding: 0;
  border: none;
  border-radius: 0.0625rem;
  border-bottom: 0.125rem solid var(--_form-select-border-color);
  margin: 0;
  background-color: var(--_form-select-bg-color);
  color: var(--_form-select-button-color);
  cursor: pointer;
  font-family: inherit;
  font-size: var(--typographyTypeSmall, ${o(t.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${o(r.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${o(a.typeSmall)});
  outline: none;
  text-align: left;
}
.button::-moz-focus-inner {
  border: 0;
}
.button::after {
  display: none;
}
.button[aria-invalid=true] {
  border-bottom-color: var(--_form-select-invalid-select-border-color);
  background-color: var(--_form-select-invalid-select-bg-color);
}
.button[aria-invalid=true] .content-text {
  color: var(--_form-select-invalid-select-color);
}
.button[disabled] {
  cursor: default;
  opacity: 0.4;
}
:host([readonly]) .button {
  border-bottom-color: var(--_form-select-readonly-border-color);
  background-color: var(--_form-select-readonly-button-color);
  cursor: default;
}
.button-content {
  display: flex;
  height: 100%;
  align-items: center;
}
.button-clip {
  display: flex;
  max-width: 3rem;
  flex: none;
  align-items: center;
  margin-left: 1rem;
  --bbva-clip-box--_ambient--border-color: none;
}
.button-text {
  position: relative;
  min-width: 0;
  height: 100%;
  flex: auto;
  padding: 1.25rem 0 1.25rem;
  margin-left: 1rem;
}
.button-icon {
  display: flex;
  flex: none;
  align-items: center;
  justify-content: center;
  margin: 0 1rem 0 0.5rem;
}
.button-icon [data-tag-name=bbva-type-icon] {
  fill: var(--_form-select-icon-color);
}
[aria-invalid=true] .button-icon [data-tag-name=bbva-type-icon] {
  fill: var(--_form-select-invalid-select-icon-color);
}
:host([readonly]) .button-icon [data-tag-name=bbva-type-icon] {
  fill: var(--_form-select-readonly-icon-color);
}

.options-layer {
  position: fixed;
  z-index: 1;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 1rem;
  border: none;
  opacity: 0;
  transition: opacity 0.2s, visibility 0s 0.2s;
  visibility: hidden;
}
.options-layer.opened {
  opacity: 1;
  transition: opacity 0.2s, visibility 0s 0s;
  visibility: visible;
}
.options-overlay {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  background-color: var(--_form-select-overlay-bg-color);
  opacity: 0.95;
}
.options-close {
  position: absolute;
  top: max(0.5rem, var(--safe-area-inset-top));
  right: 8px;
  align-self: flex-end;
}
.options-container {
  position: relative;
  width: 100%;
}
.options-container .gradient {
  position: absolute;
  width: 100%;
  pointer-events: none;
}
.options-container .gradient.top {
  top: 0;
  left: 0;
  height: 40px;
  background: linear-gradient(var(--_form-select-options-wrapper-bg-color), transparent);
}
.options-container .gradient.bottom {
  bottom: 0;
  left: 0;
  height: 40px;
  background: linear-gradient(transparent, var(--_form-select-options-wrapper-bg-color));
}
.options-wrapper {
  max-height: 29rem;
  border-radius: 0.0625rem;
  background-color: var(--_form-select-options-wrapper-bg-color);
  box-shadow: 0 0.0625rem 0.0625rem 0 rgba(18, 18, 18, 0.2);
  overflow-y: auto;
}
.options-wrapper::-webkit-scrollbar {
  display: none;
}

:host([native-selector]) select {
  position: absolute;
  z-index: 1;
  left: 0;
  width: 100%;
  height: 3rem;
  margin: 0;
  appearance: menulist-button;
  cursor: pointer;
  opacity: 0;
  pointer-events: all;
}

:host([focus-visible][native-selector]) #button {
  outline: auto;
}

:host([native-selector]) .options-layer {
  display: none;
}

[data-tag-name=bbva-notification-help] {
  padding: 0.5rem 1rem 0;
}

@media (min-width: 992px) {
  :host {
    max-width: 32rem;
  }
}
@media (min-width: 992px) {
  :host {
    min-height: 2.5rem;
  }
  :host([size=S]) .button {
    height: 2.5rem;
  }
  :host([size=S]) .button-text {
    padding: 1.5rem 0;
  }
  :host([size=S]) .options-layer {
    top: 40px;
  }
  :host([filled][size=S]) .button-text {
    padding: 1rem 0;
  }
  :host([size=L]) .button {
    height: 3.5rem;
  }
  :host([size=L]) .button-text {
    padding: 1.5rem 0;
  }
  :host([size=L]) .label {
    padding: 0.25rem 0;
  }
  :host([size=L]) .label-value {
    transform: translateY(1rem);
  }
  :host([size=L]) .options-layer {
    top: 56px;
  }
  .options-layer {
    position: absolute;
    top: 48px;
    bottom: auto;
    display: block;
    padding: 0;
    transition: none;
  }
  .options-layer.opened {
    transition: none;
  }
  :host([label-out]) .options-layer, :host([info-title]) .options-layer {
    top: 80px;
  }
  :host([label-out][info-title]) .options-layer {
    top: 105px;
  }
  :host([help-icon]) .options-layer {
    top: 88px;
  }
  :host([size=S][help-icon]) .options-layer {
    top: 88px;
  }
  :host([size=L][help-icon]) .options-layer {
    top: 105px;
  }
  :host([size=S][info-title]) .options-layer {
    top: 72px;
  }
  :host([size=L][info-title]) .options-layer {
    top: 88px;
  }
  .options-overlay {
    display: none;
  }
  .options-gradient {
    max-width: none;
  }
  .options-gradient::before, .options-gradient::after {
    display: none;
  }
  .options-wrapper {
    min-height: 9rem;
    max-height: none;
    padding: 0;
    box-shadow: var(--boxShadowType1, ${o(c.type1)});
  }
  .options-wrapper.expanded {
    background-color: var(--_form-select-options-wrapper-expanded-bg-color);
  }
}
`,W=e`
:host {
  --_form-select-bg-color: var(--bbva-form-select--_ambient--bg-color,
    var(--bbva-form-select--custom--primary--ambient--bg-color,
      ${g("colorPrimaryFormInputBackgroundDefault",x)}));
  --_form-select-border-color: var(--bbva-form-select--_ambient--border-color,
    var(--bbva-form-select--custom--primary-ambient--border-color,
      ${g("colorPrimaryFormInputBorderInactive",x)}));
  --_form-select-readonly-border-color: var(--bbva-form-select--_ambient--readonly-border-color,
    var(--bbva-form-select--custom--primary-ambient--readonly-border-color,
      ${g("colorPrimaryFormInputBorderInactive",x)}));
  --_form-select-button-color: var(--bbva-form-select--_ambient--button-color,
    var(--bbva-form-select--custom--primary-ambient--button-color,
      ${g("colorPrimaryFormInputPlaceholderDefault",x)}));
  --_form-select-readonly-button-color: var(--bbva-form-select--_ambient--readonly-button-color,
    var(--bbva-form-select--custom--primary-ambient--readonly-button-color,
      ${g("colorPrimaryFormInputBackgroundDefault",x)}));
  --_form-select-label-color: var(--bbva-form-select--_ambient--label-color,
    var(--bbva-form-select--custom--primary-ambient--label-color,
      ${g("colorPrimaryFormInputPlaceholderDefault",x)}));
  --_form-select-filled-label-color: var(--bbva-form-select--_ambient--filled-label-color,
    var(--bbva-form-select--custom--primary-ambient--filled-label-color,
      ${g("colorPrimaryFormInputFieldTextDefault",x)}));
  --_form-select-readonly-label-color: var(--bbva-form-select--_ambient--readonly-label-color,
    var(--bbva-form-select--custom--primary-ambient--readonly-label-color,
      ${g("colorPrimaryFormInputPlaceholderDefault",x)}));
  --_form-select-label-value-color: var(--bbva-form-select--_ambient--label-value-color,
    var(--bbva-form-select--custom--primary-ambient--label-value-color,
      ${g("colorPrimaryFormInputPlaceholderDefault",x)}));
  --_form-select-icon-color: var(--bbva-form-select--_ambient--icon-color,
    var(--bbva-form-select--custom--primary-ambient--icon-color,
      ${g("colorPrimaryFormInputIconDefault",x)}));
  --_form-select-readonly-icon-color: var(--bbva-form-select--_ambient--readonly-icon-color,
    var(--bbva-form-select--custom--primary-ambient--readonly-icon-color,
      ${g("colorPrimaryFormInputIconReadOnly",x)}));
  --_form-select-invalid-select-color: var(--bbva-form-select--_ambient--invalid-select-color,
    var(--bbva-form-select--custom--primary-ambient--invalid-select-color,
      ${g("colorPrimaryFormInputFieldTextError",x)}));
  --_form-select-invalid-select-bg-color: var(--bbva-form-select--_ambient--invalid-select-bg-color,
    var(--bbva-form-select--custom--primary-ambient--invalid-select-bg-color,
      ${g("colorPrimaryFormInputBackgroundError",x)}));
  --_form-select-invalid-select-border-color: var(--bbva-form-select--_ambient--invalid-select-border-color,
    var(--bbva-form-select--custom--primary-ambient--invalid-select-border-color,
      ${g("colorPrimaryFormInputBorderError",x)}));
  --_form-select-invalid-select-label-color: var(--bbva-form-select--_ambient--invalid-select-label-color,
    var(--bbva-form-select--custom--primary-ambient--invalid-select-label-color,
      ${g("colorPrimaryFormInputPlaceholderError",x)}));
  --_form-select-invalid-select-icon-color: var(--bbva-form-select--_ambient--invalid-select-icon-color,
    var(--bbva-form-select--custom--primary-ambient--invalid-select-icon-color,
      ${g("colorPrimaryFormInputIconError",x)}));
  --_form-select-invalid-select-label-value-color: var(--bbva-form-select--_ambient--invalid-select-label-value-color,
    var(--bbva-form-select--custom--primary-ambient--invalid-select-label-value-color,
      ${g("colorPrimaryFormInputPlaceholderError",x)}));
  --_form-select-title-color: var(--bbva-form-select--_ambient--title-color,
    var(--bbva-form-select--custom--primary-ambient--title-color,
      ${g("colorPrimaryText01Default",x)}));
  --_form-select-options-wrapper-bg-color: var(--bbva-form-select--_ambient--options-wrapper-bg-color,
    var(--bbva-form-select--custom--primary-ambient--options-wrapper-bg-color,
      ${g("colorPrimarySurfaceAlternativeDefault",x)}));
  --_form-select-options-wrapper-expanded-bg-color: var(--bbva-form-select--_ambient--options-wrapper-expanded-bg-color,
  var(--bbva-form-select--custom--primary-ambient--options-wrapper-expanded-bg-color,
    ${g("colorPrimarySurfaceAlternativeDefault",x)}));
  --_form-select-overlay-bg-color: var(--bbva-form-select--custom--primary-ambient--overlay-bg-color,
    ${g("colorPrimaryAltSurfaceAmbientOverlay",x)});
  --_form-select-focus-outline-color: var(--bbva-form-select--_ambient--focus-outline-color,
    var(--bbva-form-select--custom--primary-ambient--focus-outline-color,
      ${g("colorPrimarySurfaceAmbientFocus",x)}));
  --_form-select-expanded-option-text-color: var(--bbva-form-select--_ambient--expanded-option-text-color,
  var(--bbva-form-select--custom--primary-ambient--expanded-option-text-color,
    ${g("colorPrimaryText01Default",x)}));
}
`;const U=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-select--_ambient--bg-color: initial;
    --bbva-form-select--_ambient--border-color: initial;
    --bbva-form-select--_ambient--readonly-border-color: initial;
    --bbva-form-select--_ambient--button-color: initial;
    --bbva-form-select--_ambient--readonly-button-color: initial;
    --bbva-form-select--_ambient--label-color: initial;
    --bbva-form-select--_ambient--filled-label-color: initial;
    --bbva-form-select--_ambient--readonly-label-color: initial;
    --bbva-form-select--_ambient--label-value-color: initial;
    --bbva-form-select--_ambient--icon-color: initial;
    --bbva-form-select--_ambient--readonly-icon-color: initial;
    --bbva-form-select--_ambient--invalid-select-color: initial;
    --bbva-form-select--_ambient--invalid-select-bg-color: initial;
    --bbva-form-select--_ambient--invalid-select-border-color: initial;
    --bbva-form-select--_ambient--invalid-select-label-color: initial;
    --bbva-form-select--_ambient--invalid-select-icon-color: initial;
    --bbva-form-select--_ambient--invalid-select-label-value-color: initial;
    --bbva-form-select--_ambient--title-color: initial;
    --bbva-form-select--_ambient--focus-outline-color: initial;
    --bbva-form-select--_ambient--options-wrapper-expanded-bg-color: initial;
    --bbva-form-select--_ambient--expanded-option-text-color: initial;
  }
`,Y=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-select--_ambient--bg-color: var(
      --bbva-form-select--custom--primary-alt-ambient--bg-color,
      ${g("colorPrimaryAltFormInputBackgroundDefault",x)}
    );

    --bbva-form-select--_ambient--border-color: var(
      --bbva-form-select--custom--primary-alt-ambient--border-color,
      ${g("colorPrimaryAltFormInputBorderInactive",x)}
    );

    --bbva-form-select--_ambient--readonly-border-color: var(
      --bbva-form-select--custom--primary-alt-ambient--readonly-border-color,
      ${g("colorPrimaryAltFormInputBorderInactive",x)}
    );

    --bbva-form-select--_ambient--button-color: var(
      --bbva-form-select--custom--primary-alt-ambient--button-color,
      ${g("colorPrimaryAltFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--readonly-button-color: var(
      --bbva-form-select--custom--primary-alt-ambient--readonly-button-color,
      ${g("colorPrimaryAltFormInputBackgroundDefault",x)}
    );

    --bbva-form-select--_ambient--label-color: var(
      --bbva-form-select--custom--primary-alt-ambient--label-color,
      ${g("colorPrimaryAltFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--filled-label-color: var(
      --bbva-form-select--custom--primary-alt-ambient--filled-label-color,
      ${g("colorPrimaryAltFormInputFieldTextDefault",x)}
    );

    --bbva-form-select--_ambient--readonly-label-color: var(
      --bbva-form-select--custom--primary-alt-ambient--readonly-label-color,
      ${g("colorPrimaryAltFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--label-value-color: var(
      --bbva-form-select--custom--primary-alt-ambient--label-value-color,
      ${g("colorPrimaryAltFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--icon-color: var(
      --bbva-form-select--custom--primary-alt-ambient--icon-color,
      ${g("colorPrimaryAltFormInputIconDefault",x)}
    );

    --bbva-form-select--_ambient--readonly-icon-color: var(
      --bbva-form-select--custom--primary-alt-ambient--readonly-icon-color,
      ${g("colorPrimaryAltFormInputIconReadOnly",x)}
    );

    --bbva-form-select--_ambient--invalid-select-color: var(
      --bbva-form-select--custom--primary-alt-ambient--invalid-select-color,
      ${g("colorPrimaryAltFormInputFieldTextError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-bg-color: var(
      --bbva-form-select--custom--primary-alt-ambient--invalid-select-bg-color,
      ${g("colorPrimaryAltFormInputBackgroundError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-border-color: var(
      --bbva-form-select--custom--primary-alt-ambient--invalid-select-border-color,
      ${g("colorPrimaryAltFormInputBorderError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-label-color: var(
      --bbva-form-select--custom--primary-alt-ambient--invalid-select-label-color,
      ${g("colorPrimaryAltFormInputPlaceholderError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-icon-color: var(
      --bbva-form-select--custom--primary-alt-ambient--invalid-select-icon-color,
      ${g("colorPrimaryAltFormInputIconError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-label-value-color: var(
      --bbva-form-select--custom--primary-alt-ambient--invalid-select-label-value-color,
      ${g("colorPrimaryAltFormInputPlaceholderError",x)}
    );

    --bbva-form-select--_ambient--title-color: var(
      --bbva-form-select--custom--primary-alt-ambient--title-color,
      ${g("colorPrimaryAltText01Default",x)}
    );

    --bbva-form-select--_ambient--focus-outline-color: var(
      --bbva-form-select--custom--primary-alt-ambient--focus-outline-color,
      ${g("colorPrimaryAltSurfaceAmbientFocus",x)}
    );

    --bbva-form-select--_ambient--options-wrapper-expanded-bg-color:  var(
      --bbva-form-select--custom--primary-alt-ambient--wrapper-expanded-bg-color,
      ${g("colorPrimaryAltSurfaceAlternativeDefault",x)}
    );

    --bbva-form-select--_ambient--expanded-option-text-color: var(
      --bbva-form-select--custom--primary-alt-ambient--expanded-option-text-color,
      ${g("colorPrimaryAltText01Default",x)}
    );

  }
`,G=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-select--_ambient--bg-color: var(
      --bbva-form-select--custom--secondary-ambient--bg-color,
      ${g("colorSecondaryFormInputBackgroundDefault",x)}
    );

    --bbva-form-select--_ambient--border-color: var(
      --bbva-form-select--custom--secondary-ambient--border-color,
      ${g("colorSecondaryFormInputBorderInactive",x)}
    );

    --bbva-form-select--_ambient--readonly-border-color: var(
      --bbva-form-select--custom--secondary-ambient--readonly-border-color,
      ${g("colorSecondaryFormInputBorderInactive",x)}
    );

    --bbva-form-select--_ambient--button-color: var(
      --bbva-form-select--custom--secondary-ambient--button-color,
      ${g("colorSecondaryFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--readonly-button-color: var(
      --bbva-form-select--custom--secondary-ambient--readonly-button-color,
      ${g("colorSecondaryFormInputBackgroundDefault",x)}
    );

    --bbva-form-select--_ambient--label-color: var(
      --bbva-form-select--custom--secondary-ambient--label-color,
      ${g("colorSecondaryFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--filled-label-color: var(
      --bbva-form-select--custom--secondary-ambient--filled-label-color,
      ${g("colorSecondaryFormInputFieldTextDefault",x)}
    );

    --bbva-form-select--_ambient--readonly-label-color: var(
      --bbva-form-select--custom--secondary-ambient--readonly-label-color,
      ${g("colorSecondaryFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--label-value-color: var(
      --bbva-form-select--custom--secondary-ambient--label-value-color,
      ${g("colorSecondaryFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--icon-color: var(
      --bbva-form-select--custom--secondary-ambient--icon-color,
      ${g("colorSecondaryFormInputIconDefault",x)}
    );

    --bbva-form-select--_ambient--readonly-icon-color: var(
      --bbva-form-select--custom--secondary-ambient--readonly-icon-color,
      ${g("colorSecondaryFormInputIconReadOnly",x)}
    );

    --bbva-form-select--_ambient--invalid-select-color: var(
      --bbva-form-select--custom--secondary-ambient--invalid-select-color,
      ${g("colorSecondaryFormInputFieldTextError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-bg-color: var(
      --bbva-form-select--custom--secondary-ambient--invalid-select-bg-color,
      ${g("colorSecondaryFormInputBackgroundError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-border-color: var(
      --bbva-form-select--custom--secondary-ambient--invalid-select-border-color,
      ${g("colorSecondaryFormInputBorderError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-label-color: var(
      --bbva-form-select--custom--secondary-ambient--invalid-select-label-color,
      ${g("colorSecondaryFormInputPlaceholderError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-icon-color: var(
      --bbva-form-select--custom--secondary-ambient--invalid-select-icon-color,
      ${g("colorSecondaryFormInputIconError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-label-value-color: var(
      --bbva-form-select--custom--secondary-ambient--invalid-select-label-value-color,
      ${g("colorSecondaryFormInputPlaceholderError",x)}
    );

    --bbva-form-select--_ambient--title-color: var(
      --bbva-form-select--custom--secondary-ambient--title-color,
      ${g("colorSecondaryText01Default",x)}
    );

    --bbva-form-select--_ambient--focus-outline-color: var(
      --bbva-form-select--custom--secondary-ambient--focus-outline-color,
      ${g("colorSecondarySurfaceAmbientFocus",x)}
    );

    --bbva-form-select--_ambient--options-wrapper-expanded-bg-color:  var(
      --bbva-form-select--custom--secondary-ambient--wrapper-expanded-bg-color,
      ${g("colorSecondarySurfaceAlternativeDefault",x)}
    );

    --bbva-form-select--_ambient--expanded-option-text-color: var(
      --bbva-form-select--custom--secondary-ambient--expanded-option-text-color,
      ${g("colorSecondaryText01Default",x)}
    );
  }
`,Q=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-select--_ambient--bg-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--bg-color,
      ${g("colorSecondaryAltFormInputBackgroundDefault",x)}
    );

    --bbva-form-select--_ambient--border-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--border-color,
      ${g("colorSecondaryAltFormInputBorderInactive",x)}
    );

    --bbva-form-select--_ambient--readonly-border-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--readonly-border-color,
      ${g("colorSecondaryAltFormInputBorderInactive",x)}
    );

    --bbva-form-select--_ambient--button-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--button-color,
      ${g("colorSecondaryAltFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--readonly-button-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--readonly-button-color,
      ${g("colorSecondaryAltFormInputBackgroundDefault",x)}
    );

    --bbva-form-select--_ambient--label-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--label-color,
      ${g("colorSecondaryAltFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--filled-label-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--filled-label-color,
      ${g("colorSecondaryAltFormInputFieldTextDefault",x)}
    );

    --bbva-form-select--_ambient--readonly-label-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--readonly-label-color,
      ${g("colorSecondaryAltFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--label-value-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--label-value-color,
      ${g("colorSecondaryAltFormInputPlaceholderDefault",x)}
    );

    --bbva-form-select--_ambient--icon-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--icon-color,
      ${g("colorSecondaryAltFormInputIconDefault",x)}
    );

    --bbva-form-select--_ambient--readonly-icon-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--readonly-icon-color,
      ${g("colorSecondaryAltFormInputIconReadOnly",x)}
    );

    --bbva-form-select--_ambient--invalid-select-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--invalid-select-color,
      ${g("colorSecondaryAltFormInputFieldTextError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-bg-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--invalid-select-bg-color,
      ${g("colorSecondaryAltFormInputBackgroundError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-border-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--invalid-select-border-color,
      ${g("colorSecondaryAltFormInputBorderError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-label-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--invalid-select-label-color,
      ${g("colorSecondaryAltFormInputPlaceholderError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-icon-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--invalid-select-icon-color,
      ${g("colorSecondaryAltFormInputIconError",x)}
    );

    --bbva-form-select--_ambient--invalid-select-label-value-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--invalid-select-label-value-color,
      ${g("colorSecondaryAltFormInputPlaceholderError",x)}
    );

    --bbva-form-select--_ambient--title-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--title-color,
      ${g("colorSecondaryAltText01Default",x)}
    );

    --bbva-form-select--_ambient--focus-outline-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--focus-outline-color,
      ${g("colorSecondaryAltSurfaceAmbientFocus",x)}
    );

    --bbva-form-select--_ambient--options-wrapper-expanded-bg-color:  var(
      --bbva-form-select--custom--secondary-alt-ambient--wrapper-expanded-bg-color,
      ${g("colorSecondaryAltSurfaceAlternativeDefault",x)}
    );

    --bbva-form-select--_ambient--expanded-option-text-color: var(
      --bbva-form-select--custom--secondary-alt-ambient--expanded-option-text-color,
      ${g("colorSecondaryAltText01Default",x)}
    );
  }
`;const Z=$([Object.freeze({__proto__:null,primary:U,primaryAlt:Y,secondary:G,secondaryAlt:Q}),A,F,S,P,O]),J=Object.values(Z);class K extends(I(s(E(b(m))))){static get is(){return"bbva-form-select"}static get scopedElements(){return{"bbva-type-icon":w,"bbva-form-option":j,"bbva-notification-help":T,"bbva-type-text":B,"bbva-clip-box":k,"bbva-button-default":z}}static get optionTag(){return this.getScopedTagName("bbva-form-option").toUpperCase()}static get properties(){return{openIcon:{type:String,attribute:"open-icon"},foldIcon:{type:String,attribute:"fold-icon"},closeIcon:{type:String,attribute:"close-icon"},iconSize:{type:Number,attribute:"icon-size"},showValue:{type:Boolean,attribute:"show-value"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoTitle:{type:String,attribute:"info-title"},infoMessage:{type:String,attribute:"info-message"},defaultClip:{type:Boolean,attribute:"default-clip"},nativeSelector:{type:Boolean,attribute:"native-selector"},allNative:{type:Boolean,attribute:"all-native"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:String,attribute:"help-icon"},accessibilityHelpText:{type:String,attribute:"accessibility-help-text"},accessibilityIconNotification:{type:String,attribute:"accessibility-icon-notification"},nativeSelectAccessibilityText:{type:String,attribute:"native-select-accessibility-text"},size:{type:String,reflect:!0},_gradientTop:{type:Boolean},_gradientBottom:{type:Boolean},removeLabelledbyButton:{type:Boolean,attribute:"remove-labelledby-button"},selectorAriaLabel:{type:String,attribute:"selector-aria-label"},selectorCompletedAriaLabel:{type:String,attribute:"selector-completed-aria-label"},closeButtonAriaLabel:{type:String,attribute:"close-button-aria-label"},staticEntity:{type:Boolean,attribute:"static-entity"},optionalLabel:{type:String,attribute:"optional-label"},labelMediumOut:{type:Boolean,attribute:"label-medium-out",reflect:!0},hideDarkEntity:{type:Boolean,attribute:"hide-dark-entity"},dummyEntityImage:{type:String,attribute:"dummy-entity-image"}}}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}constructor(){super(),this.openIcon=d(),this.foldIcon=p(),this.closeIcon=v(),this.iconSize=24,this.errorIcon=u(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=f(),this.infoIconSize=16,this.infoMessage="",this.infoTitle="",this.name="selector",this.nativeSelector=!1,this.accessibilityIconNotification="",this.nativeSelectAccessibilityText="",this.removeLabelledbyButton=!1,this.allNative=!1,this.size="M",this.optionalLabel="bbva-form-select-optional-label",this._gradientTop=!1,this.labelMediumOut=!1,this._gradientBottom=!1,this.staticEntity=!1,this.hideDarkEntity=!1,this.dummyEntityImage="https://assets.bbvaexperience.com/visual/icons/entities/dummy.svg",this.addEventListener("change",this._fireSelectedItem),this.addEventListener("keydown",this._handleFocusOverlay)}firstUpdated(e){super.firstUpdated(e),this.addEventListener("slotschanges",this._slotChanges)}updated(e){super.updated&&super.updated(e),e.has("items")&&(this._items=[...this.shadowRoot.querySelectorAll(this.allNative?"option":this.constructor.optionTag.toLowerCase())],this._updateOptions()),e.has("_selectedOption")&&(this._selectedOptionText?this.setAttribute("filled",""):this.removeAttribute("filled")),e.has("size")&&"M"!==this.size&&!this._shouldBeExpanded()&&(this.size="M"),e.has("opened")&&(this._openedStatus(),this._gradientBottom=this._isScrollable(),!this.opened||this.nativeSelector||this._shouldBeExpanded()?this.opened||this.nativeSelector||this._shouldBeExpanded()||(document.body.style.overflow="visible"):document.body.style.overflow="hidden")}_openedStatus(){this.dispatchEvent(new CustomEvent("bbva-form-select-options-open",{bubbles:!0,composed:!0,detail:{opened:this.opened}}))}_shouldBeExpanded(){return this._desktop}_slotChanges(e){const{contentSlots:o}=e.detail,t=o;o.forEach(((e,o)=>{this._shouldBeExpanded()&&e.assignedNodes.tagName.toLowerCase()===this.constructor.optionTag.toLowerCase()&&(t[o].assignedNodes.expanded=!0)}))}_shouldUpdateOptions(){var e;let o=!(null!==(e=this._options)&&void 0!==e&&e.length&&this._items.length===this._options.length&&this._options.every((e=>this._items.includes(e))));return this.allNative&&(o=o&&this._items.length>0),o}async _updateValue(e){if(this._rendered||await this.updateComplete,String(this.value)!==e){const o=this._options.find((o=>o.value===e));o?this._selectItem(o):this._unselect()}}_updateOptions(){this._options=this._shouldUpdateOptions()?this._lightNodes.concat(this._items):this._options,this._enabledOptions=this._options.filter((e=>!e.disabled));const e=this._options.find((e=>e.selected));e?this._selectItem(e):this._unselect(),this.requestUpdate()}get _errorVisible(){return this.errorMessage&&this.invalid}get _selectedOptionText(){return this._selectedOption&&this._selectedOption.labelValue?this._selectedOption.labelValue:this._selectedOption&&this._selectedOption.text}get _selectedOptionLabel(){return this._selectedOption&&this._selectedOption.labelValue&&this._selectedOption.text?this._selectedOption.text:""}get _selectedOptionClip(){return this._selectedOption&&this._selectedOption.clip}get _selectedOptionValue(){return this._selectedOption&&this._selectedOption.value}get _selectedOptionExtraLabel(){return this._selectedOption&&this._selectedOption.extraLabel}static get styles(){return[super.styles,h(".button:focus"),H,W,J,n("bbva-form-select-shared-styles")]}get field(){return i` ${this._control} ${this._optionsLayer} ${this._select} `}get _control(){return i`
      <button
        id="button"
        class="button"
        ?disabled="${this.disabled}"
        aria-expanded="${y(this.opened)}"
        aria-invalid="${this.invalid}"
        aria-haspopup="listbox"
        aria-describedby="${y(this.infoMessage?"notification-help":void 0)}"
        aria-label=${y(this._getAriaLabelSelector)}
        aria-labelledby=${y(this.removeLabelledbyButton?void 0:"label button")}
        @click="${this._onButtonClick}"
        aria-hidden=${this.nativeSelector||this.allNative}
        tabindex=${this.nativeSelector?"-1":"0"}
      >
        ${this._controlContent}
      </button>
    `}get _getAriaLabelSelector(){const e={selector:this.label,optionChecked:this._selectedOptionText},o=this.t(this.selectorAriaLabel,e),t=this.t(this.selectorCompletedAriaLabel,e);return this._selectedOptionText?t:o}get _controlContent(){return i`
      <span class="button-content">
        ${this._clip}
        <span class="button-text">
          ${this._label}
          <span class="content">
            <span class="content-text"> ${this._selectedOptionText} </span>
            ${this._selectedOptionExtraLabel||this.showValue?i`
                  <span class="content-value">
                    ${this._selectedOptionExtraLabel||this._selectedOptionValue}
                  </span>
                `:""}
          </span>
        </span>
        ${this._selectIcon}
      </span>
    `}get _clip(){if(this._selectedOptionClip){var e,o;let n;if("bbva-clip-box"===(null===(e=this._selectedOptionClip)||void 0===e||null===(o=e.dataset)||void 0===o?void 0:o.tagName)){var t,a,r,l;const e=null===(t=this._selectedOptionClip.attributes)||void 0===t||null===(a=t.name)||void 0===a?void 0:a.value,o=null===(r=this._selectedOptionClip.shadowRoot.firstElementChild)||void 0===r?void 0:r.icon,c=null===(l=this._selectedOptionClip.shadowRoot.firstElementChild)||void 0===l?void 0:l.size;n=i`
          <bbva-clip-box
            slot="clip"
            name="${e}"
            .group="${[{icon:o,size:c}]}"
            .mode="${this.mode}"
            .ambient="${this.ambient}"
            ?static-entity="${this.staticEntity}"
            ?hide-dark-entity="${this.hideDarkEntity}"
            .dummyEntityImage="${this.dummyEntityImage}"
          ></bbva-clip-box>
        `}else n=this._selectedOptionClip.cloneNode(!0);return i` <span class="button-clip" aria-hidden="true"> ${n} </span> `}if(this.defaultClip&&void 0!==this.item(0)&&this.item(0).clip){var n,c;let e;if("bbva-clip-box"===(null===(n=this.item(0).clip)||void 0===n||null===(c=n.dataset)||void 0===c?void 0:c.tagName)){var s,b,m,d;const o=null===(s=this.item(0).clip.attributes)||void 0===s||null===(b=s.name)||void 0===b?void 0:b.value,t=null===(m=this.item(0).clip.shadowRoot.firstElementChild)||void 0===m?void 0:m.icon,a=null===(d=this.item(0).clip.shadowRoot.firstElementChild)||void 0===d?void 0:d.size;e=i`
          <bbva-clip-box
            slot="clip"
            name="${o}"
            .group="${[{icon:t,size:a}]}"
            .mode="${this.mode}"
            .ambient="${this.ambient}"
            ?static-entity="${this.staticEntity}"
            ?hide-dark-entity="${this.hideDarkEntity}"
            dummy-entity-image="${this.dummyEntityImage}"
          ></bbva-clip-box>
        `}else e=this.item(0).clip.cloneNode();return i` <span class="button-clip" aria-hidden="true"> ${e} </span> `}return""}get _label(){return this.labelOut&&!this.label&&(this.label=this.labelOut),i`
      <span id="label" class="label">${this._labelToShow}</span>
      ${this.showValue&&!this._selectedOptionValue?i` <span id="label-value" class="label-value">Value</span> `:""}
    `}get _labelToShow(){let e;return e=this._selectedOption&&this._selectedOptionLabel?this._selectedOptionLabel:this.label,i` ${e} `}get _selectIcon(){return i`
      <span class="button-icon" aria-hidden="true">
        <bbva-type-icon
          .icon="${this.opened?this.foldIcon:this.openIcon}"
          .size="${this.iconSize}"
        ></bbva-type-icon>
      </span>
    `}get _helpIcon(){return this.helpIcon&&this.labelOut?i`
          <div class="right-align-container">
            <bbva-button-default
              @click="${this._helpClicked}"
              variant="icon no-background"
              .icon="${this.helpIcon}"
              icon-size="16"
              aria-label="${this.t(this.accessibilityHelpText)}"
              aria-describedby="help-text"
            >
            </bbva-button-default>
          </div>
        `:""}_helpClicked(){this.dispatchEvent(new CustomEvent("form-select-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _optionsLayer(){return i`
      <div class="options-layer ${this.opened&&!this.nativeSelector?"opened":""}">
        <div class="options-overlay"></div>
        <bbva-button-default
          ambient="secondary"
          class="options-close"
          variant="icon no-background alternative"
          .icon="${this.closeIcon}"
          icon-size="${this.iconSize}"
          @click="${this._handleCloseClick}"
          aria-label=${y(this.closeButtonAriaLabel)}
          ?hidden=${this._shouldBeExpanded()}
        >
        </bbva-button-default>
        <div class="options-container">
          <div
            class="${_({gradient:this._isScrollable(),top:this._gradientTop})}"
          ></div>
          <div
            class="options-wrapper ${this._shouldBeExpanded()?"expanded":""}"
            @scroll="${this._onScroll}"
          >
            ${this._optionsList}
          </div>
          <div
            class="${_({gradient:this._isScrollable(),bottom:this._gradientBottom})}"
          ></div>
        </div>
      </div>
    `}_isScrollable(){return!this._shouldBeExpanded()&&this._options.length>9}_onScroll(e){const o=(null==e?void 0:e.target)||this.shadowRoot.querySelector(".options-wrapper");if(o){o.clientHeight<o.scrollHeight&&(this._gradientTop=o.scrollTop>0,this._gradientBottom=o.scrollTop+1+o.clientHeight<o.scrollHeight)}}_handleCloseClick(){this.opened=!1}_handleFocusOverlay(e){9===e.keyCode&&this.opened&&this.shadowRoot.querySelector(".options-close").focus()}_onOptionFocusout(){setTimeout((()=>{const e=this.shadowRoot.activeElement||this._rootNode.activeElement;this._shouldBeExpanded()&&this._options.indexOf(e)<0&&e!==this._button&&(this.opened=!1)}),0)}get _labelOut(){return this.labelOut?i`
        <div class="label-out">
          <div>
            <bbva-type-text
              tag="label"
              class="label-out-text"
              font-weight="${this.labelMediumOut?"500":""}"
              unset
              size="S"
              id="help-text"
              for="${this.nativeSelector||this.allNative?"selector":"button"}"
              .text=${this.required,`${this.labelOut}`}
            ></bbva-type-text>
            <bbva-type-text
              unset
              class="label-out-text optional"
              text="${this.optionalLabel?`${this.optionalLabel}`:""}"
              size="S"
            >
            </bbva-type-text>
          </div>
          ${this._helpIcon}
        </div>
      `:""}_optionItemTemplate(e){return i`
      <bbva-form-option
        ?expanded=${this._shouldBeExpanded()}
        ?disabled="${e.disabled}"
        ?selected="${e.selected}"
        .value="${e.value}"
        >${e.text}</bbva-form-option
      >
    `}get messageError(){return this._errorVisible?i`
          <bbva-notification-help
            class="alert"
            role="alert"
            accessibility-label-icon="${this.accessibilityIconNotification}"
            .icon="${this.errorIcon}"
            .size="${this.errorIconSize}"
            text="${this.errorMessage}"
            variant="alert"
          ></bbva-notification-help>
        `:""}get messageInfo(){return this.infoMessage?i`
          <bbva-notification-help
            id="notification-help"
            accessibility-label-icon="${this.accessibilityIconNotification}"
            .icon="${this.infoIcon}"
            size="${this.infoIconSize}"
            text="${this.infoMessage}"
          ></bbva-notification-help>
        `:""}get textTitle(){return this.infoTitle?i`
          <div class="info-title">
            <span>${this.infoTitle}</span>
          </div>
        `:""}get _nativeSelect(){return i`
      <select
        id="selector"
        name="${this.name}"
        aria-label="${y(this.nativeSelectAccessibilityText?this.nativeSelectAccessibilityText:void 0)}"
        aria-describedby="${y(this.infoMessage?"notification-help":void 0)}"
        ?disabled="${this.disabled}"
        ?required="${this.required}"
        @invalid="${this._onInvalid}"
        @change="${e=>this._handleNativeOptionClick(e)}"
      >
        ${this.items.map((e=>i` <option
              ?selected="${e.selected}"
              value="${e.value}"
              ?disabled="${e.disabled}"
            >
              ${e.text}
            </option>`))};
      </select>
    `}get _hybridNativeSelect(){const e=this.querySelectorAll('[data-tag-name="bbva-form-option"]'),o=e.length>0?Array.from(e):this.items;return i`
      <select
        id="selector"
        name="${this.name}"
        aria-label="${y(this.nativeSelectAccessibilityText?this.nativeSelectAccessibilityText:void 0)}"
        aria-describedby="${y(this.infoMessage?"notification-help":void 0)}"
        ?disabled="${this.disabled}"
        ?required="${this.required}"
        @invalid="${this._onInvalid}"
        @change="${e=>this._handleNativeOptionClick(e)}"
        class="focus-only"
      >
        ${o.map((e=>i` <option
              ?selected="${e.selected}"
              value="${e.value}"
              ?disabled="${e.disabled}"
            >
              ${e.text} ${this.showValue?e.extraLabel||e.value:""}
            </option>`))}
      </select>
      ${this._control}${this._optionsLayer} ${this._select}
    `}_handleNativeOptionClick(e){null!=e&&e.target&&(this.selectedIndex=e.target.selectedIndex,this.value=e.target.value,this.dispatchEvent(new CustomEvent("change",{bubbles:!0,composed:!0})))}_fireSelectedItem(){this._updateOptions(),this.dispatchEvent(new CustomEvent("bbva-form-select-selected-item",{bubbles:!0,composed:!0,detail:{selectedIndex:this.selectedIndex,value:this.value}}))}get _selector(){return this.allNative?this._nativeSelect:this.nativeSelector?this._hybridNativeSelect:this.field}render(){return i`
      ${this.textTitle} ${this._labelOut} ${this._selector} ${this.messageError} ${this.messageInfo}
    `}}export{j as B,K as a,Z as b,R as c};
