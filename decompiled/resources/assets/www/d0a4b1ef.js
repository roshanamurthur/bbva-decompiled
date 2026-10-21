import"./7f3d7ca9.js";import{z as e,H as t,a8 as i,ar as a,a9 as r,cs as o,b0 as s,ac as n,ad as l,ab as c,aa as d,a as b,an as p,ct as m,aH as h,ag as v,af as u,b6 as g,bF as f,aN as y,ah as $,h as k,i as S,ak as x,ap as _,L as C,F as I,b$ as w,bx as L,b1 as T,aW as P,au as z,bd as D,as as E,at as A,aJ as B,V,av as R,aw as M,S as N,cu as q,f as F,o as O,g as j,aG as H,dZ as W}from"./952f98a9.js";import"./af658024.js";import"./a3995b85.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./10a3ea7d.js";var U=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.body-address {
  padding: 1rem;
}

.padding-top-address {
  padding: 0.5rem 0;
}
`;const X=t((e=>class extends e{static get properties(){return{}}fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}convertStrToInt(e){return parseInt(e,10)}})),Z=new a;var Y=e`[ambient^=light] {
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
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
}
${Z.mediaRules()}`;const G=new a;const J={dark:e`
    ${e`[ambient^=dark] {
  --bbva-form-field-bg-color: #0A5393;
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsSecondary300, ${i(r.secondary300)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${i(r.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${i(r.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${i(r.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${i(r.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${i(r.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${i(r.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${i(r.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${i(r.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${i(r.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${i(r.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${i(r.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${i(r.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
}
${G.mediaRules()}`}
    ${o.dark}
    ${s.dark}
  `,light:e`
    ${Y}
    ${o.light}
    ${s.light}
  `};var K=e`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${i(r.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${i(r.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${i(r.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${i(r.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${i(r.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${i(r.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${i(r.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${i(r.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${i(r.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${i(r.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${i(r.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${i(r.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${i(r.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${i(r.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${i(r.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${i(r.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${i(r.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${i(r.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${i(r.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${i(r.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${i(r.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${i(r.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${i(r.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${i(r.tertiaryType1Dark)})));
  --bbva-button-icon-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${i(r.primaryMedium)})));
  --bbva-button-icon-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${i(r.primaryCore)})));
  --bbva-button-icon-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${i(r.primaryMedium)})));
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
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
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
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${i(n.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
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
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${i(n.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${i(l.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${i(c.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

.label-out-text {
  font-family: inherit;
  font-size: var(--bbva-form-field-label-out-font-size, var(--typographyTypeSmall, ${i(n.typeSmall)}));
  line-height: var(--bbva-form-field-label-out-line-height, var(--lineHeightTypeSmall, ${i(l.typeSmall)}));
  color: var(--_field-label-out-color);
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
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
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1em);
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
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem) 0;
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${i(n.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${i(l.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}
.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
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
`;class Q extends(b(p(m))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-button-icon":h,"bbva-text":v,"bbva-core-icon":u,"bbva-link":g}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=24,this.actionAccessibleText="bbva-form-field-submit",this.actionIntoForm=!1,this.clearIcon=f(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-field-clear",this.optionalLabel="bbva-form-field-optional-label",this.errorIcon=y(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=$(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1}firstUpdated(e){super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const t=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",t.style.display="none",t.innerHTML=this.inputInnerStyles,this.appendChild(t)}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||void 0===e.get("value")||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const e=this.invalid?this.errorMessage:"";return e&&this.infoMessage?`${e}. ${this.infoMessage}`:e||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.label}`:`${this.label} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?k`
          <bbva-link
            @click="${this._helpClicked}"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            href="${S(this.linkHref)}"
            aria-label="${this.t("bbva-form-field-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?k`
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
      `:""}static get styles(){return[super.styles,K,J.light,J.dark,x("bbva-form-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return k`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return k`
      <div
        class="wrapper"
        @keydown="${e=>13===e.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field} ${!this.readonly&&this.actionType?this.actionButton:this.rightIcon}
      </div>
    `}get clearButton(){return k`
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
    `}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return k` <bbva-button-icon
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      .variant="${this.actionVariant}"
    >
    </bbva-button-icon>`}get rightIcon(){return this.actionIcon?k`
          <div class="wrapper-action">
            <bbva-core-icon
              .icon="${this.actionIcon}"
              .size="${this.actionIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?k`
          <div class="message error" role="alert">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.errorMessage)}</span>
          </div>
        `:""}get messageInfo(){return this.infoMessage?k`
          <div class="message info">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.infoIcon}"
              .size="${this.infoIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.infoMessage)}</span>
          </div>
        `:""}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const e=this._rootNode.activeElement,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus"))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur"))}clearInput(){this._formElement&&(this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus())}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return k`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}}customElements.define(Q.is,Q);const ee=new a;var te=e`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${i(r.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1em);
  --_bg-color-modal: var(--colorsPrimaryCore, ${i(r.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${i(r.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${i(r.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${i(r.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)})));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
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

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 10) * 1em);
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${i(n.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1em);
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1em);
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

[data-tag-name=bbva-badge-notification] {
  --bbva-badge-notification-position-right: -0.5625rem;
  --bbva-badge-notification-position-top: -0.1875rem;
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
${ee.mediaRules()}`;class ie extends(b(_(p(C)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":v,"bbva-icon":I,"bbva-badge-notification":w}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[te,x("bbva-header-main-shared-styles"),L("button:focus"),T.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return k`<bbva-icon icon="${S(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return k`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,a){const r=ie.toCamelCase(e),o=`icon${r}`,s=`accessibilityTextIcon${r}`;return k`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${S(this.t(this[s]))}"
      aria-expanded=${S(a)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(e){return k` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${S(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return k`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:r,microillustration:o}=this;return k`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(o||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${S(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span class="${r}" ?hidden="${!o}" aria-hidden="true">
            ${this.microillustration&&P[this.microillustration]}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(ie.is,ie);var ae=e`[ambient^=light] {
  --bbva-list-simple-label-color: initial;
  --bbva-list-simple-mask-color: initial;
  --bbva-list-simple-description-color: initial;
  --bbva-list-simple-icon-color: initial;
  --bbva-list-simple-active-bg-color: initial;
  --bbva-list-simple-active-link-color: initial;
  --bbva-list-simple-link-color: initial;
  --bbva-list-simple-link-active-color: initial;
  --bbva-list-simple-skeleton-color: initial;
  --bbva-list-simple-skeleton-bg: initial;
  --bbva-list-simple-stacked-label-color: initial;
}
${(new a).mediaRules()}`;const re=new a;var oe=e`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${i(r.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${i(r.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${i(r.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${i(r.primaryCoreLightened)});
}
${re.mediaRules()}`;const se={dark:e`
    ${s.dark}
    ${z.dark}
    ${D.dark}
    ${oe}
  `,light:e`
    ${s.light}
    ${z.light}
    ${D.light}
    ${ae}
  `},ne=new a;var le=e`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${i(r.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${i(r.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${i(r.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${i(r.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${i(r.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${i(r.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${i(r.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${i(r.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${i(r.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${i(r.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${i(r.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem));
  color: var(--_list-simple-text-color);
  user-select: none;
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

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.wrapper-description,
.wrapper-description [data-tag-name=bbva-text] {
  text-align: right;
}

dl,
dd {
  margin: 0;
}

dl {
  display: flex;
  justify-content: space-between;
}

dt,
dd {
  display: flex;
  overflow: hidden;
}

dt {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link] {
  text-align: left;
  color: var(--_list-simple-link-color);
}
[data-tag-name=bbva-link]:active {
  --_list-simple-link-color: var(--_list-simple-link-active-color);
}

.action-icons {
  display: flex;
}

button {
  height: 1.5rem;
  width: 1.5rem;
  border: none;
  padding: 0;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_list-simple-icon-color);
}
button:active {
  --_list-simple-icon-color: var(--_list-simple-icon-active-color);
}

.wrapper-mask {
  color: var(--_list-simple-mask-color);
}

.label {
  color: var(--_list-simple-label-color);
}

.description {
  color: var(--_list-simple-description-color);
}

.wrapper-amount {
  overflow: initial;
}

:host([label-medium]) [data-tag-name=bbva-text].label,
:host([description-medium]) [data-tag-name=bbva-text].description,
:host([description-medium]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(c.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(c.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${i(c.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${i(c.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${i(c.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${i(c.mediumItalic.fontStyle)});
}

:host([disabled]) [data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

.skeleton {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  opacity: 0;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 305% 12px;
}
:host([variant=stacked]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 24px 36px;
}
:host([variant=stacked-center]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 90% 12px, 160% 36px;
}

:host([variant=stacked]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
:host([variant=stacked]) dl {
  flex-direction: column;
}
:host([variant=stacked]) .wrapper-description,
:host([variant=stacked]) .wrapper-description [data-tag-name=bbva-text] {
  text-align: left;
}

[data-tag-name=bbva-link]:not([href])[active]:not([disabled]) {
  background-color: transparent;
}

:host([action-link]:active),
:host([description-link]:active),
:host([label-link]:active) {
  background-color: var(--_list-simple-active-bg-color);
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

:host([variant=stacked-center]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: center;
}
:host([variant=stacked-center]) .wrapper [data-tag-name="bbva-link,"] [data-tag-name=bbva-text],
:host([variant=stacked-center]) .wrapper-description {
  text-align: center;
}
:host([variant=stacked-center]) dl {
  flex-direction: column;
  margin: auto;
}
:host([variant=stacked-center]) dt,
:host([variant=stacked-center]) dd {
  padding: 0;
  margin: auto;
}
:host([variant=stacked-center]) .action-icons {
  position: absolute;
  right: 1rem;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) * {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

:host([variant^=stacked]) .label {
  color: var(--_list-simple-stacked-label-color);
}

:host([variant=stacked-center][action-icon]) dl,
:host([variant=stacked-center][action-secondary-icon]) dl {
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
}
${ne.mediaRules()}`;class ce extends(_(E(A(B(b(p(C))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const e=[M,g,N,v,u];return ce.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},statusAccessibilityText:{type:String,attribute:"status-accessibility-text"},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.statusAccessibilityText="bbva-list-simple-status-accessibility-text",this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0}static get styles(){return[super.styles,le,se.light,se.dark,L("button:focus"),x("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return k`
      <bbva-amount
        ?decimals-hidden="${this.decimalsHidden}"
        variant="m"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?symbol-right="${this.symbolRight}"
      >
      </bbva-amount>
    `}get _icon(){return k`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return k`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return k`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const e="nochange"===this.status?"no-change":this.status;return k`
      <span class="sr-only">${this.t(this.statusAccessibilityText)}</span>
      <bbva-badge-variability .status=${e} .color=${this.color}></bbva-badge-variability>
    `}get _mask(){const e=V(this.mask,this.maskChars,!0,this.visibleChars);return k`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${e.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let e=null;return this.actionIcon||this.actionSecondaryIcon?e=this._actionIcons:this.actionLink&&(e=this._tplLink("actionLink")),e}get _definitionDescriptionTpl(){let e=null,t="";return this.description?(e=this._tplText("description"),t="description"):this.mask?(e=this._mask,t="mask"):this._isValidAmount&&(e=this._amount,t="amount"),k`
      <dd class="wrapper-${t}">
        ${this.status?this._badgeVariability:""} ${e}
      </dd>
    `}_tplLink(e){return k`
      <bbva-link
        class=${R({ellipsis:this[`${e}Ellipsis`]})}
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(e)}"
      >
        <span role=${S(this.roleLink)} aria-live=${S(this.arialiveLink)}>
          ${this[e]}
        </span>
      </bbva-link>
    `}_tplNoLink(e){const t=`${e}AccessibilityText`,i=`${e}TagText`,a=`${e}RoleText`,r=`${e}AriaLiveText`;return k`
      <bbva-text
        aria-label="${this.t(this[t])}"
        role=${S(this[a])}
        aria-live=${S(this[r])}
        class="${e}"
        unset
        size="S"
        text="${this[e]}"
        tag=${S(this[i])}
      >
      </bbva-text>
    `}_tplText(e){return k` ${this[`${e}Link`]?this._tplLink(e):this._tplNoLink(e)} `}_iconClick(e){this.dispatchEvent(new CustomEvent(`list-simple-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(e){const t=e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return k`
      <dl>
        <dt>${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}</dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return k`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?k`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let e=null;const t=["stacked","stacked-center"].includes(this.variant);return e=this.label?this.description||this._isValidAmount||this.mask||t?t?this.renderStacked():this.renderDefault():this._tplText("label"):k` <div class="wrapper-description">${this._tplText("description")}</div> `,k`
      ${e}
      <div class="skeleton"></div>
    `}}customElements.define(ce.is,ce),j("colors.cool70"),j("colors.primaryCoreLightened"),j("colors.cool20"),j("colors.primaryCoreLightened"),j("colors.primaryCoreLightened"),j("colors.primaryCoreLightened"),j("colors.primaryCoreLightened"),j("colors.cool20"),j("colors.cool20"),j("colors.cool20"),j("colors.cool20"),j("colors.primaryCoreLightened"),j("colors.primaryCoreLightened"),j("colors.tertiaryType1Light"),j("colors.cool20"),j("colors.cool20"),j("colors.cool70"),j("colors.primaryCoreLightened"),j("colors.tertiaryType1Light"),j("colors.tertiaryType1Light"),j("colors.tertiaryType1Light"),j("colors.primarySubdued"),j("colors.primaryCoreLightened"),j("colors.tertiaryType1Light"),j("colors.primaryCoreLightened"),j("colors.primaryCoreLightened"),j("colors.primaryCoreLightened");const de=new a;var be=e`:host {
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
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(d.spacer)}))) / 16) * 1rem);
}
${de.mediaRules()}`;const pe={dark:e`
    ${J.dark}
  `,light:e`
    ${J.light}
  `};class me extends(b(Q)){static get is(){return"bbva-form-text"}static get scopedElements(){return{"bbva-clip-flag":H,"bbva-button-icon":h,"bbva-core-icon":u,"bbva-text":v}}static get properties(){return{flagSize:{type:String,attribute:"flag-size"},flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="text",this.flagSize="small",this.flagText=""}static get styles(){return[super.styles,be,pe.light,pe.dark,x("bbva-form-text-shared-styles")]}get field(){return k`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return k`
      ${this.flag?k`
            <span class="flag">
              <bbva-clip-flag
                icon="${S(this.flag)}"
                .size="${this.flagSize}"
                iconset="${S(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get labelBlock(){return k`
      <span class="label" aria-hidden="true" @click="${this.focus}">${this.inputLabel}</span>
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}customElements.define(me.is,me);class he extends(X(p(C))){static get is(){return"bbva-aggregation-profile-recipients-address"}static get properties(){return{addressData:{type:Object},arrayColonies:{type:Array},country:{type:String},countryCode:{type:String},_disableSendDataButton:{type:Boolean},postCodePattern:{type:String},streetPattern:{type:String},outdoorIntPattern:{type:String}}}static get styles(){return[U,x("bbva-aggregation-profile-recipients-address-shared-styles"),x("bbva-shared-style-component-utilities")]}constructor(){super(),this.initializeProperties(),this.postCodePattern="[0-9]",this.streetPattern="[a-z A-Z 0-9ñÑáÁâÂäÄàÀéÉêÊëËèÈíÍîÎïÏìÌóÓôÔöÖòÒúÚûÛüÜùÙ]",this.outdoorIntPattern="[a-z A-Z 0-9]"}initializeProperties(){this.country="",this.arrayColonies=[],this._disableSendDataButton=!0,this.addressData={colony:"",extNumber:"",intNumber:"",municipality:"",postalCode:"",state:"",street:""}}firstUpdated(){this._inputStreet=this.shadowRoot.querySelector("#form-input-street"),this._inputInteriorNumber=this.shadowRoot.querySelector("#input-interior-number"),this._inputOutdoorNumber=this.shadowRoot.querySelector("#form-outdoor-number"),this._selectElementColony=this.shadowRoot.querySelector("#form-colony-select"),this._formPostalCode=this.shadowRoot.querySelector("#form-postal-code")}get dataIsValid(){return!(this._inputStreet.hasAttribute("invalid")||this._inputInteriorNumber.hasAttribute("invalid")||this._inputOutdoorNumber.hasAttribute("invalid"))}_colonySelected(){""===this.addressData.colony?this._selectElementColony.setAttribute("invalid","true"):this._selectElementColony.removeAttribute("invalid")}_hasRequiredPostalCodeParams(e){const{postalCode:t}=this.addressData;""===t?(e.setAttribute("error-message",this.t("recipient-form-address-post-code-validation")),this._formPostalCode.setAttribute("invalid","true")):5!==t.length?(e.setAttribute("error-message",this.t("recipient-form-address-post-code-error")),this._formPostalCode.setAttribute("invalid","true")):(this.addressData.postalCode=this._formPostalCode.value.trim(),this._formPostalCode.removeAttribute("invalid"))}updated(e){this.addressData.page&&(this.addressData=this.addressData.params),e.forEach(((e,t)=>{"addressData"===t&&this._enabledContinueButton()}))}_hasRequiredinteriorParams(e){const{intNumber:t}=this.addressData;/[$%&()"@=¿?¡!'+*{}°;:,/|<>#]/.test(t)?(e.setAttribute("error-message",this.t("recipient-form-address-interior-error-signs")),this._inputInteriorNumber.setAttribute("invalid","true")):this._inputInteriorNumber.removeAttribute("invalid")}_hasRequiredStreet(e){const{street:t}=this.addressData;t.length>50?(e.setAttribute("error-message",this.t("recipient-form-address-error-characters")),this._inputStreet.setAttribute("invalid","true")):""===t?(e.setAttribute("error-message",this.t("recipient-form-address-street-validation")),this._inputStreet.setAttribute("invalid","true")):this._inputStreet.removeAttribute("invalid")}_hasRequiredExternalNumber(e){const{extNumber:t}=this.addressData;""===t?(e.setAttribute("error-message",this.t("recipient-form-address-outdoor-number-validation")),this._inputOutdoorNumber.setAttribute("invalid","true")):/[$%&()"@=¿?¡!'+*{}°;:,/|<>#]/.test(t)?(e.setAttribute("error-message",this.t("recipient-form-address-interior-error-signs")),this._inputOutdoorNumber.setAttribute("invalid","true")):this._inputOutdoorNumber.removeAttribute("invalid")}setAddresData(e){this.addressData=e.params,this.arrayColonies=[...e.params.arrayColonies],this._disableSendDataButton=!1,this._setInputValue("#form-colony-select",this.addressData.colony)}_sendData(){this.fireEvent("aggregation-profile-recipients-new-address-data",{...this.addressData}),this.reset()}_activeButton({target:e}){const{name:t}=e;this.addressData[t]=e.value.trim(),"street"===t?this._hasRequiredStreet(e):"intNumber"===t?this._hasRequiredinteriorParams(e):"extNumber"===t?this._hasRequiredExternalNumber(e):"postalCode"===t?this._hasRequiredPostalCodeParams(e):"colony"===t&&this._colonySelected(e),this._enabledContinueButton()}_enabledContinueButton(){const e=!(""!==this.addressData.street&&""!==this.addressData.extNumber&&""!==this.addressData.colony);this._disableSendDataButton=e||!this.dataIsValid}sendPostalCode(e){this.validatedColonies=!1;const t=e.target.value;t&&this._getPlaces(t)}_getPlaces(e){this.fireEvent("get-places-recipients",e)}getDataAddress(e){this.addressData.colony="",this.addressData.state=e.state.name,this.addressData.municipality=e.municipality.value,this.addressData.arrayColonies=e.colonies,this.addressData.countryCode=e.state.id,this.country=e.country,this.arrayColonies=[...e.colonies]}reset(){this.initializeProperties(),this._setInputValue("#form-input-street",""),this._setInputValue("#input-interior-number",""),this._setInputValue("#form-outdoor-number",""),this._setInputValue("#form-colony-select",""),this._setInputValue("#form-postal-code",""),this._inputStreet.removeAttribute("invalid"),this._inputInteriorNumber.removeAttribute("invalid"),this._inputOutdoorNumber.removeAttribute("invalid"),this._formPostalCode.removeAttribute("invalid")}_setInputValue(e,t){this.shadowRoot.querySelector(e).value=t}render(){return k`
      <form class="body-address">
        <bbva-form-field
        id="form-postal-code"
        name="postalCode"
        class="input-form-address"
        label="${this.t("recipient-form-address-post-code-label")}"
        info-message="${this.t("recipient-form-address-post-code")}"
        action-icon=${W()}
        action-type="submit"
        value="${this.addressData.postalCode}"
        optional-label=""
        allowed-pattern="${this.postCodePattern}"
        action-into-form
        @input="${this._activeButton}"
        @form-field-input-blur="${this._activeButton}"
        @form-field-button-submit="${this.sendPostalCode}">
        </bbva-form-field>
        <div class="padding-top-address">
          <bbva-list-simple
          class="padding-top-address"
          variant="stacked"
          label="${this.t("recipient-form-address-country-label")}"
          description="${this.country}" >
          </bbva-list-simple>
          <bbva-list-simple
          class="padding-top-address"
          variant="stacked"
          label="${this.t("recipient-form-address-state-label")}"
          description="${this.addressData.state}">
          </bbva-list-simple>
          <bbva-list-simple
          class="padding-top-address"
          variant="stacked"
          label="${this.t("recipient-form-address-locality-label")}"
          description="${this.addressData.municipality}">
          </bbva-list-simple>
        </div>
        <bbva-form-select
        id="form-colony-select"
        optional-label=""
        name="colony"
        class="padding-top-address input-form-address"
        label="${this.t("recipient-form-address-colony-label")}"
        ?disabled="${0===this.arrayColonies.length}"
        @change="${this._activeButton}">
        ${this.arrayColonies.map((e=>k` <bbva-form-option ?selected=${e.label===this.addressData.colony} value="${e.label}">${e.label}</bbva-form-option>
        `))}
        </bbva-form-select>
        <bbva-form-text
        id="form-input-street"
        name="street"
        class="padding-top-address input-form-address"
        label="${this.t("recipient-form-address-street-label")}"
        value="${this.addressData.street}"
        @input="${this._activeButton}"
        @form-field-input-blur="${this._activeButton}"
        allowed-pattern="${this.streetPattern}"
        optional-label="">
        </bbva-form-text>
        <bbva-form-text
          id="form-outdoor-number"
          name="extNumber"
          class="padding-top-address input-form-address"
          label="${this.t("recipient-form-address-outdoor-number-label")}"
          value="${this.addressData.extNumber}"
          @input="${this._activeButton}"
          @form-field-input-blur="${this._activeButton}"
          allowed-pattern="${this.outdoorIntPattern}"
          optional-label="">
        </bbva-form-text>
        <bbva-form-text
          id="input-interior-number"
          name="intNumber"
          class="padding-top-address"
          label="${this.t("recipient-form-address-interior-number-label")}"
          value="${this.addressData.intNumber}"
          optional-label=""
          allowed-pattern="${this.outdoorIntPattern}"
          @input="${this._activeButton}"
          @form-field-input-blur="${this._activeButton}">
        </bbva-form-text>
       <bbva-button-default
        variant="primary"
        ?disabled="${this._disableSendDataButton}"
        id="address-button-continue"
        class="action u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--1-5"
        @click="${this._sendData}">
          ${this.t("recipient-form-address-button-continue")}
        </bbva-button-default>
      </form>
    `}}customElements.define(he.is,he);
