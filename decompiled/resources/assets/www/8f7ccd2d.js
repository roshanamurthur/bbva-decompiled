import{z as e,a8 as a,ac as i,ad as t,ab as o,ar as r,a9 as n,aa as l,b_ as s,a as c,aJ as d,cE as p,F as m,cF as b,b$ as h,ak as v,bx as y,h as u,bt as g,c0 as f,cG as k,g as _,cs as $,b0 as S,an as C,ct as T,aH as w,ag as L,af as x,b6 as M,bF as I,aN as P,ah as z,i as E,cu as A,f as D,o as B,dZ as V,aG as O,cZ as q,c_ as R,be as F,cS as N,L as j,bU as H,c$ as Z,m as G}from"./952f98a9.js";const W=new r;var U=e`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${a(i.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${a(t.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(o.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(o.medium.fontStyle)});
  width: 100%;
  height: 100%;
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${a(n.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${a(n.primaryCoreDark)})));
  --_dark-display: var(--bbva-button-action-card-logo-dark-mode-dark-display, var(--bbva-button-action-card-logo-dark-display, none));
  --_light-display: var(--bbva-button-action-card-logo-dark-mode-light-display, var(--bbva-button-action-card-logo-light-display, inline));
}

:host(:not([href])) {
  border: none;
  border-radius: 0;
  color: var(--_button-action-color);
}
:host(:not([href]))[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

[data-tag-name=bbva-icon] {
  fill: var(--_button-action-color);
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: transparent;
  color: var(--_button-action-active-color);
}
:host(:not([href])[active]:not([aria-disabled=true])) [data-tag-name=bbva-icon] {
  fill: var(--_button-action-active-color);
}

.app-pay-icon svg {
  height: 1.5rem;
  max-width: 3rem;
}
.app-pay-icon svg .dark, .app-pay-icon svg.dark {
  display: var(--_dark-display);
}
.app-pay-icon svg .light, .app-pay-icon svg.light {
  display: var(--_light-display);
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

.text {
  cursor: pointer;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  overflow-wrap: anywhere;
  hyphens: auto;
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  .text {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${W.mediaRules()}`;var X=e`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${(new r).mediaRules()}`;const Y=new r;const K={dark:e`
    ${e`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${a(n.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${Y.mediaRules()}`}
    ${s.dark}
  `,light:e`
    ${X}
    ${s.light}
  `};class J extends(c(d(p))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":m,"bbva-core-image":b,"bbva-badge-notification":h}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,U,v("bbva-button-action-shared-styles"),y(),K.light,K.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?u`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?u`<div class="app-pay-icon">${g[this.appPayIcon]}</div>`:u`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return u`
      ${this.notifications?u`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:u` ${this.getIcon} `}
      <span class="text" onclick="void(0)"> ${this.label} </span>
      <slot></slot>
      ${this._action}
    `}}_("colors.primarySubdued"),_("colors.primaryCoreLight");const Q=new r;var ee=e`[ambient^=light] {
  --bbva-form-field-bg-color: initial;
  --bbva-form-field-input-color: initial;
  --bbva-form-field-readonly-input-color: initial;
  --bbva-form-field-placeholder-color: initial;
  --bbva-form-field-label-color: initial;
  --bbva-form-field-focused-label-color: initial;
  --bbva-form-field-readonly-label-color: initial;
  --bbva-form-field-border-color: initial;
  --bbva-form-field-focused-border-color: initial;
  --bbva-form-field-readonly-clear-color: initial;
  --bbva-form-field-message-color: initial;
  --bbva-form-field-message-icon-color: initial;
  --bbva-form-field-info-message-color: initial;
  --bbva-form-field-info-message-icon-color: initial;
  --bbva-form-field-invalid-field-bg-color: initial;
  --bbva-form-field-invalid-input-color: initial;
  --bbva-form-field-invalid-field-border-color: initial;
  --bbva-form-field-invalid-label-color: initial;
  --bbva-form-field-invalid-clear-color: initial;
  --bbva-form-field-label-out-color: initial;
  --bbva-form-field-help-icon-color: initial;
  --bbva-form-field-action-icon-color: initial;
  --bbva-form-field-readonly-icon-color: initial;
  --bbva-form-field-icon-color-variant: initial;
  --bbva-form-field-icon-color-focus-variant: initial;
  --bbva-form-field-icon-color-disabled-variant: initial;
}

[ambient^=light100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
}
${Q.mediaRules()}`;const ae=new r;const ie={dark:e`
    ${e`[ambient^=dark] {
  --bbva-form-field-bg-color: #0A5393;
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsSecondary300, ${a(n.secondary300)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${a(n.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${a(n.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${a(n.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${a(n.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${a(n.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${a(n.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${a(n.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${a(n.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${a(n.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${a(n.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${a(n.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${a(n.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
}
${ae.mediaRules()}`}
    ${$.dark}
    ${S.dark}
  `,light:e`
    ${ee}
    ${$.light}
    ${S.light}
  `};var te=e`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${a(n.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${a(n.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${a(n.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${a(n.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${a(n.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${a(n.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${a(n.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${a(n.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${a(n.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${a(n.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${a(n.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${a(n.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${a(n.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${a(n.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${a(n.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${a(n.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${a(n.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${a(n.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${a(n.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${a(n.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${a(n.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${a(n.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${a(n.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${a(n.tertiaryType1Dark)})));
  --bbva-button-icon-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${a(n.primaryMedium)})));
  --bbva-button-icon-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${a(n.primaryCore)})));
  --bbva-button-icon-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${a(n.primaryMedium)})));
  display: block;
  box-sizing: border-box;
  position: relative;
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
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  flex: auto;
  border-bottom: 1px solid var(--_field-border-color);
  background-color: var(--_field-bg-color);
}
:host([focused]) .field {
  border-bottom-color: var(--_field-focused-border-color);
}
:host([invalid]:not([action-into-form])) .field {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}

.slot-input ::slotted(input) {
  width: 100%;
  height: 100%;
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${a(i.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  color: var(--_field-input-placeholder-color);
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
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${a(i.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${a(t.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${a(o.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

.label-out-text {
  font-family: inherit;
  font-size: var(--bbva-form-field-label-out-font-size, var(--typographyTypeSmall, ${a(i.typeSmall)}));
  line-height: var(--bbva-form-field-label-out-line-height, var(--lineHeightTypeSmall, ${a(t.typeSmall)}));
  color: var(--_field-label-out-color);
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host([focused]) .clear, :host([invalid][filled]) .clear {
  display: flex;
}
:host([readonly]) .clear {
  color: var(--_field-readonly-clear-color);
}

:host([invalid]) {
  /* Remove Firefox invalid inputs red border */
}
:host([invalid]) .slot-input ::slotted(input),
:host([invalid]) .slot-input ::slotted(input:invalid) {
  box-shadow: none;
  color: var(--_invalid-field-input-color);
}
:host([invalid]) .label {
  color: var(--_invalid-field-label-color);
}
:host([invalid]) .clear, :host([invalid]):host([action-into-form][action-variant]) .action {
  color: var(--_invalid-field-clear-color);
}

:host([action-into-form]) .action {
  flex: 0 0 auto;
}
:host([action-into-form]) .wrapper {
  display: flex;
  align-items: center;
  background-color: var(--_field-bg-color);
  border-bottom: 1px solid var(--_field-border-color);
}
:host([action-into-form]):host([invalid]) .field, :host([action-into-form]) .field {
  background-color: transparent;
  border-bottom: none;
}
:host([action-into-form]) .wrapper-action {
  display: flex;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_action-icon-color);
}
:host([action-into-form]):host([readonly]).wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_field-readonly-icon-color);
}
:host([action-into-form]):host([invalid]) .wrapper {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}
:host([action-into-form]):host([invalid]) .wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_invalid-action-icon-color);
  --bbva-button-icon-color: var(--_invalid-action-icon-color);
}

:host(:not([action-into-form])) .wrapper .field {
  border-bottom: none;
  background-color: transparent;
}

:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: none;
}
:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: 1px solid var(--_field-border-color);
}

.message {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem) 0;
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${a(i.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${a(t.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}
.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  color: var(--_message-icon-color);
  min-width: 1rem;
  min-height: 1rem;
}
.info .message-icon {
  color: var(--_info-message-icon-color);
}

:host(:not([action-into-form])[disabled]) .field, :host([disabled]) [data-tag-name=bbva-core-icon], :host([disabled]) .wrapper {
  opacity: 0.4;
}
`;class oe extends(c(C(T))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-button-icon":w,"bbva-text":L,"bbva-core-icon":x,"bbva-link":M}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=24,this.actionAccessibleText="bbva-form-field-submit",this.actionIntoForm=!1,this.clearIcon=I(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-field-clear",this.optionalLabel="bbva-form-field-optional-label",this.errorIcon=P(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=z(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1}firstUpdated(e){super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const a=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",a.style.display="none",a.innerHTML=this.inputInnerStyles,this.appendChild(a)}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||void 0===e.get("value")||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const e=this.invalid?this.errorMessage:"";return e&&this.infoMessage?`${e}. ${this.infoMessage}`:e||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.label}`:`${this.label} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?u`
          <bbva-link
            @click="${this._helpClicked}"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            href="${E(this.linkHref)}"
            aria-label="${this.t("bbva-form-field-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?u`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `:""}static get styles(){return[super.styles,te,ie.light,ie.dark,v("bbva-form-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return u`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return u`
      <div
        class="wrapper"
        @keydown="${e=>13===e.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field} ${!this.readonly&&this.actionType?this.actionButton:this.rightIcon}
      </div>
    `}get clearButton(){return u`
      <bbva-button-icon
        tabindex="-1"
        class="clear"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearInput}"
        variant="no-background"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-icon>
    `}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return u` <bbva-button-icon
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      .variant="${this.actionVariant}"
    >
    </bbva-button-icon>`}get rightIcon(){return this.actionIcon?u`
          <div class="wrapper-action">
            <bbva-core-icon
              .icon="${this.actionIcon}"
              .size="${this.actionIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?u`
          <div class="message error" role="alert">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.errorMessage)}</span>
          </div>
        `:""}get messageInfo(){return this.infoMessage?u`
          <div class="message info">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.infoIcon}"
              .size="${this.infoIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.infoMessage)}</span>
          </div>
        `:""}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const e=this._rootNode.activeElement,a=this.shadowRoot.activeElement||e;this._field.contains(a)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus"))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur"))}clearInput(){this._formElement&&(this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus())}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return u`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}}var re={...A,...D,...B,bbvaFormField:`\n    --bbva-form-field-bg-dark-mode-color: ${_("colors.cool70")};\n    --bbva-form-field-input-dark-mode-color: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-placeholder-dark-mode-color: ${_("colors.cool20")};\n    --bbva-form-field-readonly-input-dark-mode-color: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-readonly-clear-dark-mode-color: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-readonly-icon-dark-mode-color: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-label-out-dark-mode-color: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-label-dark-mode-color: ${_("colors.cool20")};\n    --bbva-form-field-focused-label-dark-mode-color: ${_("colors.cool20")};\n    --bbva-form-field-readonly-label-dark-mode-color: ${_("colors.cool20")};\n    --bbva-form-field-border-dark-mode-color: ${_("colors.cool20")};\n    --bbva-form-field-focused-border-dark-mode-color: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-message-dark-mode-color: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-message-icon-dark-mode-color: ${_("colors.tertiaryType1Light")};\n    --bbva-form-field-info-message-dark-mode-color: ${_("colors.cool20")};\n    --bbva-form-field-info-message-icon-dark-mode-color: ${_("colors.cool20")};\n    --bbva-form-field-invalid-field-bg-dark-mode-color: ${_("colors.cool70")};\n    --bbva-form-field-invalid-input-dark-mode-color: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-invalid-field-border-dark-mode-color: ${_("colors.tertiaryType1Light")};\n    --bbva-form-field-invalid-label-dark-mode-color: ${_("colors.tertiaryType1Light")};\n    --bbva-form-field-invalid-clear-dark-mode-color: ${_("colors.tertiaryType1Light")};\n    --bbva-form-field-help-icon-dark-mode-color: ${_("colors.primarySubdued")};\n    --bbva-form-field-action-icon-dark-mode-color: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-invalid-action-icon-dark-mode-color: ${_("colors.tertiaryType1Light")};\n    --bbva-form-field-icon-dark-mode-color-variant: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-icon-dark-mode-color-focus-variant: ${_("colors.primaryCoreLightened")};\n    --bbva-form-field-icon-dark-mode-color-disabled-variant: ${_("colors.primaryCoreLightened")};\n  `};var ne=e`:host {
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

.action {
  flex: none;
}
${(new r).mediaRules()}`;const le={light:e`
    ${ie.light}
    ${$.light}
  `,dark:e`
    ${ie.dark}
    ${$.dark}
  `};class se extends(c(C(oe))){static get is(){return"bbva-form-search"}static get scopedElements(){return{"bbva-button-icon":w,"bbva-core-icon":x,"bbva-text":L}}static get properties(){return{disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String}}}constructor(){super(),this.type="search",this.actionType="submit",this.actionIcon=V(),this.actionAccessibleText="bbva-form-search-submit",this.actionIntoForm=!0}firstUpdated(e){super.firstUpdated(e),this._field=this.shadowRoot.querySelector(".field"),this._action=this.shadowRoot.querySelector(".action")}updated(e){super.updated&&super.updated(e),e.has("variant")&&"trigger"===this.variant&&this._field.addEventListener("click",this.handleInputClick)}static get styles(){return[super.styles,ne,v("bbva-form-search-shared-styles"),le.light,le.dark]}handleInputClick(){this.dispatchEvent(new CustomEvent("form-search-input-click",{detail:!0,bubbles:!0,composed:!0}))}get actionButton(){return u`
      <bbva-button-icon
        class="action"
        type="${this.actionType}"
        ?disabled="${this.disabled||this.disabledButton||this.readonly||!this.value}"
        .icon="${this.actionIcon}"
        .size="${this.actionIconSize}"
        @click="${this.submitInput}"
        aria-label="${this.t(this.actionAccessibleText)}"
      >
      </bbva-button-icon>
    `}submitInput(){this.value&&this.dispatchEvent(new CustomEvent("form-search-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}}const ce=new r;var de=e`:host {
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
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}
${ce.mediaRules()}`;const pe={dark:e`
    ${ie.dark}
  `,light:e`
    ${ie.light}
  `};class me extends(c(oe)){static get is(){return"bbva-form-text"}static get scopedElements(){return{"bbva-clip-flag":O,"bbva-button-icon":w,"bbva-core-icon":x,"bbva-text":L}}static get properties(){return{flagSize:{type:String,attribute:"flag-size"},flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="text",this.flagSize="small",this.flagText=""}static get styles(){return[super.styles,de,pe.light,pe.dark,v("bbva-form-text-shared-styles")]}get field(){return u`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return u`
      ${this.flag?u`
            <span class="flag">
              <bbva-clip-flag
                icon="${E(this.flag)}"
                .size="${this.flagSize}"
                iconset="${E(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get labelBlock(){return u`
      <span class="label" aria-hidden="true" @click="${this.focus}">${this.inputLabel}</span>
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}const be=u`<path
 d="M 20 0 C 8.9542 0 0 8.596 0 19.2 C 0 19.3896 0.0036 19.5784 0.0092 19.7665 C 0.4034 36.7211 18.3292 47.551 18.3292 47.551 C 19.2404 48.1452 20.7328 48.1464 21.6366 47.5738 C 21.6366 47.5738 39.5952 36.722 39.9906 19.7673 C 39.9964 19.579 40 19.3898 40 19.2 C 40 8.596 31.0456 0 20 0"/>`,he=u`<svg
  viewBox="0 0 256.838 296.314"
  fill="%23D44B50"
  xmlns="http://www.w3.org/2000/svg"
>
  <g transform="matrix(1, 0, 0, 1, -142.33551, -61.229153)">
    <ellipse
      style="fill: rgb(102, 102, 102); fill-opacity: 0.2;"
      cx="273.721"
      cy="321.492"
      rx="114.511"
      ry="27.002"
    />
    <path
      class="b3ff8878-6a29-4f39-9df9-293c61801d2a"
      d="M 271.579 65.283 C 216.331 65.255 171.529 110.035 171.529 165.283 L 171.529 168.283 C 173.529 256.573 263.179 312.963 263.179 312.963 C 267.779 316.063 275.179 316.063 279.679 313.063 C 279.679 313.063 369.529 256.573 371.529 168.283 L 371.529 165.283 C 371.618 110.037 326.825 65.222 271.579 65.283 Z M 271.579 215.283 C 233.089 215.283 209.033 173.616 228.278 140.283 C 247.523 106.949 295.635 106.949 314.88 140.283 C 319.269 147.884 321.579 156.506 321.579 165.283 C 321.579 192.897 299.193 215.283 271.579 215.283 Z"
      style="fill: rgb(212, 75, 80);"
    />
  </g>
</svg>`,ve=u`<svg
  viewBox="0 0 256.838 296.314"
  fill="%23D44B50"
  xmlns="http://www.w3.org/2000/svg"
>
  <g transform="matrix(1, 0, 0, 1, -142.33551, -61.229153)">
    <ellipse
      style="fill: rgb(102, 102, 102); fill-opacity: 0.7;"
      cx="273.721"
      cy="321.492"
      rx="114.511"
      ry="27.002"
    />
    <path
      class="b3ff8878-6a29-4f39-9df9-293c61801d2a"
      d="M 271.579 65.283 C 216.331 65.255 171.529 110.035 171.529 165.283 L 171.529 168.283 C 173.529 256.573 263.179 312.963 263.179 312.963 C 267.779 316.063 275.179 316.063 279.679 313.063 C 279.679 313.063 369.529 256.573 371.529 168.283 L 371.529 165.283 C 371.618 110.037 326.825 65.222 271.579 65.283 Z M 271.579 215.283 C 233.089 215.283 209.033 173.616 228.278 140.283 C 247.523 106.949 295.635 106.949 314.88 140.283 C 319.269 147.884 321.579 156.506 321.579 165.283 C 321.579 192.897 299.193 215.283 271.579 215.283 Z"
      style="fill: rgb(243, 94, 97);"
    />
  </g>
</svg>`,ye=[{featureType:"all",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"all",elementType:"geometry",stylers:[{visibility:"simplified"}]},{featureType:"all",elementType:"labels",stylers:[{visibility:"simplified"}]},{featureType:"administrative",elementType:"geometry.stroke",stylers:[{color:"#1973b8"}]},{featureType:"administrative",elementType:"labels.text.fill",stylers:[{color:"#444444"}]},{featureType:"administrative.locality",elementType:"labels.text.fill",stylers:[{color:"#ffffff"}]},{featureType:"administrative.neighborhood",elementType:"labels.text.fill",stylers:[{color:"#f4f4f4"}]},{featureType:"landscape",elementType:"all",stylers:[{color:"#f2f2f2"}]},{featureType:"landscape",elementType:"geometry",stylers:[{visibility:"on"},{color:"#072146"}]},{featureType:"landscape",elementType:"labels",stylers:[{color:"#ffffff"},{visibility:"on"}]},{featureType:"landscape",elementType:"labels.text.fill",stylers:[{visibility:"on"},{color:"#ffffff"}]},{featureType:"landscape",elementType:"labels.text.stroke",stylers:[{color:"#ffffff"}]},{featureType:"landscape.man_made",elementType:"all",stylers:[{visibility:"simplified"},{hue:"#ff0000"}]},{featureType:"landscape.man_made",elementType:"geometry.fill",stylers:[{color:"#072146"}]},{featureType:"landscape.man_made",elementType:"geometry.stroke",stylers:[{color:"#043263"}]},{featureType:"landscape.natural",elementType:"all",stylers:[{visibility:"on"},{color:"#d9efec"}]},{featureType:"landscape.natural.landcover",elementType:"geometry.fill",stylers:[{color:"#043263"}]},{featureType:"landscape.natural.terrain",elementType:"all",stylers:[{visibility:"on"},{lightness:"31"},{hue:"#00fdff"}]},{featureType:"poi",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"poi.attraction",elementType:"geometry.fill",stylers:[{color:"#004481"}]},{featureType:"poi.park",elementType:"all",stylers:[{visibility:"simplified"},{color:"#2dcccd"},{lightness:"85"}]},{featureType:"poi.park",elementType:"geometry.fill",stylers:[{color:"#072146"}]},{featureType:"road",elementType:"all",stylers:[{saturation:-100},{lightness:45}]},{featureType:"road",elementType:"geometry.fill",stylers:[{color:"#043263"}]},{featureType:"road",elementType:"labels.text.fill",stylers:[{color:"#ffffff"}]},{featureType:"road",elementType:"labels.icon",stylers:[{color:"#a4aab3"}]},{featureType:"road.highway",elementType:"all",stylers:[{visibility:"simplified"}]},{featureType:"road.highway.controlled_access",elementType:"geometry.fill",stylers:[{color:"#004481"}]},{featureType:"road.highway.controlled_access",elementType:"labels",stylers:[{visibility:"off"}]},{featureType:"road.arterial",elementType:"labels.icon",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"labels.text.fill",stylers:[{color:"#ffffff"},{visibility:"off"}]},{featureType:"transit",elementType:"labels.text.stroke",stylers:[{color:"#004481"},{visibility:"off"}]},{featureType:"transit.station.rail",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"water",elementType:"geometry.fill",stylers:[{color:"#1973b8"}]}],ue=[{featureType:"all",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"all",elementType:"geometry",stylers:[{visibility:"simplified"}]},{featureType:"all",elementType:"labels",stylers:[{visibility:"simplified"}]},{featureType:"administrative",elementType:"labels.text.fill",stylers:[{color:"#444444"}]},{featureType:"landscape",elementType:"all",stylers:[{color:"#f2f2f2"}]},{featureType:"landscape",elementType:"geometry",stylers:[{visibility:"on"}]},{featureType:"landscape.man_made",elementType:"all",stylers:[{visibility:"simplified"},{hue:"#ff0000"}]},{featureType:"landscape.natural",elementType:"all",stylers:[{visibility:"on"},{color:"#d9efec"}]},{featureType:"landscape.natural.terrain",elementType:"all",stylers:[{visibility:"on"},{lightness:"31"},{hue:"#00fdff"}]},{featureType:"poi",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"poi.park",elementType:"all",stylers:[{visibility:"simplified"},{color:"#2dcccd"},{lightness:"85"}]},{featureType:"road",elementType:"all",stylers:[{saturation:-100},{lightness:45}]},{featureType:"road.highway",elementType:"all",stylers:[{visibility:"simplified"}]},{featureType:"road.arterial",elementType:"labels.icon",stylers:[{visibility:"off"}]},{featureType:"transit",elementType:"all",stylers:[{visibility:"off"}]},{featureType:"transit.station.rail",elementType:"all",stylers:[{visibility:"on"}]},{featureType:"water",elementType:"all",stylers:[{color:"#2dcccd"},{visibility:"on"},{saturation:"26"}]}];class ge{constructor(e,a,i="bbvaInfo",t=null,o=!1,r=0,n=0,l){this.position=a,this.icon=i,this.color=t,this.warning=o,this.label=e,this.axisPopupX=r,this.axisPopupY=n,this.containerDiv=ge._createContainer(l);const s=this._createPinIcon(),c=ge._createContentIcon(this.icon);this.warning&&ge._appendWarningIcon(this.containerDiv),this.containerDiv.appendChild(s),this.containerDiv.appendChild(c)}static _createContainer(){const e=document.createElement("div");return e.classList.add("map-icon-container"),e.addEventListener("mousedown",(()=>{e.classList.add("active")})),e.addEventListener("mouseup",(()=>{e.classList.remove("active")})),e}static _createContentIcon(e){const a=document.createElementNS("http://www.w3.org/2000/svg","svg");return a.setAttributeNS(null,"viewBox","0 0 260 260"),a.setAttribute("width","16"),a.setAttribute("height","16"),a.setAttributeNS(null,"preserveAspectRatio","xMidYMid meet"),a.innerHTML=q[e],a.classList.add("map-icon"),a}_createPinIcon(){const e=document.createElementNS("http://www.w3.org/2000/svg","svg");return e.setAttributeNS(null,"viewBox","0 0 40 48"),e.setAttribute("width","40"),e.setAttribute("height","48"),e.setAttributeNS(null,"preserveAspectRatio","xMidYMid meet"),e.classList.add("map-pin"),null!==this.color&&e.classList.add(this.color),e.innerHTML=be.getHTML(),e}static _appendWarningIcon(e){const a=document.createElementNS("http://www.w3.org/2000/svg","svg");a.setAttributeNS(null,"viewBox","0 0 260 260"),a.setAttribute("width","8"),a.setAttribute("height","8"),a.setAttributeNS(null,"preserveAspectRatio","xMidYMid meet"),a.classList.add("map-warning"),a.innerHTML=R;const i=document.createElement("div");i.classList.add("map-warning-bg"),e.appendChild(a),e.appendChild(i)}onAdd(){this.getPanes().floatPane.appendChild(this.containerDiv)}onRemove(){this.containerDiv.parentElement&&this.containerDiv.parentElement.removeChild(this.containerDiv)}draw(){const e=this.getProjection().fromLatLngToDivPixel(this.position),a=Math.abs(e.x)<4e3&&Math.abs(e.y)<4e3?"block":"none";"block"===a&&(this.containerDiv.style.left=e.x-this.axisPopupX+"px",this.containerDiv.style.top=e.y-this.axisPopupY+"px"),this.containerDiv.style.display!==a&&(this.containerDiv.style.display=a)}}var fe=e`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-map-dynamic-bg-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)}));
  position: relative;
  --_map-dynamic-header-bg-color: var(--bbva-map-dynamic-dark-mode-header-bg-color,var(--bbva-map-dynamic-header-bg-color, var(--colorsPrimaryCoreDarkened, ${a(n.primaryCoreDarkened)})));
  --_map-dynamic-text-bg-color: var(--bbva-map-dynamic-dark-mode-text-bg-color,var(--bbva-map-dynamic-text-bg-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
  --_map-dynamic-text-color: var(--bbva-map-dynamic-dark-mode-text-color,var(--bbva-map-dynamic-text-color, var(--colorsSecondary500, ${a(n.secondary500)})));
  --_map-dynamic-section-large-bg-color: var(--bbva-map-dynamic-dark-mode-section-large-bg-color,var(--bbva-map-dynamic-section-large-bg-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
  --_map-dynamic-section-large-action-button-action: var(--bbva-map-dynamic-dark-mode-section-large-action-button-action,var(--bbva-map-dynamic-section-large-action-button-action, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
  --_map-dynamic-map-pin-bg-color: var(--bbva-map-dynamic-dark-mode-map-pin-bg-color, var(--bbva-map-dynamic-map-pin-bg-color, var(--colorsPrimaryMedium, ${a(n.primaryMedium)})));
  --_map-dynamic-map-pin-active-bg-color: var(--bbva-map-dynamic-dark-mode-map-pin-active-bg-color, var(--bbva-map-dynamic-map-pin-active-bg-color, var(--colorsPrimaryCoreLight, ${a(n.primaryCoreLight)})));
  --_map-dynamic-map-pin-selected-bg-color: var(--bbva-map-dynamic-dark-mode-map-pin-selected-bg-color, var(--bbva-map-dynamic-map-pin-selected-bg-color, var(--colorsPrimaryCore, ${a(n.primaryCore)})));
  --_map-dynamic-map-icon-color: var(--bbva-map-dynamic-dark-mode-map-icon-color, var(--bbva-map-dynamic-map-icon-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
  --_map-dynamic-map-icon-active-color: var(--bbva-map-dynamic-dark-mode-map-icon-active-color, var(--bbva-map-dynamic-map-icon-active-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
  --_map-dynamic-map-icon-selected-color: var(--bbva-map-dynamic-dark-mode-map-icon-selected-color, var(--bbva-map-dynamic-map-icon-selected-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
  --_map-dynamic-map-warning-color: var(--bbva-map-dynamic-dark-mode-map-warning-color, var(--bbva-map-dynamic-map-warning-color, var(--colorsTertiaryType1Dark, ${a(n.tertiaryType1Dark)})));
  --_map-dynamic-map-warning-bg-color: var(--bbva-map-dynamic-dark-mode-map-warning-bg-color, var(--bbva-map-dynamic-map-warning-bg-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
  --_map-dynamic-map-warning-stroke-color: var(--bbva-map-dynamic-dark-mode-map-warning-stroke-color, var(--bbva-map-dynamic-map-warning-stroke-color, var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)})));
  --_map-dynamic-map-pin-bg-color-aqua: var(--bbva-map-dynamic-dark-mode-map-pin-bg-color-aqua, var(--bbva-map-dynamic-map-pin-bg-color-aqua, var(--colorsPrimaryVariantDark, ${a(n.primaryVariantDark)})));
  --_map-dynamic-map-pin-bg-color-pink: var(--bbva-map-dynamic-dark-mode-map-pin-bg-color-pink, var(--bbva-map-dynamic-map-pin-bg-color-pink, var(--colorsTertiaryType7Dark, ${a(n.tertiaryType7Dark)})));
  --_map-dynamic-map-pin-bg-color-sand: var(--bbva-map-dynamic-dark-mode-map-pin-bg-color-sand, var(--bbva-map-dynamic-map-pin-bg-color-sand, var(--colorsTertiaryType4Dark, ${a(n.tertiaryType4Dark)})));
  --_map-dynamic-map-pin-bg-color-purple: var(--bbva-map-dynamic-dark-mode-map-pin-bg-color-purple, var(--bbva-map-dynamic-map-pin-bg-color-purple, var(--colorsTertiaryType8, ${a(n.tertiaryType8)})));
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

.container {
  display: flex;
  flex-direction: column;
  height: 100%;
  width: 100%;
}

.bbva-map-dynamic-header {
  background-color: var(--_map-dynamic-header-bg-color);
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em) 0;
}
.bbva-map-dynamic-header [data-tag-name=bbva-form-search] {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}
.bbva-map-dynamic-header.predictive {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em);
  background-color: transparent;
}

:host([hide-map-info-footer]) .gm-style a div img {
  display: none;
}
:host([hide-map-info-footer]) div.gmnoprint, :host([hide-map-info-footer]) div .gm-style-cc {
  display: none;
}

.bbva-map-dynamic-section {
  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.bbva-map-dynamic-text {
  display: flex;
  justify-content: center;
  align-items: center;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em) 0;
  text-align: center;
  font-size: var(--typographyTypeSmall, ${a(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(t.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${a(o.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${a(o.book.fontStyle)});
  color: var(--_map-dynamic-text-color);
  background-color: var(--_map-dynamic-text-bg-color);
}

.bbva-map-dynamic-section-large-button {
  position: absolute;
  display: flex;
  justify-content: center;
  align-items: center;
  top: 1rem;
  left: 50%;
  transform: translate(-50%);
  border-radius: var(--bbva-map-dynamic-section-large-link-border-radius, var(--borderRadiusSmall, ${a(F.small)}));
  z-index: 0;
}

.bbva-map-dynamic-section-large-action {
  position: absolute;
  left: calc(100% - 48px - 16px);
  bottom: 1rem;
}
.bbva-map-dynamic-section-large-action [data-tag-name=bbva-button-action] {
  position: relative;
  width: 3rem;
  height: 3rem;
  border-radius: 50%;
  -webkit-transition: all 0.4s ease;
  transition: all 0.4s ease;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 12) * 1em);
  background-color: var(--_map-dynamic-section-large-action-button-action);
}

.map-icon-container {
  position: absolute;
  width: 3rem;
  height: 3.5rem;
}
.map-icon-container:hover {
  cursor: pointer;
}
.map-icon-container.active .map-pin {
  fill: var(--_map-dynamic-map-pin-active-bg-color);
}
.map-icon-container.active .map-pin.aqua {
  fill: var(--_map-dynamic-map-pin-bg-color-aqua);
}
.map-icon-container.active .map-pin.sand {
  fill: var(--_map-dynamic-map-pin-bg-color-sand);
}
.map-icon-container.active .map-pin.pink {
  fill: var(--_map-dynamic-map-pin-bg-color-pink);
}
.map-icon-container.active .map-pin.purple {
  fill: var(--_map-dynamic-map-pin-bg-color-purple);
}
.map-icon-container.active .map-icon {
  fill: var(--_map-dynamic-map-icon-active-color);
}
.map-icon-container.active .map-pin.aqua ~ .map-icon, .map-icon-container.active .map-pin.sand ~ .map-icon, .map-icon-container.active .map-pin.pink ~ .map-icon, .map-icon-container.active .map-pin.purple ~ .map-icon {
  fill: #ffffff;
}
.map-icon-container.selected .map-pin {
  fill: var(--_map-dynamic-map-pin-selected-bg-color);
}
.map-icon-container.selected .map-pin.aqua {
  fill: var(--_map-dynamic-map-pin-bg-color-aqua);
}
.map-icon-container.selected .map-pin.sand {
  fill: var(--_map-dynamic-map-pin-bg-color-sand);
}
.map-icon-container.selected .map-pin.pink {
  fill: var(--_map-dynamic-map-pin-bg-color-pink);
}
.map-icon-container.selected .map-pin.purple {
  fill: var(--_map-dynamic-map-pin-bg-color-purple);
}
.map-icon-container.selected .map-icon {
  fill: var(--_map-dynamic-map-icon-selected-color);
}
.map-icon-container.selected .map-pin.aqua ~ .map-icon, .map-icon-container.selected .map-pin.sand ~ .map-icon, .map-icon-container.selected .map-pin.pink ~ .map-icon, .map-icon-container.selected .map-pin.purple ~ .map-icon {
  fill: #ffffff;
}

.map-icon {
  position: absolute;
  top: calc(50% - 16px);
  left: calc(50% - 12px);
  display: block;
  width: 1.5rem;
  height: 1.5rem;
  overflow: hidden;
  fill: var(--_map-dynamic-map-icon-color);
}

.map-pin {
  width: 48px;
  height: 56px;
  fill: var(--_map-dynamic-map-pin-bg-color);
}
.map-pin.aqua {
  fill: var(--_map-dynamic-map-pin-bg-color-aqua);
}
.map-pin.sand {
  fill: var(--_map-dynamic-map-pin-bg-color-sand);
}
.map-pin.pink {
  fill: var(--_map-dynamic-map-pin-bg-color-pink);
}
.map-pin.purple {
  fill: var(--_map-dynamic-map-pin-bg-color-purple);
}

.map-warning {
  display: block;
  position: absolute;
  width: 1rem;
  height: 1rem;
  bottom: 0rem;
  left: 0.1875rem;
  z-index: 2;
  fill: var(--_map-dynamic-map-warning-color);
  stroke-width: 6;
  stroke: var(--_map-dynamic-map-warning-stroke-color);
}

.map-warning-bg {
  display: block;
  position: absolute;
  width: 0.1875rem;
  height: 0.5625rem;
  bottom: 0.1875rem;
  left: 0.5625rem;
  z-index: 1;
  background-color: var(--_map-dynamic-map-warning-bg-color);
}

.suggestions {
  padding: 0 1rem;
  position: absolute;
  top: 5.5rem;
  z-index: 1;
}
.suggestions ul {
  list-style: none;
  margin: 0;
  padding: 0;
  padding: 0.5rem;
  background-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
}
.suggestions ul [data-tag-name=bbva-link] {
  padding-bottom: 0.5rem;
}
`,ke=e`
[ambient^=light] {
  --bbva-map-dynamic-header-bg-color: initial;
  --bbva-map-dynamic-text-bg-color: initial;
  --bbva-map-dynamic-text-color: initial;
  --bbva-map-dynamic-section-large-bg-color: initial;
  --bbva-map-dynamic-section-large-bg-color: initial;
  --bbva-map-dynamic-section-large-action-button-action:initial;
  --bbva-map-dynamic-map-pin-bg-color: initial;
  --bbva-map-dynamic-map-pin-active-bg-color: initial;
  --bbva-map-dynamic-map-pin-selected-bg-color: initial;
  --bbva-map-dynamic-map-icon-color: initial;
  --bbva-map-dynamic-map-icon-active-color: initial;
  --bbva-map-dynamic-map-icon-selected-color: initial;
  --bbva-map-dynamic-map-warning-color: initial;
  --bbva-map-dynamic-map-warning-bg-color: initial;
  --bbva-map-dynamic-map-warning-stroke-color: initial;
  --bbva-map-dynamic-map-pin-bg-color-aqua: initial;
  --bbva-map-dynamic-map-pin-bg-color-pink: initial;
  --bbva-map-dynamic-map-pin-bg-color-sand: initial;
  --bbva-map-dynamic-map-pin-bg-color-purple: initial;
}
`,_e=e`
[ambient^=dark] {
  --bbva-map-dynamic-map-pin-bg-color: var(--colorsPrimaryMedium, ${a(n.primaryMedium)});
  --bbva-map-dynamic-map-pin-active-bg-color: var(--colorsPrimaryCore, ${a(n.primaryCore)});
  --bbva-map-dynamic-map-pin-selected-bg-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-map-dynamic-map-icon-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-map-dynamic-map-icon-active-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-map-dynamic-map-icon-selected-color: var(--colorsPrimaryCore, ${a(n.primaryCore)});
  --bbva-map-dynamic-map-warning-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-map-dynamic-map-warning-bg-color: var(--colorsPrimaryCore, ${a(n.primaryCore)});
  --bbva-map-dynamic-map-warning-stroke-color: var(--colorsPrimaryCore, ${a(n.primaryCore)});
  --bbva-map-dynamic-map-pin-bg-color-aqua: var(--colorsPrimaryVariantMedium, ${a(n.primaryVariantMedium)});
  --bbva-map-dynamic-map-pin-bg-color-pink: var(--colorsTertiaryType7, ${a(n.tertiaryType7)});
  --bbva-map-dynamic-map-pin-bg-color-sand: var(--colorsTertiaryType4, ${a(n.tertiaryType4)});
  --bbva-map-dynamic-map-pin-bg-color-purple: var(--colorsTertiaryType8, ${a(n.tertiaryType8)});
}
`;const $e={dark:e`
    ${K.dark}
    ${le.dark}
    ${N.dark}
    ${pe.dark}
    ${S.dark}
    ${_e}
  `,light:e`
    ${K.light}
    ${le.light}
    ${N.light}
    ${pe.light}
    ${S.light}
    ${ke}
  `};class Se extends(C(c(j))){static get is(){return"bbva-map-dynamic"}static get scopedElements(){return{"bbva-button-action":J,"bbva-button-default":H,"bbva-form-search":se,"bbva-form-text":me,"bbva-link":M}}static get properties(){return{apiKey:{type:String,attribute:"api-key"},geoLocation:{type:Object,attribute:"geo-location"},initialGeoLocation:{type:Object,attribute:"initial-geo-location"},availableCenter:{type:Object,attribute:"available-center"},zoom:{type:Number},maxZoom:{type:Number,attribute:"max-zoom"},minZoom:{type:Number,attribute:"min-zoom"},variant:{type:String},poiRadius:{type:Number,attribute:"poi-radius"},pois:{type:Array},iconMyLocation:{type:String,attribute:"icon-my-location"},hideMeMarker:{type:Boolean,attribute:"hide-me-marker"},iconSearch:{type:String,attribute:"icon-search"},_map:{type:Object,state:!0},_mapStyles:{type:Array},_markers:{type:Array},_meMarker:{type:Object},_geocoder:{type:Object},_openButtonSearch:{type:Boolean},_lastGeoLocation:{type:Object},_placeSearch:{type:Object},ambient:{type:String},_inputValidation:{type:Boolean},clearPois:{type:Boolean,attribute:"clear-pois"},clearSelected:{type:Boolean,attribute:"clear-selected"},searchHeader:{type:Boolean,attribute:"search-header"},buttonText:{type:String,attribute:"button-text"},showPredictive:{type:Boolean,attribute:"show-predictive"},predictiveInfoMessage:{type:String,attribute:"predictive-info-message"},suggestions:{type:Array},avoidClickableIcons:{type:Boolean,attribute:"avoid-clickable-icons",reflect:!0},isDraggablePin:{type:Boolean,attribute:"is-draggable-pin",reflect:!0},address:{type:Array},isRequiredInput:{type:Boolean,attribute:"is-required-input"},popupMarkers:{type:Array,attribute:"popup-markers"},formSearchAmbient:{type:String,attribute:"form-search-ambient"},formSearchVariant:{type:String,attribute:"form-search-variant"},hideMapInfoFooter:{type:Boolean,attribute:"hide-map-info-footer",reflect:!0},optionalInputLabel:{type:String,attribute:"optional-input-label"},mobileMarkerPopup:{type:Object,attribute:"mobile-marker-popup"},currentAddress:{type:String,attribute:"current-address"},popupAxis:{type:Object},withCluster:{type:Boolean,attribute:"with-cluster"},markerSelected:{type:Object,attribute:"marker-selected"},clusterSelected:{type:Object,attribute:"cluster-selected"},clusterColor:{type:String,attribute:"cluster-color"},clusterSelectedColor:{type:String,attribute:"cluster-selected-color"},accessibilityButtonAction:{type:String,attribute:"accessibility-button-action"},_markerCluster:{type:Object}}}constructor(){super(),this.apiKey="",this.label=this.t("bbva-map-dynamic-label"),this.message=this.t("bbva-map-dynamic-message"),this.zoom=15,this.maxZoom=17,this.minZoom=7,this.poiRadius=2500,this.hideMeMarker=!1,this.iconMyLocation=Z(),this.searchHeader=!1,this._mapStyles=ue,this._openButtonSearch=!1,this._placeSearch={},this.ambient="light",this.selectedPopup=null,this.formSearchAmbient="dark400",this.formSearchVariant="no-background",this.isDraggablePin=!1,this.avoidClickableIcons=!1,this._meIcon=he,this.address=[],this.isRequiredInput=!1,this.currentAddress="",this.popupMarkers=[],this.hideMeMarkers=!1,this.hideMapInfoFooter=!1,this.optionalInputLabel=this.t("bbva-map-dynamic-optinal-label"),this.mobileMarkerPopup={},this.popupAxis={},this._inputValidation=!1,this.clearPois=!1,this.clearSelected=!1,this.withCluster=!1,this.availableCenter={},this.markerSelected={},this.clusterSelected={},this.clusterColor="#1973B8",this.clusterSelectedColor="#004481",this._markerCluster={},this.accessibilityButtonAction="bbva-map-dynamic-message-action-accessibility",this._markers=[],window.initMap=()=>{window.dispatchEvent(new CustomEvent("map-dynamic-item-ready"))}}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._mapScriptTag(),this._handleEventMap()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._removeEventMap()}async updated(e){super.updated(e),e.has("geoLocation")&&0!==Object.keys(this.geoLocation||{}).length&&this._meMap(),e.has("pois")&&this._putMarkersOnMap(),e.has("ambient")&&this._refreshMapStyles(),e.has("clearPois")&&this.clearPois&&this._clearPois(),e.has("clearSelected")&&this.clearSelected&&this._resetSelectedItems(),e.has("availableCenter")&&Object.keys(this.availableCenter).length&&this._setCenter(this.availableCenter);const a=document.querySelector(".pac-container");var i;(a&&a.setAttribute("hidden",!0),e.has("mobileMarkerPopup")&&0!==Object.keys(this.mobileMarkerPopup).length&&this._changePopupLocation(),e.has("isDraggablePin"))&&(await this.updateComplete,null===(i=this._meMarker)||void 0===i||i.setDraggable(this.isDraggablePin));e.has("address")&&this.address&&this._sendAddress(this.address),e.has("_placeSearch")&&0!==Object.keys(this._placeSearch).length&&this._sendGeoLocation(this._placeSearch)}_handleEventMap(){window.addEventListener("map-dynamic-item-ready",this._eventMap.bind(this),!0)}_removeEventMap(){window.removeEventListener("map-dynamic-item-ready",this._eventMap.bind(this),!0)}_eventMap(){Object.setPrototypeOf(ge.prototype,new google.maps.OverlayView);const e={zoom:this.zoom,streetViewControl:!1,disableDefaultUI:!0,maxZoom:this.maxZoom,minZoom:this.minZoom,styles:this._mapStyles,mapTypeId:"roadmap",clickableIcons:!this.avoidClickableIcons};void 0!==this.geoLocation&&Object.assign(e,{center:this.geoLocation}),this._map=new google.maps.Map(this.shadowRoot.querySelector("#map"),e);const a=`data:image/svg+xml;charset=utf-8,${this._meIcon.getHTML()}`;this._meMarker=new google.maps.Marker({map:this._map,draggable:this.isDraggablePin,icon:{url:a,scaledSize:{width:40,height:40}}}),this._geocoder=new google.maps.Geocoder;const i=[{showPredictive:this.showPredictive,dataTagName:"bbva-form-text"},{searchHeader:this.searchHeader,dataTagName:"bbva-form-search"}];for(const e of i)(e.showPredictive||e.searchHeader)&&(this._mapSearchInput=this.shadowRoot.querySelector(`[data-tag-name="${e.dataTagName}"]`).querySelector("input"),Se._autocomplete(this._mapSearchInput));this._map.addListener("idle",(()=>{this._dispatch("map-dynamic-idle"),this.geoLocation&&this.geoLocation!=={}||this._requestGeoLocation()})),this._map.addListener("bounds_changed",(()=>{var e,a,i,t,o,r;const n=null==this||null===(e=this._map)||void 0===e||null===(a=e.getBounds)||void 0===a?void 0:a.call(e),l=null==n?void 0:n.getNorthEast(),s=null==n?void 0:n.getSouthWest();this._dispatch("map-dynamic-bounds-changed",{ne:{latitude:null==l||null===(i=l.lat)||void 0===i?void 0:i.call(l),longitude:null==l||null===(t=l.lng)||void 0===t?void 0:t.call(l)},sw:{latitude:null==s||null===(o=s.lat)||void 0===o?void 0:o.call(s),longitude:null==s||null===(r=s.lng)||void 0===r?void 0:r.call(s)}})})),this._map.addListener("center_changed",(()=>{var e,a,i,t;const o=null===(e=this._map)||void 0===e||null===(a=e.getCenter)||void 0===a?void 0:a.call(e);this._dispatch("map-dynamic-center-changed",{latitude:null==o||null===(i=o.lat)||void 0===i?void 0:i.call(o),longitude:null==o||null===(t=o.lng)||void 0===t?void 0:t.call(o)})})),this._map.addListener("zoom_changed",(()=>{var e,a;this._dispatch("map-dynamic-zoom-changed",null===(e=this._map)||void 0===e||null===(a=e.getZoom)||void 0===a?void 0:a.call(e))})),this._meMarker.addListener("dragend",(e=>{this.geoLocation={lat:e.latLng.lat(),lng:e.latLng.lng()},this._centerMap(this.geoLocation),this._sendGeoLocation(this.geoLocation)})),this._dispatch("map-dynamic-map-ready",!0)}_dispatch(e,a=null,i=!0,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:a,bubbles:i,composed:t}))}_sendGeoLocation(e){this.dispatchEvent(new CustomEvent("map-dynamic-geolocation-changed",{detail:{geoLocation:e},bubbles:!0,composed:!0}))}_sendAddress(e){this.dispatchEvent(new CustomEvent("map-dynamic-address-changed",{detail:{address:e},bubbles:!0,composed:!0}))}static _autocomplete(e){new google.maps.places.Autocomplete(e).setFields(["address_components","geometry","icon","name"])}async _refreshMapStyles(){var e,a;"dark"!==this.ambient?(this._mapStyles=ue,this._meIcon=he):(this._mapStyles=ye,this._meIcon=ve),await this.updateComplete;const i=`data:image/svg+xml;charset=utf-8,${this._meIcon.getHTML()}`;null===(e=this._map)||void 0===e||e.setOptions({styles:this._mapStyles}),null===(a=this._meMarker)||void 0===a||a.setOptions({icon:{url:i,scaledSize:{width:40,height:40}}})}_requestGeoLocation(){this.dispatchEvent(new CustomEvent("map-dynamic-geolocation-request",{detail:!0,bubbles:!0,composed:!0}))}_geocodeLatLng(e){this._geocoder.geocode({location:e},((e,a)=>{if("OK"===a)if(e[0]){const[a]=e;this.message=`${this.t("map-dynamic-message")} ${e[0].formatted_address}`,this.address=a,this.currentAddress=e[0].formatted_address}else this.message=this.t("bbva-map-dynamic-no-result");else this.message=`${this.t("bbva-map-dynamic-geocoder-fails")}: ${a}`}))}_requestPOIs(){this._lastGeoLocation&&this.dispatchEvent(new CustomEvent("map-dynamic-pois-request",{detail:{geoLocation:this._lastGeoLocation,radius:this.poiRadius},bubbles:!0,composed:!0}))}async _meMap(){await this.updateComplete;const e=this.initialGeoLocation||this.geoLocation;this._map.me=e,this.hideMeMarker||this._meMarker.setPosition(e),this._centerMap(e),this._requestPOIs()}_centerMap(e){e&&(this._setCenter(e),this._geocodeLatLng(this._lastGeoLocation))}_setCenter(e){this._lastGeoLocation={...e},this._map.setCenter(this._lastGeoLocation)}_handleCenterMap(){this._dispatch("map-dynamic-center-map-button"),this._requestGeoLocation()}static _computeDistanceBetween(e,a){const i=e=>e*Math.PI/180,t=i(a.lat-e.lat),o=i(a.lng-e.lng),r=Math.sin(t/2)*Math.sin(t/2)+Math.cos(i(e.lat))*Math.cos(i(a.lat))*Math.sin(o/2)*Math.sin(o/2);return(6378.137*(2*Math.atan2(Math.sqrt(r),Math.sqrt(1-r)))).toFixed(3)}_mapScriptTag(){if(this.apiKey){const e=`https://maps.googleapis.com/maps/api/js?key=${this.apiKey}&libraries=places,marker&callback=initMap`,a=this.shadowRoot.querySelector("#api-map");a&&a.remove();const i=document.createElement("script");i.setAttribute("id","api-map"),i.setAttribute("src",e),i.setAttribute("async",!0),i.setAttribute("defer",!0),this.shadowRoot.appendChild(i)}}_clusterRenderer(e){let a=this.clusterColor;const i=e.position.lat(),t=e.position.lng();i===this.clusterSelected.lat&&t===this.clusterSelected.lng&&(a=this.clusterSelectedColor);const o=window.btoa(`\n    <svg fill="${a}" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 40 48">\n        ${be.strings[0]}\n    </svg>`);return new google.maps.Marker({position:e.position,icon:{url:`data:image/svg+xml;base64,${o}`,scaledSize:new google.maps.Size(40,48)},label:{text:String(e.count),color:"rgba(255,255,255,0.8)",fontSize:"16px"},zIndex:Number(google.maps.Marker.MAX_ZINDEX)+e.count})}_putMarkersOnMap(){var e;this._markers=[],this._map&&null!==(e=this.pois)&&void 0!==e&&e.length&&(this.withCluster?this._putMarkersWithClusters():this._putMarkersWithoutClusters())}_putMarkersWithClusters(){this.pois.forEach((e=>{if(e.address.geolocation){var a,i;const t={lat:e.address.geolocation.latitude,lng:e.address.geolocation.longitude},o=new google.maps.Marker({position:t,label:e.name,title:e.title,icon:{url:`data:image/svg+xml;charset=UTF-8,${encodeURIComponent(Se._configureMarker(q[e.icon],be.getHTML(),null===(a=e.iconColor)||void 0===a?void 0:a.default,null===(i=e.backgroundColor)||void 0===i?void 0:i.default))}`},customInfo:e,optimized:!1});o.addListener("click",(()=>{this._dispatch("map-dynamic-popup-click",e)})),o.addListener("tap",(()=>{this._dispatch("map-dynamic-popup-tap",e)})),o.addListener("mouseup",(()=>{this.markerSelected!==o&&this._resetSelectedMarker(),o.setIcon({url:`data:image/svg+xml;charset=UTF-8,${encodeURIComponent(Se._configureMarker(q[o.customInfo.icon],be.getHTML(),o.customInfo.iconColor.selected,o.customInfo.backgroundColor.selected))}`}),this._resetSelectedCluster(),this.markerSelected=o})),this._markers.push(o)}}));const e={render:this._clusterRenderer.bind(this)};this._markerCluster=new markerClusterer.MarkerClusterer({map:this._map,markers:this._markers,renderer:e,algorithm:new markerClusterer.GridAlgorithm({maxZoom:19}),onClusterClick:this._onClusterClickHandler.bind(this)}),this._map.addListener("click",(()=>{this._dispatch("map-dynamic-click",!0),this._resetSelectedItems()})),this._map.addListener("tap",(()=>{this._dispatch("map-dynamic-click",!0),this._resetSelectedItems()}))}_putMarkersWithoutClusters(){this.pois.forEach((e=>{if(e.address.geolocation){var a,i;const t={lat:e.address.geolocation.latitude,lng:e.address.geolocation.longitude},o=new ge(e.description||e.name,t,e.icon,e.color,e.warning,null===(a=this.popupAxis)||void 0===a?void 0:a.axisX,null===(i=this.popupAxis)||void 0===i?void 0:i.axisY);o.containerDiv.addEventListener("click",(a=>{a.stopPropagation(),this._dispatch("map-dynamic-popup-click",e)})),o.containerDiv.addEventListener("tap",(a=>{a.stopPropagation(),this._dispatch("map-dynamic-popup-tap",e)})),o.containerDiv.addEventListener("mouseup",(()=>{this.selectedPopup&&this.selectedPopup.containerDiv.classList.remove("selected"),this.selectedPopup=o,this.selectedPopup.containerDiv.classList.add("selected")})),o.setMap(this._map),this.popupMarkers.push(o)}})),this._map.addListener("click",(()=>{this._dispatch("map-dynamic-click",!0),this._resetSelectedItems()})),this._map.addListener("tap",(()=>{this._dispatch("map-dynamic-click",!0),this._resetSelectedItems()}))}_onClusterClickHandler(e,a,i){const{markers:t}=a,o=t.every(((e,a,i)=>e.position.equals(i[0].position))),r=i.getZoom()===i.maxZoom;if(o||r){const a={lat:e.latLng.lat(),lng:e.latLng.lng()};this.clusterSelected!==a&&(this.clusterSelected=a,this._resetSelectedMarker(),this._showLastChanges()),this._dispatch("map-dynamic-cluster-click",t)}else markerClusterer.defaultOnClusterClickHandler(e,a,i)}_resetSelectedMarker(){var e;Object.keys(this.markerSelected).length&&(null===(e=this.markerSelected)||void 0===e||e.setIcon({url:`data:image/svg+xml;charset=UTF-8,${encodeURIComponent(Se._configureMarker(q[this.markerSelected.customInfo.icon],be.getHTML(),this.markerSelected.customInfo.iconColor.default,this.markerSelected.customInfo.backgroundColor.default))}`}),this.markerSelected={})}_resetSelectedCluster(){Object.keys(this.clusterSelected).length&&(this.clusterSelected={},this._showLastChanges())}_showLastChanges(){this._map.setZoom(this._map.getZoom())}static _configureMarker(e,a,i,t){let o=e;i&&(o=Se._addColorToPath(e,i));let r=a;t&&(r=Se._addColorToPath(a,t));return`<svg width="48px" height="48px" version="1.1" xmlns="http://www.w3.org/2000/svg">\n          ${r}\n          <g transform="matrix(0.1, 0, 0, 0.1, 7, 10)">\n          ${o}\n          </g>\n        </svg>`}static _addColorToPath(e,a){const i=`" style="fill: ${a}`;return e.match(/<path\s+d="[^"]+"\s*\/?>/g).map((e=>`${e.replace('"/>',i)}"/>`)).join("")}_clearPois(){var e,a;this.popupMarkers.forEach((e=>{e.setMap(null)})),null===(e=this._markerCluster)||void 0===e||null===(a=e.clearMarkers)||void 0===a||a.call(e),this.popupMarkers=[],this.pois=[],this._markers=[]}_resetSelectedItems(){this._resetSelectedMarker(),this._resetSelectedCluster()}_changePopupLocation(){var e,a,i,t,o,r,n,l,s,c;null===(e=this.popupMarkers[0])||void 0===e||e.onRemove();const d={address:{geolocation:{latitude:null===(a=this.mobileMarkerPopup)||void 0===a?void 0:a.lat,longitude:null===(i=this.mobileMarkerPopup)||void 0===i?void 0:i.lng}},description:null===(t=this.popupMarkers[0])||void 0===t?void 0:t.description,icon:null===(o=this.popupMarkers[0])||void 0===o?void 0:o.icon,color:null===(r=this.popupMarkers[0])||void 0===r?void 0:r.color,warning:null===(n=this.popupMarkers[0])||void 0===n?void 0:n.warning};null===(l=this.popupMarkers)||void 0===l||l.shift(),null===(s=this.pois)||void 0===s||s.shift(),null===(c=this.pois)||void 0===c||c.push(d),this._putMarkersOnMap()}_handlePlaceSearch(){this._centerMap(this._placeSearch),this._requestPOIs(),this._mapSearchInput.setAttribute("value","")}_setSuggestions(e){const{value:a}=e.target;this._inputValidation=""===a;(new google.maps.places.AutocompleteService).getPlacePredictions({input:a},(e=>{this.suggestions=e}))}_handleLocationClick(e){var a,i;const t=null===(a=e.target)||void 0===a||null===(i=a.dataset)||void 0===i?void 0:i.id,{description:o,place_id:r}=this.suggestions[t];this._mapSearchInput.value=o;new google.maps.places.PlacesService(this._mapSearchInput).getDetails({placeId:r},(e=>{this._placeSearch={...this._placeSearch,lat:e.geometry.location.lat(),lng:e.geometry.location.lng()},this._handlePlaceSearch()})),this.suggestions=[]}_handleClickButtonDefault(){this.dispatchEvent(new CustomEvent("map-dynamic-button-click",{bubbles:!0,composed:!0,detail:!0}))}static get styles(){return[fe,$e.light,$e.dark,v("bbva-map-dynamic-shared-styles")]}get buttonDefault(){return this.buttonText?u` <div class="bbva-map-dynamic-section-large-button">
        <bbva-button-default
          .text=${this.buttonText}
          .ambient=${this.ambient}
          @click="${this._handleClickButtonDefault}"
        ></bbva-button-default>
      </div>`:""}get _searchInput(){return u`<section class="bbva-map-dynamic-header">
      <bbva-form-search
        ambient="${this.formSearchAmbient}"
        variant="${this.formSearchVariant}"
        class="primary"
        label="${this.t(this.label)}"
        placeholder=""
        .icon=${E(this.iconSearch)}
        optional-label="${this.optionalInputLabel}"
        ?required="${this.isRequiredInput}"
        value="${this.currentAddress}"
        @input=${this._setSuggestions}
        @form-search-button-submit="${this._handlePlaceSearch}"
      ></bbva-form-search>
    </section>`}get _predictiveInput(){return u`<section class="bbva-map-dynamic-header predictive">
      <bbva-form-text
        class="primary"
        label="${this.t(this.label)}"
        placeholder=""
        optional-label="${this.optionalInputLabel}"
        ?required="${this.isRequiredInput}"
        value="${this.currentAddress}"
        @input=${this._setSuggestions}
        info-message="${this.predictiveInfoMessage}"
      ></bbva-form-text>
    </section>`}get _suggestionSection(){return u` <section class="suggestions">
      <ul>
        ${this.suggestions.map(((e,a)=>u`<li ambient="light">
              <bbva-link data-id="${a}" @click="${this._handleLocationClick}"
                >${e.description}</bbva-link
              >
            </li>`))}
      </ul>
    </section>`}render(){var e;return u`
      <div class="container">
        ${this.searchHeader?this._searchInput:""}
        ${this.showPredictive?this._predictiveInput:""}
        ${null!==(e=this.suggestions)&&void 0!==e&&e.length&&!this._inputValidation?this._suggestionSection:""}
        <section id="map" class="bbva-map-dynamic-section"></section>
      </div>
      ${this.buttonDefault}
      <div class="bbva-map-dynamic-section-large-action">
        <bbva-button-action
          aria-label="${this.t(this.accessibilityButtonAction)}"
          ambient="light"
          icon="${this.iconMyLocation}"
          @click="${this._handleCenterMap}"
        >
        </bbva-button-action>
      </div>
    `}}_("colors.primaryCore"),_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened"),_("colors.primaryCore"),_("colors.primaryCoreLightened"),_("colors.primaryCore"),_("colors.primaryCoreLightened"),_("colors.primaryVariantMedium"),_("colors.tertiaryType7"),_("colors.tertiaryType4"),_("colors.tertiaryType8");export{Se as B,$e as b};
