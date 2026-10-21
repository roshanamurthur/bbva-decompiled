import{z as a,a8 as e,ar as t,a9 as r,aa as o,aE as i,a as n,aF as l,af as c,ag as s,bb as d,ak as p,h as m}from"./952f98a9.js";const u=new t;var b=a`:host {
  display: block;
  box-sizing: border-box;
  --_form-date-clear-icon-color: var(--bbva-form-date-clear-icon-color, var(--colorsPrimaryMedium, ${e(r.primaryMedium)}));
  --_form-date-invalid-clear-icon-color: var(--bbva-form-date-invalid-clear-icon-color, var(--colorsTertiaryType1Dark, ${e(r.tertiaryType1Dark)}));
  --_form-date-readonly-clear-color: var(--bbva-form-date-readonly-clear-icon-color, var(--colorsSecondary500, ${e(r.secondary500)}));
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
  padding-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em);
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
  justify-content: center;
  align-items: center;
  width: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}
.clear [data-tag-name=bbva-core-icon] {
  color: var(--_form-date-clear-icon-color);
}

:host([invalid]) .clear [data-tag-name=bbva-core-icon] {
  color: var(--_form-date-invalid-clear-icon-color);
}

:host([readonly]) .clear [data-tag-name=bbva-core-icon] {
  color: var(--_form-date-readonly-clear-color);
}
${u.mediaRules()}`;var v=a`[ambient^=light] {
  --bbva-form-date-clear-icon-color: initial;
  --bbva-form-date-invalid-clear-icon-color: initial;
  --bbva-form-date-readonly-clear-icon-color: initial;
}
${(new t).mediaRules()}`;const h=new t;const f={dark:a`
    ${a`[ambient^=dark] {
  --bbva-form-date-clear-icon-color: var(--colorsPrimaryVariantLightened, ${e(r.primaryVariantLightened)});
  --bbva-form-date-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${e(r.tertiaryType1Dark)});
  --bbva-form-date-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
}
${h.mediaRules()}`}
    ${i.dark}
  `,light:a`
    ${v}
    ${i.light}
  `};class y extends(n(l)){static get is(){return"bbva-form-date"}static get scopedElements(){return{"bbva-core-icon":c,"bbva-text":s}}constructor(){super(),this.type="date",this.clearIcon=d()}static get styles(){return[super.styles,b,f.light,f.dark,p("bbva-form-date-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return m`
      <div
        class="field"
        @keydown="${this._onFocusin}"
        @click="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}get clearIconBlock(){return m`
      <span class="clear">
        <bbva-core-icon
          .icon="${this.clearIcon}"
          .size="${this.clearIconSize}"
          aria-hidden="true"
        ></bbva-core-icon>
      </span>
    `}}export{y as B,f as b};
