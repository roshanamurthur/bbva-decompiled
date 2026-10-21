import"./e3e7c3f1.js";import"./a3995b85.js";import"./9afcde0d.js";import{a$ as t,ao as e,br as i}from"./7f3d7ca9.js";import{z as a,ar as o,a8 as r,a9 as n,b0 as l,bc as s,ab as c,ac as d,ad as b,aa as p,a as h,an as m,L as v,bh as u,af as g,b6 as f,G as y,ag as $,ak as S,h as k,av as x,cs as _,ct as w,aH as C,bF as T,aN as L,ah as I,i as E,cu as P,f as A,o as R,g as z,as as M,at as D,cR as B,bU as V,F,cS as q,al as H,au as N,aJ as O,aw as j,aK as U,ae as W,ch as Y,ci as X,bx as G,j as Z,l as J,Z as K,n as Q,H as tt,d9 as et,cD as it,bV as at,bI as ot,b4 as rt,dA as nt,dB as lt,b5 as st,bG as ct}from"./952f98a9.js";import"./b24c6aae.js";import{B as dt,b as bt}from"./ca1bc295.js";import{B as pt}from"./055a082b.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./83185839.js";import"./216055dc.js";import"./10a3ea7d.js";import"./c0a2f832.js";import"./cae0f1de.js";const ht=new o;var mt=a`[ambient^=light] {
  --bbva-list-action-bg-active-color: initial;
  --bbva-list-action-text-color: initial;
  --bbva-list-action-link-active-color: initial;
  --bbva-list-action-main-icon-color: initial;
  --bbva-list-action-main-icon-active-color: initial;
  --bbva-list-action-action-icon-color: initial;
  --bbva-list-action-main-icon-color-no-link: initial;
  --bbva-list-action-skeleton-color: initial;
  --bbva-list-action-active-icon-color: initial;
}
${ht.mediaRules()}`;const vt=new o;var ut=a`[ambient^=dark] {
  --bbva-list-action-bg-active-color: transparent;
  --bbva-list-action-text-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-list-action-link-active-color: var(--colorsPrimarySubduedLight, ${r(n.primarySubduedLight)});
  --bbva-list-action-main-icon-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-list-action-main-icon-active-color: var(--colorsPrimarySubduedLight, ${r(n.primarySubduedLight)});
  --bbva-list-action-action-icon-color: var(--colorsPrimarySubdued, ${r(n.primarySubdued)});
  --bbva-list-action-main-icon-color-no-link: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-list-action-skeleton-color: var(--colorsPrimaryMedium, ${r(n.primaryMedium)});
  --bbva-list-action-active-icon-color: var(--colorsPrimarySubduedLight, ${r(n.primarySubduedLight)});
}
${vt.mediaRules()}`;const gt={dark:a`
    ${l.dark}
    ${s.dark}
    ${ut}
  `,light:a`
    ${l.light}
    ${s.light}
    ${mt}
  `},ft=new o;var yt=a`:host {
  --_list-action-date-font-weight: var(--bbva-list-action-date-font-weight,var(--fontFacePrimaryMediumItalicFontWeight, ${r(c.mediumItalic.fontWeight)}));
  --_list-action-text-color: var(--bbva-list-action-text-color,var(--colorsSecondary600, ${r(n.secondary600)}));
  --_list-action-link-active-color: var(--bbva-list-action-link-active-color, var(--colorsPrimaryCoreDark, ${r(n.primaryCoreDark)}));
  --_list-action-main-icon-color: var(--bbva-list-action-main-icon-color,var(--colorsPrimaryMedium, ${r(n.primaryMedium)}));
  --_list-action-main-icon-active-color: var(--bbva-list-action-main-icon-active-color, var(--colorsPrimaryCoreDark, ${r(n.primaryCoreDark)}));
  --_list-action-main-icon-color-no-link: var(--bbva-list-action-main-icon-color-no-link, var(--colorsSecondary600, ${r(n.secondary600)}));
  --_list-action-action-icon-color: var(--bbva-list-action-action-icon-color, var(--colorsPrimaryMedium, ${r(n.primaryMedium)}));
  --_list-action-active-icon-color: var(--bbva-list-action-active-icon-color, var(--colorsPrimaryCoreDark, ${r(n.primaryCoreDark)}));
  --_list-action-bg-active-color: var(--bbva-list-action-bg-active-color, var(--colorsSecondary100, ${r(n.secondary100)}));
  --skeleton-quote-color: var(--bbva-list-action-skeleton-color, var(--colorsSecondary200, ${r(n.secondary200)}));
  --skeleton-quote-bg: var(--bbva-list-action-skeleton-bg, transparent);
  padding: var(--bbva-list-action-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem));
  display: flex;
  align-items: start;
  justify-content: space-between;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
  user-select: none;
}

.main-icon {
  width: 1.5rem;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
  color: var(--_list-action-main-icon-color);
}

.main-content {
  flex-grow: 1;
  overflow: hidden;
}

.main-title {
  display: inherit;
  font-size: var(--typographyTypeMedium, ${r(d.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(c.medium.fontWeight)});
  line-height: var(--lineHeightTypeMedium, ${r(b.typeMedium)});
  text-align: left;
  align-self: start;
}

:host([no-link]) .main-title {
  color: var(--_list-action-text-color);
}
:host([no-link]) .main-icon {
  color: var(--_list-action-main-icon-color-no-link);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  height: 5.125rem;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((40% * 2) + (16px/ 2)) 16px, calc((8% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px;
  background-position: 16px 18px, calc(100% - 16px) 18px, 16px 48px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

:host(:not([no-link]):active) {
  background-color: var(--_list-action-bg-active-color);
}
:host(:not([no-link]):active) .main-title {
  color: var(--_list-action-link-active-color);
}
:host(:not([no-link]):active) .main-icon {
  color: var(--_list-action-main-icon-active-color);
}

[data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
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

[data-tag-name=bbva-link]:not([href])[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

::slotted(*) {
  color: var(--_list-action-text-color);
  font-size: 15px;
  margin-bottom: 8px;
}

.description {
  color: var(--_list-action-text-color);
  font-size: var(--typographyTypeSmall, ${r(d.typeSmall)});
  line-height: var(--lineHeightTypeMedium, ${r(b.typeMedium)});
  margin: 0;
}

.action-icon {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
  color: var(--_list-action-action-icon-color);
}

.actions {
  display: flex;
}
.actions [active] .action-icon {
  color: var(--_list-action-active-icon-color);
}

.date,
.date-book {
  color: var(--_list-action-text-color);
  font-size: var(--typographyTypeSmall, ${r(d.typeSmall)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${r(c.mediumItalic.fontStyle)});
  font-weight: var(--_list-action-date-font-weight);
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem) 0;
}

.date-book {
  --_list-action-date-font-weight: var(--fontFacePrimaryBookItalicFontStyle, ${r(c.bookItalic.fontStyle)});
}

.spinner {
  --bbva-spinner-size: 32px;
  align-self: center;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
${ft.mediaRules()}`;class $t extends(h(m(v))){static get is(){return"bbva-list-action"}static get scopedElements(){return{"bbva-badge-default":u,"bbva-core-icon":g,"bbva-link":f,"bbva-spinner":y,"bbva-text":$}}static get properties(){return{date:{type:String},dateBook:{type:String,attribute:"date-book"},dateEllipsis:{type:Number,attribute:"date-ellipsis",reflect:!0},icon:{type:String},noLink:{type:Boolean,attribute:"no-link",reflects:!0},mainTitle:{type:String,attribute:"main-title"},mainTitleEllipsis:{type:Number,attribute:"main-title-ellipsis",reflect:!0},badgeText:{type:String,attribute:"description-badge-text"},badgeType:{type:String,attribute:"badge-type"},actionIconLeft:{type:String,attribute:"action-icon-left"},actionIconRight:{type:String,attribute:"action-icon-right"},accessibilityTextIconLeft:{type:String,attribute:"accessibility-text-icon-left"},accessibilityTextIconRight:{type:String,attribute:"accessibility-text-icon-right"},description:{type:String},descriptionEllipsis:{type:Number,attribute:"description-ellipsis",reflect:!0},disabled:{type:Boolean},loading:{type:Boolean,reflect:!0},spinnerLoading:{type:Boolean,attribute:"spinner-loading"},spinnerAccessibilityText:{type:String,attribute:"spinner-accessibility-text"},headingLevel:{type:String,attribute:"heading-level"}}}constructor(){super(),this.disabled=!1,this.actionIconLeft="",this.actionIconRight="",this.description="",this.mainTitle="",this.date="",this.mainTitleEllipsis=0,this.dateEllipsis=0,this.descriptionEllipsis=0,this.dateBook="",this.loading=!1,this.spinnerLoading=!1,this.accessibilityTextIconLeft="bbva-list-action-icon-left-accessibility",this.accessibilityTextIconRight="bbva-list-action-icon-right-accessibility",this.spinnerAccessibilityText="bbva-list-action-spinner-accessibility",this.headingLevel="h3",this.icon="",this.noLink=!1,this.badgeText="",this.badgeType=""}static get styles(){return[yt,gt.dark,gt.light,S("bbva-list-action-shared-styles")]}firstUpdated(t){super.firstUpdated(t);const e=this.shadowRoot.querySelector(".main-content");this.noLink||e.addEventListener("click",this.titleClicked)}titleClicked(){this.dispatchEvent(new CustomEvent("list-action-title-click",{detail:!0,bubbles:!0,composed:!0}))}iconClicked(t){this.dispatchEvent(new CustomEvent(`list-action-${t.target.id}-icon-click`,{detail:!0,bubbles:!0,composed:!0}))}static _textContent(t,e,i,a,o){return k`
      <bbva-text
        tabindex="0"
        data-tag-name="bbva-text"
        unset
        ?ellipsis="${!!i}"
        .lines="${i}"
        class="${t}"
        .tag="${o}"
        .size="${a}"
        .text="${e}"
      >
      </bbva-text>
    `}_actionIcon(t,e,i,a){return k`
      <bbva-link data-tag-name="bbva-link">
        <span class="sr-only">${this.t(e)}</span>
        <bbva-core-icon
          aria-hidden="true"
          data-tag-name="bbva-core-icon"
          id="${i}"
          @click="${t}"
          .icon="${a}"
          class="action-icon"
        ></bbva-core-icon>
      </bbva-link>
    `}get _loading(){return k`
      <span class="sr-only">${this.t(this.spinnerAccessibilityText)}</span>
      <bbva-spinner class="spinner" data-tag-name="bbva-spinner" with-mask></bbva-spinner>
    `}get _title(){return k`
      ${this.noLink?k`
            ${this.mainTitle&&$t._textContent("main-title",this.mainTitle,this.mainTitleEllipsis,"M",this.headingLevel)}
          `:k`
            <bbva-link
              ?disabled="${this.disabled}"
              class="main-title ${x({ellipsis:this.mainTitleEllipsis})}"
              data-tag-name="bbva-link"
            >
              ${this.mainTitle}
            </bbva-link>
          `}
    `}get _actionsIcons(){return k`
      <div class="actions">
        ${this.actionIconLeft&&this._actionIcon(this.iconClicked,this.accessibilityTextIconLeft,"left",this.actionIconLeft)}
        ${this.actionIconRight&&this._actionIcon(this.iconClicked,this.accessibilityTextIconRight,"right",this.actionIconRight)}
      </div>
    `}get _icon(){return k`
      ${this.icon&&k`
          <bbva-core-icon
            aria-hidden="true"
            data-tag-name="bbva-core-icon"
            id="bbva-list-action-main-icon"
            icon="${this.icon}"
            class="main-icon"
          ></bbva-core-icon>
        `||""}
    `}get _badgeDefault(){return k`
      <bbva-badge-default data-tag-name="bbva-badge-default" .text="${this.badgeText}" .type="${this.badgeType}"> </bbva-badge-default>
    `}get _date(){return this.date&&!this.dateBook&&$t._textContent("date",this.date,this.dateEllipsis,"S","span")||this.dateBook&&!this.date&&$t._textContent("date-book",this.dateBook,this.dateEllipsis,"S","span")||""}render(){return k`
      ${this._icon}
      <div class="main-content">
        ${this._title} ${this._date}
        ${this.description&&$t._textContent("description",this.description,this.descriptionEllipsis,"S","span")}
        ${this.badgeText&&this._badgeDefault||""}
      </div>

      ${!this.spinnerLoading&&this._actionsIcons||this._loading}
    `}}customElements.define($t.is,$t);const St=new o;var kt=a`[ambient^=light] {
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
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
}
${St.mediaRules()}`;const xt=new o;var _t=a`[ambient^=dark] {
  --bbva-form-field-bg-color: #0A5393;
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsSecondary300, ${r(n.secondary300)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${r(n.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${r(n.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${r(n.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${r(n.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${r(n.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${r(n.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${r(n.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${r(n.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${r(n.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${r(n.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${r(n.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${r(n.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
}
${xt.mediaRules()}`;const wt={dark:a`
    ${_t}
    ${_.dark}
    ${l.dark}
  `,light:a`
    ${kt}
    ${_.light}
    ${l.light}
  `};var Ct=a`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${r(n.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${r(n.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${r(n.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${r(n.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${r(n.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${r(n.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${r(n.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${r(n.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${r(n.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${r(n.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${r(n.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${r(n.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${r(n.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${r(n.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${r(n.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${r(n.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${r(n.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${r(n.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${r(n.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${r(n.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${r(n.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${r(n.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${r(n.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${r(n.tertiaryType1Dark)})));
  --bbva-button-icon-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${r(n.primaryMedium)})));
  --bbva-button-icon-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${r(n.primaryCore)})));
  --bbva-button-icon-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${r(n.primaryMedium)})));
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
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
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
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${r(d.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
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
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${r(d.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${r(b.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${r(c.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

.label-out-text {
  font-family: inherit;
  font-size: var(--bbva-form-field-label-out-font-size, var(--typographyTypeSmall, ${r(d.typeSmall)}));
  line-height: var(--bbva-form-field-label-out-line-height, var(--lineHeightTypeSmall, ${r(b.typeSmall)}));
  color: var(--_field-label-out-color);
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
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
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em);
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
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem) 0;
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${r(d.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${r(b.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}
.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
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
`;class Tt extends(h(m(w))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-button-icon":C,"bbva-text":$,"bbva-core-icon":g,"bbva-link":f}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=24,this.actionAccessibleText="bbva-form-field-submit",this.actionIntoForm=!1,this.clearIcon=T(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-field-clear",this.optionalLabel="bbva-form-field-optional-label",this.errorIcon=L(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=I(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1}firstUpdated(t){super.firstUpdated(t),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const e=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",e.style.display="none",e.innerHTML=this.inputInnerStyles,this.appendChild(e)}updated(t){super.updated(t),t.has("value")&&(this.autoValidate||void 0===t.get("value")||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const t=this.invalid?this.errorMessage:"";return t&&this.infoMessage?`${t}. ${this.infoMessage}`:t||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.label}`:`${this.label} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?k`
          <bbva-link
            @click="${this._helpClicked}"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            href="${E(this.linkHref)}"
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
      `:""}static get styles(){return[super.styles,Ct,wt.light,wt.dark,S("bbva-form-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return k`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return k`
      <div
        class="wrapper"
        @keydown="${t=>13===t.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
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
        `:""}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const t=this._rootNode.activeElement,e=this.shadowRoot.activeElement||t;this._field.contains(e)||t===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus"))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur"))}clearInput(){this._formElement&&(this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus())}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return k`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}}z("colors.cool70"),z("colors.primaryCoreLightened"),z("colors.cool20"),z("colors.primaryCoreLightened"),z("colors.primaryCoreLightened"),z("colors.primaryCoreLightened"),z("colors.primaryCoreLightened"),z("colors.cool20"),z("colors.cool20"),z("colors.cool20"),z("colors.cool20"),z("colors.primaryCoreLightened"),z("colors.primaryCoreLightened"),z("colors.tertiaryType1Light"),z("colors.cool20"),z("colors.cool20"),z("colors.cool70"),z("colors.primaryCoreLightened"),z("colors.tertiaryType1Light"),z("colors.tertiaryType1Light"),z("colors.tertiaryType1Light"),z("colors.primarySubdued"),z("colors.primaryCoreLightened"),z("colors.tertiaryType1Light"),z("colors.primaryCoreLightened"),z("colors.primaryCoreLightened"),z("colors.primaryCoreLightened");const Lt=new o;var It=a`@charset "UTF-8";
:host {
  display: block;
  box-sizing: border-box;
  --_form-amount-currency-color: var(--bbva-form-amount-currency-dark-mode-color, var(--bbva-form-amount-currency-color, var(--colorsSecondary600, ${r(n.secondary600)})));
  --_form-amount-readonly-currency-color: var(--bbva-form-amount-readonly-currency-dark-mode-color, var(--bbva-form-amount-readonly-currency-color, var(--colorsSecondary500, ${r(n.secondary500)})));
  --_form-amount-currency-invalid-color: var(--bbva-form-amount-currency-dark-mode-invalid-color, var(--bbva-form-amount-currency-invalid-color, var(--colorsTertiaryType1Dark, ${r(n.tertiaryType1Dark)})));
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
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 15) * 1em);
}

.back {
  position: absolute;
  display: flex;
  align-items: center;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 15) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 15) * 1em);
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${r(d.typeSmall)}));
}
:host([focused]) .back, :host([filled]) .back {
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 15) * 1em);
}
.back-amount {
  flex: auto;
  opacity: 0;
}
:host([focused]) .back-amount, :host([filled]) .back-amount {
  flex: none;
  max-width: calc(100% - rem(48px));
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
  content: "";
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

:host([invalid]) .back-currency {
  color: var(--_form-amount-currency-invalid-color);
}
${Lt.mediaRules()}`,Et=a`[ambient^=dark] {
  --bbva-form-amount-currency-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-amount-readonly-currency-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-form-amount-currency-invalid-color: var(--colorsTertiaryType1Dark, ${r(n.tertiaryType1Dark)});
}
`,Pt=a`[ambient^=light] {
  --bbva-form-amount-currency-color: initial;
  --bbva-form-amount-readonly-currency-color: initial;
  --bbva-form-amount-currency-invalid-color: initial;
}
`;const At={dark:a`
    ${Et}
    ${wt.dark}
  `,light:a`
    ${Pt}
    ${wt.light}
  `};class Rt extends(M(D(h(Tt)))){static get is(){return"bbva-form-amount"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._checkTrailingDecimal=this._checkTrailingDecimal.bind(this),this.addEventListener("blur",this._checkTrailingDecimal)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("blur",this._checkTrailingDecimal)}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._currencyBlock=this.shadowRoot.querySelector(".back-currency")}updated(t){super.updated&&super.updated(t),t.has("language")&&(this.allowedPattern=`[0-9${this._separator}${this._groupChar}]`),t.has("value")&&this.formatValue(this.value),(t.has("localCurrency")||t.has("currencyCode"))&&this._setCurrencyWidth()}static get styles(){return[super.styles,It,At.dark,At.light,S("bbva-form-amount-shared-styles")]}get amount(){return this.value?Number(this.value.replace(new RegExp(`\\${this._groupChar}`,"g"),"").replace(new RegExp(`\\${this._separator}`),".")):0}set amount(t){Number.isFinite(t)&&(this.value=String(t).replace(/\./g,this._separator))}get _isRightAligned(){return this._alignRight}get labelBlock(){return k`
      <span class="label" aria-hidden="true" @click="${this.focus}">${this.label}</span>
    `}get inputLabel(){return`${this.label} (${this._currency})`}get field(){return k`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.backAmount} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get backAmount(){return k`
      <span class="back" aria-hidden="true">
        <span
          class="back-currency ${this._isRightAligned?"right":""} ${this.placeholder&&!this.value?"hide-currency":""}"
          >${this._currency}</span
        >
        <span class="back-amount">${this.value}</span>
      </span>
    `}_setCurrencyWidth(){const t=this._isRightAligned?0:this._currencyBlock.offsetWidth,e=a`
      ${t/16}rem
    `;this._formElement.style.setProperty("margin-left",e)}_formatNumber(t,e){return e?t.replace(/\D/g,"").replace(/\B(?=(\d{3})+(?!\d))/g,this._groupChar):t.replace(/\D/g,"")}_formatCurrency(t,e){let i;if(t.indexOf(e)>=0){const a=t.indexOf(e);let o=t.substring(0,a),r=t.substring(a);o=this._formatNumber(o,!0),r=this._formatNumber(r,!1),r=r.substring(0,this.decimalDigits),i=this.decimalDigits?o+e+r:o}else i=this._formatNumber(t,!0);return i}formatValue(t){if(""===t||null==t)return void this._fireChange(t,this.amount);const e=String(t),i=this._formElement,a=e.length;let o=i.selectionStart;const r=this._formatCurrency(e,this._separator);i.value=r,e===r&&this._fireChange(r,this.amount),this.value=i.value;o=r.length-a+o,i.setSelectionRange(o,o)}_checkTrailingDecimal(){this.value&&this.value.endsWith(this._separator)&&(this.value=this.value.replace(this._separator,""))}_fireChange(t,e){this.dispatchEvent(new CustomEvent("form-amount-input-change",{detail:{value:t,amount:e},bubbles:!0,composed:!0}))}}customElements.define(Rt.is,Rt);const zt=new o;var Mt=a`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${r(n.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_modal-padding: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${r(n.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${r(n.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${r(n.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${r(n.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${r(n.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${r(n.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)})));
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  visibility: hidden;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
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
  padding-bottom: calc(calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
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
  will-change: transform;
  z-index: 1;
}
.transition-container.half-height {
  max-height: 50%;
  top: auto;
}
.transition-container.half-height .modal-main {
  background-color: var(--_help-modal-content-bg-color);
}
.transition-container .help-modal {
  width: 100%;
  box-sizing: border-box;
  height: 100%;
  align-items: center;
  margin: auto;
  display: flex;
  justify-content: center;
}

.modal-container {
  width: 100%;
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${r(d.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${r(c.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${r(b.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em) 0 0);
  transform: translateZ(0.01px);
}

:host(:not([full-height])) .slot-footer {
  background-color: var(--_help-modal-footer-bg-color);
}

:host([full-height]) .help-modal {
  background-color: var(--_help-modal-full-height-bg-color);
  display: block;
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
.modal-content [data-tag-name=bbva-text] {
  color: var(--_help-modal-content-color);
}

:host([modal-type=warning]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-warning);
}

:host([modal-type=info]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-info);
}

.modal-content-wrapper {
  max-width: var(--bbva-help-modal-content-max-width, 100%);
  width: var(--bbva-help-modal-content-width, 100%);
  color: var(--_help-modal-content-color);
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${r(d.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${r(b.typeSmall)}));
  text-align: center;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-link].footer-button {
  text-align: center;
}

:host([fixed-footer]) .modal-container {
  flex-grow: 1;
  overflow-y: auto;
  display: flex;
  flex-direction: column;
}
:host([fixed-footer]) .modal-content-wrapper, :host([fixed-footer]) .modal-content, :host([fixed-footer]) .slot-content {
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  width: 100%;
}
:host([fixed-footer]) .slot-footer {
  box-shadow: var(--bbva-help-modal-footer-fixed-shadow, 0 0 4px 0 rgba(18, 18, 18, 0.3));
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em);
}
:host([fixed-footer]) .transition-container .modal-main {
  padding-bottom: var(--bbva-help-modal-safe-area-inset-bottom, 0);
}

:host([visible]) {
  visibility: visible;
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
  --bbva-help-modal-transition-easing: cubic-bezier(0.8,0,1,1);
  --bbva-help-modal-veil-transition-easing: cubic-bezier(0.8,0,1,1);
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
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1em);
  }

  .modal-title [data-tag-name=bbva-text] {
    width: 40rem;
  }
}
${zt.mediaRules()}`;class Dt extends(h(m(B))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":V,"bbva-icon":F,"bbva-text":$,"bbva-header-main":t,"bbva-link":f}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},disabledButton:{type:Boolean,attribute:"disabled-button"},titleLines:{type:Number,attribute:"title-lines"},showTextIcon:{type:Boolean,attribute:"show-text-icon"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=T(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.showTextIcon=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),this._checkHeight()}updated(t){if(super.updated&&super.updated(t),this.fullHeight||this.setAttribute("hide-content-padding-top",!0),t.has("visible")){let t="close";this.visible&&(t="open"),this.dispatchEvent(new CustomEvent(`help-modal-${t}`,{detail:{status:t,modal:this},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,Mt,S("bbva-help-modal-shared-styles"),q.light,l.light]}get _fixedIOSHeader(){return k`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?k`
          <slot name="slot-header" class="header-slot">
            <bbva-header-main
              data-tag-name="bbva-header-main"
              id="helpModalHeader"
              ?show-text-icon="${this.showTextIcon}"
              variant="${this.headerType}"
              text="${this.headerText}"
              icon-right-primary="${this.iconRightPrimary}"
              icon-right-secondary="${this.iconRightSecondary}"
              icon-left-primary="${this.iconLeftPrimary}"
              icon-left-secondary="${this.iconLeftSecondary}"
              accessibility-text-icon-left-primary="${this.accessibilityTextIconLeftPrimary}"
              accessibility-text-icon-left-secondary="${this.accessibilityTextIconLeftSecondary}"
              accessibility-text-icon-right-primary="${this.accessibilityTextIconRightPrimary}"
              accessibility-text-icon-right-secondary="${this.accessibilityTextIconRightSecondary}"
              @header-main-icon-right-primary-click="${()=>this._handleClick("header-right-primary")}"
              @header-main-icon-right-secondary-click="${()=>this._handleClick("header-right-secondary",!1)}"
              @header-main-icon-left-primary-click="${()=>this._handleClick("header-left-primary",!1)}"
              @header-main-icon-left-secondary-click="${()=>this._handleClick("header-left-secondary",!1)}"
            ></bbva-header-main>
          </slot>
        `:""}get helpModalContent(){return k`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?k`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:k`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":k`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return k`
      <div class="modal-footer">
        <slot name="slot-footer">
          <div class="slot-footer" ?hidden="${!this.buttonText&&!this.linkText}">
            <bbva-button-default
              ambient="light"
              class="footer-button"
              data-tag-name="bbva-button-default"
              ?hidden="${!this.buttonText}"
              ?disabled="${this.disabledButton}"
              @click="${()=>this._handleClick("footer-button")}"
              >${this.buttonText}</bbva-button-default
            >
            ${this.linkText?k`<bbva-link
                  ambient="light"
                  class="footer-button"
                  data-tag-name="bbva-link"
                  @click="${()=>this._handleClick("footer-link")}"
                  ?hidden="${!this.linkText}"
                  >${this.linkText}</bbva-link
                >`:null}
          </div>
        </slot>
      </div>
    `}get helpModalTitle(){return k`
      <div id="helpModalTitle" class="modal-title">
        <slot name="slot-title">
          <bbva-icon
            class="title-icon"
            data-tag-name="bbva-icon"
            size="24"
            icon="${this.titleIcon}"
            ?hidden="${!this.titleIcon}"
            aria-hidden="true"
          ></bbva-icon>
          ${this.titleText?k` <bbva-text
                id="title-text"
                .text=${this.titleText}
                ?hidden="${!this.titleText}"
                alignment="center"
                ellipsis
                .lines="${this.titleLines}"
                unset
                font-weight="500"
                tag="h2"
              >
              </bbva-text>`:null}
        </slot>
      </div>
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_runScrollReset(){const t=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==t||t.scrollTo(0,0)}))}))}_setFooterShadow(t){t.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(t){this.dispatchEvent(new CustomEvent(`help-modal-${t}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(t)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const t=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(t[0])}get _modalContent(){return k`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${x({"half-height":!this.fullHeight})}"
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
    `}}customElements.define(Dt.is,Dt);const Bt=new o;var Vt=a`:host {
  display: block;
  box-sizing: border-box;
  --_list-contact-color: var(--bbva-list-contact-dark-mode-color, var(--bbva-list-contact-color, var(--colorsSecondary500, ${r(n.secondary500)})));
  --_list-contact-title-color: var(--bbva-list-contact-dark-mode-title-color, var(--bbva-list-contact-title-color, var(--colorsPrimaryMedium, ${r(n.primaryMedium)})));
  --_list-contact-title-no-link-color: var(--bbva-list-contact-dark-mode-title-no-link-color, var(--bbva-list-contact-title-no-link-color, var(--colorsSecondary600, ${r(n.secondary600)})));
  --_list-contact-title-pressed-color: var(--bbva-list-contact-dark-mode-title-pressed-color, var(--bbva-list-contact-title-pressed-color, var(--colorsPrimaryCore, ${r(n.primaryCore)})));
  --_list-contact-icon-color: var(--bbva-list-contact-dark-mode-icon-color, var(--bbva-list-contact-icon-color, var(--colorsPrimaryMedium, ${r(n.primaryMedium)})));
  --_list-contact-icon-pressed-color: var(--bbva-list-contact-dark-mode-icon-pressed-color, var(--bbva-list-contact-icon-pressed-color, var(--colorsPrimaryCore, ${r(n.primaryCore)})));
  --_list-contact-icon-no-link-color: var(--bbva-list-contact-dark-mode-icon-no-link-color, var(--bbva-list-contact-icon-no-link-color, var(--colorsSecondary600, ${r(n.secondary600)})));
  --_list-contact-pressed-bg: var(--bbva-list-contact-dark-mode-pressed-bg, var(--bbva-list-contact-pressed-bg, var(--colorsSecondary100, ${r(n.secondary100)})));
  --_list-contact-skeleton-quote-color: var(--bbva-list-contact-dark-mode-skeleton-quote-color, var(--bbva-list-contact-skeleton-quote-color, var(--colorsSecondary200, ${r(n.secondary200)})));
  --_list-contact-skeleton-quote-bg: var(--bbva-list-contact-dark-mode-skeleton-quote-bg, var(--bbva-list-contact-skeleton-quote-bg, transparent));
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

:host([hidden]),
[hidden] {
  display: none !important;
}

.column {
  display: flex;
  flex-direction: column;
  overflow: hidden;
}
.column.top-spacer {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
}

.top,
.title-wrapper,
.actions {
  display: flex;
}

.top {
  justify-content: space-between;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
}
.top .column:first-child {
  flex: 1;
}

.actions {
  justify-content: flex-end;
}

.title-wrapper {
  align-items: center;
}

button {
  all: unset;
}

[data-tag-name=bbva-core-icon] {
  color: var(--_list-contact-icon-color);
}
[data-tag-name=bbva-core-icon]:active {
  color: var(--_list-contact-icon-pressed-color);
}

[data-tag-name=bbva-clip-box],
[data-tag-name=bbva-clip-entities],
[data-tag-name=bbva-clip-product] {
  position: absolute;
}

[data-tag-name=bbva-text] {
  font-weight: var(--fontFacePrimaryBookFontWeight, ${r(c.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${r(c.book.fontStyle)});
  color: var(--_list-contact-color);
}

.title {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(c.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${r(c.medium.fontStyle)});
  color: var(--_list-contact-title-color);
  overflow: hidden;
}
.title.link {
  font-size: var(--typographyMedium, ${r(d.medium)});
}

.container {
  margin-left: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
}

.actions button:nth-child(2) {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link][active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  --bbva-link-disabled-opacity: 0.8;
}

[data-tag-name=bbva-badge-default] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-amount] {
  text-align: right;
}

:host([no-link]) [data-tag-name=bbva-text].title {
  color: var(--_list-contact-title-no-link-color);
}
:host([no-link]) [data-tag-name=bbva-core-icon]:not(.action) {
  color: var(--_list-contact-icon-no-link-color);
}

.wrapper {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(p.spacer)}))) / 16) * 1rem);
}
:host([hide-padding-top]) .wrapper {
  padding-top: 0;
}
:host([hide-padding-bottom]) .wrapper {
  padding-bottom: 0;
}
:host(:not([no-link])) .wrapper:active {
  background: var(--_list-contact-pressed-bg);
}
:host(:not([no-link])) .wrapper:active [data-tag-name=bbva-link].title {
  color: var(--_list-contact-title-pressed-color);
}
:host(:not([no-link])) .wrapper:active [data-tag-name=bbva-core-icon]:not(.action) {
  color: var(--_list-contact-icon-pressed-color);
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
  background-image: linear-gradient(var(--_list-contact-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_list-contact-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-contact-skeleton-quote-color) 50%);
  background-color: var(--_list-contact-skeleton-quote-bg, transparent);
  background-size: 48px 48px, calc((65% * 2) + (16px/ 2)) 16px, calc((35% * 2) + (16px/ 2)) 16px;
  background-position: 8px 16px, 64px 20px, 64px 44px;
}

:host([loading]) {
  pointer-events: none;
  min-height: 16rem;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}
${Bt.mediaRules()}`;const Ft=new o;var qt=a`[ambient^=dark] {
  --bbva-list-contact-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-list-contact-title-color: var(--colorsPrimarySubdued, ${r(n.primarySubdued)});
  --bbva-list-contact-title-no-link-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-contact-icon-color: var(--colorsPrimarySubdued, ${r(n.primarySubdued)});
  --bbva-list-contact-icon-no-link-color: var(--colorsPrimaryCoreLightened, ${r(n.primaryCoreLightened)});
  --bbva-list-contact-pressed-bg: var(--colorsPrimaryCoreDark, ${r(n.primaryCoreDark)});
  --bbva-list-contact-title-pressed-color: var(--colorsPrimarySubduedLight, ${r(n.primarySubduedLight)});
  --bbva-contact-icon-pressed-color: var(--colorsPrimarySubduedLight, ${r(n.primarySubduedLight)});
  --bbva-list-contact-skeleton-quote-color: var(--colorsPrimaryMedium, ${r(n.primaryMedium)});
  --bbva-list-contact-skeleton-quote-bg: var(--colorsPrimaryCore, ${r(n.primaryCore)});
}
${Ft.mediaRules()}`;const Ht=new o;var Nt=a`[ambient^=light] {
  --bbva-list-contact-color: initial;
  --bbva-list-contact-title-color: initial;
  --bbva-list-contact-title-pressed-color: initial;
  --bbva-list-contact-title-no-link-color: initial;
  --bbva-contact-icon-color: initial;
  --bbva-contact-icon-pressed-color: initial;
  --bbva-list-contact-icon-no-link-color: initial;
  --bbva-list-contact-pressed-bg: initial;
  --bbva-list-contact-skeleton-quote-color: initial;
  --bbva-list-contact-skeleton-quote-bg: initial;
}
${Ht.mediaRules()}`;const Ot={dark:a`
    ${s.dark}
    ${H.dark}
    ${N.dark}
    ${l.dark}
    ${qt}
  `,light:a`
    ${s.light}
    ${H.light}
    ${N.light}
    ${l.light}
    ${Nt}
  `};class jt extends(h(D(M(O(m(v)))))){static get is(){return"bbva-list-contact"}static get scopedElements(){return{"bbva-amount":j,"bbva-badge-default":u,"bbva-clip-box":U,"bbva-clip-entities":W,"bbva-clip-product":dt,"bbva-core-icon":g,"bbva-link":f,"bbva-text":$}}static get properties(){return{actionIconPrimary:{type:String,attribute:"action-icon-primary"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconPrimaryAccessibilityText:{type:String,attribute:"action-icon-primary-accessibility-text"},actionIconSecondaryAccessibilityText:{type:String,attribute:"action-icon-secondary-accessibility-text"},badgeText:{type:String,attribute:"badge-text"},badgeType:{type:String,attribute:"badge-type"},descriptions:{type:Array},entity:{type:String},iconClipBox:{type:String,attribute:"icon-clip-box"},image:{type:String},initials:{type:String},item:{type:String},loading:{type:Boolean},noLink:{type:Boolean,attribute:"no-link"},title:{type:String},contentTitle:{type:String,attribute:"content-title"},titleIcon:{type:String,attribute:"title-icon"},titleIconAccesibilityText:{type:String,attribute:"title-icon-accesibility-text"},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0}}}constructor(){super(),this.badgeType="default",this.descriptions=[],this.actionIconPrimary=Y(),this.actionIconPrimaryAccessibilityText="bbva-list-contact-action-icon-primary-accessibility-text",this.actionIconSecondary=X(),this.actionIconSecondaryAccessibilityText="bbva-list-contact-action-icon-secondary-accessibility-text",this.noLink=!1,this.loading=!1,this.hidePaddingBottom=!1,this.hidePaddingTop=!1}update(t){super.update(t),t.has("title")&&this._titleContent()}_titleContent(){this.title&&(this.contentTitle=this.title,this.title="",this.removeAttribute("title"))}static get styles(){return[super.styles,Vt,G("button:focus"),S("bbva-list-contact-shared-styles"),Ot.dark,Ot.light]}get _initials(){return this.initials||this.contentTitle.split(" ").map((t=>t.charAt(0))).reduce(((t,e)=>`${t}${e}`),"").toUpperCase()}get _clip(){let t="";return t=this.entity?k`
        <bbva-clip-entities data-tag-name="bbva-clip-entities" size="large" .entity=${this.entity}>
        </bbva-clip-entities>
      `:this.item?k`
        <bbva-clip-product
          data-tag-name="bbva-clip-product"
          size="large"
          item=${E(this.item)}
        ></bbva-clip-product>
      `:k`
        <bbva-clip-box
          aria-hidden="true"
          class="bitone"
          data-tag-name="bbva-clip-box"
          size="large"
          .text=${this._initials}
          .image=${this.image}
          .icon=${this.iconClipBox}
        >
        </bbva-clip-box>
      `,t}static _tplText(t){return k`<bbva-text data-tag-name="bbva-text" unset .text=${t} size="S"></bbva-text>`}get _amount(){return k`
      <bbva-amount
        data-tag-name="bbva-amount"
        ?decimals-hidden="${this.decimalsHidden}"
        variant="xl"
        .localCurrency="${this.localCurrency}"
        amount="${this.amount}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}get _icon(){return k`
      <span>
        <bbva-core-icon
          data-tag-name="bbva-core-icon"
          .icon="${this.titleIcon}"
          size="16"
          aria-hidden="true"
        ></bbva-core-icon>
        <span class="sr-only">${this.titleIconAccesibilityText}</span>
      </span>
    `}get _topBlock(){return k`
      <div class="top">
        <div class="column">
          <div class="title-wrapper">
            ${this.noLink?k`
                  <bbva-text
                    class="title"
                    data-tag-name="bbva-text"
                    ?disabled="${this.disabled}"
                    unset
                    text=${E(this.contentTitle)}
                    size="M"
                    ellipsis
                  ></bbva-text>
                `:k`
                  <bbva-link
                    data-tag-name="bbva-link"
                    ?disabled="${this.disabled}"
                    class="title link"
                    >${E(this.contentTitle)}</bbva-link
                  >
                `}
            ${this.titleIcon?this._icon:""}
          </div>
          ${this.descriptions.length>0?jt._tplText(this.descriptions[0]):""}
        </div>
        <div
          class="column ${x({"top-spacer":""===this.actionIconPrimary&&""===this.actionIconSecondary})}"
        >
          ${this.amount||0===this.amount?this._amount:this._actionBlock}
          ${this.descriptions.length>1?jt._tplText(this.descriptions[1]):""}
        </div>
      </div>
    `}get _descriptionBlock(){return k`
      ${this.descriptions.slice(2,5).map((t=>jt._tplText(t)))}
    `}get _badge(){return k`<bbva-badge-default
      data-tag-name="bbva-badge-default"
      .text=${this.badgeText}
      .type=${this.badgeType}
    ></bbva-badge-default>`}get _actionBlock(){return k`
      ${""!==this.actionIconPrimary||""!==this.actionSecondary?k`
            <div class="actions">
              ${""!==this.actionIconPrimary&&k`
                  <button
                    type="button"
                    ?disabled="${this.disabled}"
                    @click=${()=>this._onActionClick("primary")}
                  >
                    <bbva-core-icon
                      class="action"
                      data-tag-name="bbva-core-icon"
                      .icon="${this.actionIconPrimary}"
                      size="24"
                      aria-hidden="true"
                    >
                    </bbva-core-icon>
                    <span class="sr-only">${this.t(this.actionIconPrimaryAccessibilityText)}</span>
                  </button>
                `||""}
              ${""!==this.actionIconSecondary&&k`
                  <button
                    type="button"
                    ?disabled="${this.disabled}"
                    @click=${()=>this._onActionClick("secondary")}
                  >
                    <bbva-core-icon
                      class="action"
                      data-tag-name="bbva-core-icon"
                      .icon="${this.actionIconSecondary}"
                      size="24"
                      aria-hidden="true"
                    >
                    </bbva-core-icon>
                    <span class="sr-only"
                      >${this.t(this.actionIconSecondaryAccessibilityText)}</span
                    >
                  </button>
                `||""}
            </div>
          `:""}
    `}render(){return k`
      <div
        class="wrapper"
        @click=${t=>this._onClick(t)}
        @keydown=${t=>13===t.keyCode?this._onClick(t):""}
      >
        ${this._clip}
        <div class="container">
          ${this._topBlock} ${this.descriptions.length>2?this._descriptionBlock:""}
          ${this.badgeText?this._badge:""}
        </div>
      </div>
      <div class="skeleton"></div>
    `}_onClick(t){"action"===t.target.className||this.disabled||this.noLink||this.dispatchEvent(new CustomEvent("list-contact-link-click",{detail:!0,composed:!0,bubbles:!0}))}_onActionClick(t){this.dispatchEvent(new CustomEvent(`list-contact-action-${t}-click`,{detail:!0,composed:!0,bubbles:!0}))}}z("colors.cool20"),z("colors.primarySubdued"),z("colors.primaryCoreLightened"),z("colors.primaryMediumLight"),z("colors.primarySubdued"),z("colors.primaryMediumLight"),z("colors.primaryCoreLightened"),z("colors.cool60"),z("colors.cool50");const Ut=tt((t=>class extends(m(t)){static get properties(){return{}}fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}sumElements(t){return t.map((t=>t.customDetails.participationPercentage)).reduce(((t,e)=>t+e))}convertStrToInt(t){return parseInt(t,10)}}));var Wt=a`:host {
  display: block;
  box-sizing: border-box;
  --no-padding: 0;
  --no-margin: 0;
  --max-height-expandable-step: 1200px;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.recipient-no-padding {
  padding: var(--no-padding);
}

.recipient-list-cards {
  display: flex;
  flex-direction: column;
}

[ambient^=dark] bbva-list-card {
  --bbva-list-card-heading-color: var(--colorsPrimarySubdue, #ffffff);
}

.recipient-padding-form-amount {
  padding: 1rem 0;
}

.recipient-padding-common {
  padding: 1rem 0 2rem 0;
}

.recipient-bbva-expandable-step-height {
  --bbva-expandable-step-default-content-max-height: var(--max-height-expandable-step, 1050px);
}

.remove-list-style {
  list-style: none;
  padding: var(--no-padding);
}
.remove-list-style li {
  text-align: left;
}
.remove-list-style li bbva-list-bullet {
  padding: var(--no-padding, 0);
}

.text-content-recipient-modal {
  text-align: left;
  color: var(--_help-modal-title-title-color);
  margin: var(--no-margin);
}

.title-text-recipient-modal {
  color: var(--_help-modal-title-title-color);
  margin-bottom: var(--no-margin);
  font-size: 1rem;
}

.text-content-recipient-modal-error {
  text-align: center;
  color: var(--_help-modal-title-title-color);
  margin-top: 0.3125rem;
}

.success-button-container {
  padding: 1rem;
  display: flex;
  justify-content: center;
}

.recipient-bbva-expandable-step-height-2 {
  height: 100vh;
}

.padding-button-fixed {
  padding-bottom: 8rem;
}

.text-info-beneficiaries {
  margin-left: 1rem;
}
`;class Yt extends(h(Ut(m(v)))){static get is(){return"bbva-account-selected-step"}static get scopedElements(){const t=[$t,Rt,$,pt,f,V,it];return Yt.scopedElementsFromClasses(t)}static get properties(){return{recipientsList:{type:Array},totalSum:{type:Number}}}constructor(){super(),this.recipientsList=[],this.totalSum=0}static get styles(){return[Wt,S("bbva-shared-style-component-utilities")]}update(t){if(super.update(t),1===this.recipientsList.length){this.recipientsList.find((()=>!0)).customDetails.participationPercentage=100;const t=this.shadowRoot.querySelector("bbva-form-amount");this.totalSum=t.value}}_showModalRecipients(t){const e=t.target.mainTitle,i=this.recipientsList.filter((t=>t.customDetails.fullName===e));this.dispatchEvent(new CustomEvent("show-modal-delete",{detail:i,bubbles:!0,composed:!0}))}_onStepContinue(){const t=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-amount"]'),e=[...t].map((t=>parseInt(t.value,10))),i=e.includes(0);100!==e.reduce(((t,e)=>t+e))||i?[...t].map((t=>(t.setAttribute("invalid","true"),t))):([...t].map((t=>(t.removeAttribute("invalid"),t))),this.fireEvent("expandible-step-continue-step-two"))}validateInput(t){const{id:e,value:i}=t.target,a=this.convertStrToInt(i||0,10);this.recipientsList[e].customDetails.participationPercentage=a,this.totalSum=this.sumElements(this.recipientsList)}_navigateToPage(){this.fireEvent("multistep-profile-recipients-navigate-to-recipients-form",{page:"recipientsForm"})}haveRecipients(t){return 0===t.length}get _recipientLinkMessage(){return k`
    <span>${this.t(0===this.recipientsList.length?"bbva-multistep-profile-recipients-add-new-recipient-link-message":"bbva-multistep-profile-recipients-add-recipient-link-message")}
    </span>
    `}render(){return k` 
    <div>
      <bbva-text
        class="my-padding"
        size="S"
        text="${this.t("bbva-multistep-profile-recipients-second-step-title",{highlight:'<span class="highlight">',endHighlight:"</span>",newLine:"<br>"})}"></bbva-text>
      <bbva-text
        size="S"
        text="${this.t("bbva-multistep-profile-recipients-second-step-subtitle")}">
      </bbva-text>
       ${this.haveRecipients(this.recipientsList)?"":k`
        <div>
            ${this.recipientsList.map(((t,e)=>k`
                  <bbva-list-action
                    id="custom-details-${e}"
                    class="recipient-no-padding"
                    no-link
                    main-title="${t.customDetails.fullName}"
                    date-book="${t.customDetails.relationType.id}"
                    action-icon-right="${this.recipientsList.length>1?X():""}"
                    @list-action-right-icon-click="${this._showModalRecipients}">
                  </bbva-list-action>
                  <bbva-form-amount
                    id=${e}
                    value=${1===this.recipientsList.length?100:t.customDetails.participationPercentage}
                    @form-amount-input-change=${this.validateInput}
                    error-message="${this.t("bbva-multistep-profile-recipients-validation-percentages-sum")}"
                    maxlength="3"
                    class="recipient-padding-form-amount"
                    label="${this.t("bbva-multistep-profile-recipients-total-asigned")}"
                    label-out="${this.t("bbva-multistep-profile-recipients-percetage-title")}"
                    required=""
                    symbol="%"
                    decimal-digits="0">
                  </bbva-form-amount>
                  `))}
              <bbva-list-simple
                class="recipient-padding-common"
                label-medium=""
                label="${this.t("bbva-multistep-profile-recipients-total-percentage-asigned")}"
                action-accessibility-text="help"
                description="${this.totalSum} %">
              </bbva-list-simple> 
          </div>
       `}
      <bbva-link 
        id="navigationLink"
        ?disabled=${this.recipientsList.length>=6} 
        icon="${et()}"
        class="u-display--table u-margin-bottom--4 u-margin-top--2" 
        @click=${this._navigateToPage}>${this._recipientLinkMessage}
      </bbva-link>
      <bbva-notification-message message="${this.t("bbva-multistep-profile-recipients-second-step-notification-message")}"></bbva-notification-message>
      <bbva-button-default
        ?disabled=${this.haveRecipients(this.recipientsList)}
        id="secondStep"
        class="u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--0-5"
        text="${this.t("bbva-multistep-profile-recipients-continue-button-message")}"
        variant="primary"
        @click=${this._onStepContinue}
      >
      </bbva-button-default>
    </div>
    `}}class Xt extends(h(Ut(v))){static get is(){return"bbva-list-accounts-step"}static get scopedElements(){const t=[ot,e,rt];return Xt.scopedElementsFromClasses(t)}static get properties(){return{accountList:{type:Array}}}constructor(){super(),this.accountList=[]}static get styles(){return[at,Wt]}_onStepContinue(t){const e=t.target.cardTitle,{amount:i,id:a}=t.target,o=t.target.numProduct;this.fireEvent("account-item-click",a),this.fireEvent("expandible-step-continue",{name:e,amount:i,numCard:o})}disabledAccountItem(t){return"INDISTINCT"===t.type||"0260"===t.productId}render(){return k` 
    <div>
      <div class="list-cards">
        ${this.accountList.map(((t,e)=>k`
          <div>
            <bbva-list-card
               ?disabled=${this.disabledAccountItem(t)}
                hide-padding-top
                ambient="dark"
                currency-code="$"
                id=${t.id}
                amount=${t.amount}
                card-title=${t.name}
                content-text="${this.t("bbva-multistep-profile-recipients-avilable-balance")}"
                num-product=${t.number}
                @click=${this._onStepContinue}
                >
            </bbva-list-card>
            ${this.disabledAccountItem(t)?k`
              <bbva-notification-help
                hide-top-padding
                disabled
                accessibility-label-icon="alerta"
                class="alert"
                icon=${L()}
                text="${this.t("bbva-multistep-profile-recipients-notification-error")}"
                >
              </bbva-notification-help> `:""}
             ${this.accountList.length-1!==e?k`<bbva-divider size="fit"></bbva-divider>`:""}
          </div>
          `))}
      </div>
    </div>
    `}}class Gt extends(h(Ut(m(v)))){static get is(){return"bbva-multistep-profile-recipients"}static get scopedElements(){const t=[nt,it,Rt,lt,V,st,$t,ct,Dt,e,jt,pt,f,V,Xt,Yt,g,rt,$,ot];return Gt.scopedElementsFromClasses(t)}static get properties(){return{accountList:{type:Array},recipientsList:{type:Array},firstStepCompleted:{type:Boolean},secondStepCompleted:{type:Boolean},stepDisable:{type:Boolean},hasRecipients:{type:Boolean},nameRecipient:{type:String},accountSelected:{type:Object},changeSelectAccount:{type:Boolean},changeRecipients:{type:Boolean},maxRecipientsLength:{type:Number},isNativeIos:{type:Boolean},totalSteps:{type:Number},microImage:{type:String},isVisibleTextInfoBeneficiaries:{type:Boolean}}}showFinishedButton(){const t=this.recipientsList.map((({customDetails:t})=>t.participationPercentage)),e=this.sumElements(this.recipientsList);return this.hasRecipients&&100===e&&!t.includes(0)}constructor(){super(),this.firstStepCompleted=!1,this.stepDisable=!0,this.hasRecipients=!1,this.nameRecipient="",this.changeSelectAccount=!1,this.changeRecipients=!1,this.accountList=[],this.recipientsList=[],this.maxRecipientsLength=4,this.isNativeIos=!1,this.totalSteps=2,this.microImage="",this.isVisibleTextInfoBeneficiaries=!1}static get styles(){return[at,Wt,i.dark,Ot.dark,S("bbva-multistep-profile-recipients-shared-styles"),S("bbva-shared-style-component-utilities")]}firstUpdated(){this._modalError=this.shadowRoot.querySelector("#modal-error-black-list-recipient")}updated(t){this.firstStepVisited().completed||this.changeSelectAccount||this.fireEvent("multistep-profile-recipients-first-step-loaded"),t.has("hasRecipients")&&!this.hasRecipients&&(this.showInfoModalRecipient(),this.hasRecipients=!0)}firstStepVisited(){const t=this.shadowRoot.querySelectorAll("bbva-expandable-step");return Array.prototype.slice.call(t).filter((t=>"step-1"===t.id))[0]}reset(){this.firstStepCompleted=!1,this.secondStepCompleted=!1,this.recipientsList=[],this.nameRecipient="",this.changeSelectAccount=!1,this.changeRecipients=!1;const t=this.shadowRoot.querySelectorAll("bbva-expandable-step"),e=Array.prototype.slice.call(t);e.forEach((t=>{const e=t;return e.completed=!1,e})),e.forEach((t=>{const e=t;return e.disabled=!0,e}));const i=this.shadowRoot.querySelector("#step-1");i.disabled=!1,i.active=!0,this.fireEvent("multistep-profile-recipients-hide-confirm-button",!0)}_onEditStep(t){switch(t.target.id){case"step-1":this.firstStepCompleted=!1,this.secondStepCompleted=!0,this.changeSelectAccount=!0,this.changeRecipients=!1;break;case"step-2":this.firstStepCompleted=!0,this.secondStepCompleted=!1,this.changeRecipients=!0;break;default:this.firstStepCompleted=!1,this.secondStepCompleted=!1,this.secondStepCompleted=!1,this.changeRecipients=!1}this.fireEvent("multistep-profile-recipients-hide-confirm-button",!0)}_onStepContinue(t){this.firstStepCompleted=!0,this.secondStepCompleted=!1,this.stepDisable=!1,this.accountSelected=t.detail,this.fireEvent("multistep-profile-recipients-account-selected",this.accountSelected)}_onStep2Continue(){this.secondStepCompleted=!this.secondStepCompleted,this.fireEvent("multistep-profile-recipients-recipients-length",this.recipientsList.length),this.fireEvent("multistep-profile-recipients-hide-confirm-button",!this.showFinishedButton())}showInfoModalRecipient(){this.shadowRoot.querySelector("#modal-recipient").open()}_renderInformativeModalRecipient(){return k`
    <bbva-help-modal
      id="modal-recipient"
      fixed-footer
      hide-content-padding-top
      full-height
      accessibility-text-icon-right-primary = "entendido"
      header-type="modal"
      button-text="${this.t("bbva-multistep-profile-recipients-informative-modal-button-message")}"
      header-text="${this.t("bbva-multistep-profile-recipients-title")}"
    >
      <div slot="slot-title">
        <div class="image-svg">
           <bbva-core-icon class="title-icon" src="${this.microImage}" size="80"></bbva-core-icon>
        </div>
        <span class="title-text-recipient-modal">${this.t("bbva-multistep-profile-recipients-sub-title")}</span>
      </div>
      <div class="content" slot="slot-content">
        <p class="text-content-recipient-modal">${this.t("bbva-multistep-profile-recipients-informative-modal-content")}</p>
        <ul class="remove-list-style">
          <li>
            <bbva-list-bullet>
              <span>${this.t("bbva-multistep-profile-recipients-info-first-list-message",{highlight:t=>k`<b>${t}</b>`})}</span>
            </bbva-list-bullet>
          </li>
          <li>
              <bbva-list-bullet>
                <span>${this.t("bbva-multistep-profile-recipients-info-second-list-message",{highlight:t=>k`<b>${t}</b>`})}</span>
              </bbva-list-bullet>
          </li>
          <li>
              <bbva-list-bullet>
                <span>${this.t("bbva-multistep-profile-recipients-info-third-list-message",{highlight:t=>k`<b>${t}</b>`})}</span>
              </bbva-list-bullet>
          </li>
        </ul> 
        <bbva-link text="${this.t("bbva-multistep-profile-recipients-informative-modal-footer-link-message")}" @click="${this.showModalPrivacyNotice}"></bbva-link>
      </div>
  </bbva-help-modal>
    `}showModalPrivacyNotice(){this.fireEvent("bbva-multistep-profile-recipients-open-privacy-modal")}_showModalDelete(t){this.nameRecipient=t.detail[0].customDetails.fullName,this.shadowRoot.querySelector("#modal-delete").open()}_modalDeleteButton(){const t=this.shadowRoot.querySelector("bbva-account-selected-step"),e=this.recipientsList.filter((t=>t.customDetails.fullName!==this.nameRecipient));t.totalSum=this.sumElements(e),this.recipientsList=e,this.fireEvent("multistep-profile-recipients-deleted-recipient")}_modalDelete(){return k`
      <bbva-help-modal id="modal-delete"
      modal-type="warning"
      title-icon="${L()}"
      button-text="${this.t("bbva-multistep-profile-recipients-continue-button-message")}"
      link-text="${this.t("bbva-multistep-profile-recipients-modal-link-cancel")}"
      @help-modal-footer-button-click="${this._modalDeleteButton}">
      <div class="content" slot="slot-content">
        <span>
        ${this.t("bbva-multistep-profile-recipients-modal-delete-text-name",{nameRecipient:this.nameRecipient},"")}
        </span>
        <span>
        ${this.t("bbva-multistep-profile-recipients-modal-account-with-recipients")}
        </span>
      </div>
      </bbva-help-modal>
      `}_showListAccounts(){return k`<bbva-list-accounts-step 
      id="bbva-list-accounts-step-test"
      @expandible-step-continue="${this._onStepContinue}"
      .accountList="${this.accountList}">
   </bbva-list-accounts-step>`}_showSummaryListAccounts(){return this.accountSelected&&k`<bbva-list-card
      hide-top-padding
      currency-code="$"
      no-link=""
      amount="${this.accountSelected.amount}"
      card-title="${this.accountSelected.name}"
      content-text="${this.t("bbva-multistep-profile-recipients-available-amount-message")}"
      num-product="${this.accountSelected.numCard}">
  </bbva-list-card>`}_showAccountSelected(){return k`<bbva-account-selected-step
    id="account-step-step"
    .recipientsList=${this.recipientsList}
    @show-modal-delete=${this._showModalDelete}
    @expandible-step-continue-step-two=${this._onStep2Continue}>
    </bbva-account-selected-step>`}getInitials(t){const e=t.split(" ");return e[0][0]+e[1][0]}_showSummaryStepAccountSelected(t){return k`<div>
      ${this.recipientsList.map(((e,i)=>k`
      <bbva-list-contact 
        hide-padding-left
        hide-padding-right
        .descriptions='${[e.customDetails.relationType.id]}'
        action-icon-primary="" 
        action-icon-secondary="" 
        content-title="${e.customDetails.fullName}" 
        badge-text="${e.customDetails.participationPercentage}%" 
        initials="${this.getInitials(e.customDetails.fullName)}" 
        no-link="">
      </bbva-list-contact>
      ${t&&this.recipientsList.length-1!==i?k`<bbva-divider size="small"></bbva-divider>`:""}
    `))}
    </div>`}_createListAccountsStepHeaderTitle(t){return t?this.t("bbva-multistep-profile-recipients-list-accounts-header-summary"):this.t("bbva-multistep-profile-recipients-list-accounts-header")}_checkAccountList(){return this.changeSelectAccount?this._changeListAccounts():this._showListAccounts()}_changeAccount(){this.changeSelectAccount=!1,this.fireEvent("multistep-profile-recipients-hide-confirm-button",!0)}_keepAndContinueAccount(){this.firstStepCompleted=!0,this.changeSelectAccount=!1,this.fireEvent("multistep-profile-recipients-hide-confirm-button",!this.showFinishedButton())}_showTextInfoBeneficiariesAndNotificationHelp(){return this.isVisibleTextInfoBeneficiaries?k`
          <div class="text-info-beneficiaries">
            <bbva-text
              tag="span"
              size="S"
              text="${this.t("bbva-multistep-profile-recipients-account-assingns-beneficiaries")}"
            ></bbva-text>
          </div>

          <div>
            <bbva-notification-help
              variant="info"
              icon="${I()}"
              text="${this.t("bbva-multistep-profile-recipients-info-balance")}"
            ></bbva-notification-help>
          </div>`:null}_changeListAccounts(){return this.accountSelected&&k`
    <bbva-list-card
      currency-code="$"
      no-link=""
      amount="${this.accountSelected.amount}"
      card-title="${this.accountSelected.name}"
      content-text="${this.t("bbva-multistep-profile-recipients-available-amount-message")}"
      num-product="${this.accountSelected.numCard}">
    </bbva-list-card>
    <bbva-button-default 
      id="changeAccountButton"
      class="u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--0-5"
      text="${this.t("bbva-multistep-profile-recipients-change-account-title")}" 
      @click="${this._changeAccount}">
    </bbva-button-default>
    <bbva-button-default variant="link" 
    class="u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--0-5"
    text="${this.t("bbva-multistep-profile-recipients-keep-selection-title")}"
    @click="${this._keepAndContinueAccount}">
    </bbva-button-default>
    `}_renderAccountListStep(){return k`
    <bbva-expandable-step
      id="step-1"
      hide-padding-left
      hide-padding-right
      header= "${this._createListAccountsStepHeaderTitle(this.firstStepCompleted)}"
      disabled-target=".action"
      step= "1"
      total-steps="${this.totalSteps}"
      class="animation recipient-bbva-expandable-step-height"
      ?completed="${this.firstStepCompleted}"
      edit-label="${this.t("bbva-multistep-profile-recipients-step-edit-label")}"
      @expandable-step-edit-step="${this._onEditStep}"
      current-step-label="${this.t("bbva-multistep-profile-recipients-subheader-steps",{step:"1",total:this.totalSteps})}"
    >
      ${this._showTextInfoBeneficiariesAndNotificationHelp()}
      <div class="content" >
        ${this._checkAccountList()}
       
      </div>
      <div class="summary" slot="summary" ambient="dark">
        ${this._showSummaryListAccounts()}
      </div>
    </bbva-expandable-step>
    `}_keepContinueStepTwo(){this.secondStepCompleted=!0,this.changeRecipients=!1,this.fireEvent("multistep-profile-recipients-hide-confirm-button",!this.showFinishedButton())}changeAccountSelected(){this.changeRecipients=!1,this.fireEvent("multistep-profile-recipients-hide-confirm-button",!0)}changeStepAccountSeletecStep(){return k`
       ${this._showSummaryStepAccountSelected(!1)}
      <bbva-button-default 
        id="change-account-select"
        class="u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--0-5" 
        text="${this.t("bbva-multistep-profile-recipients-change-recipients-title")}"
        @click=${this.changeAccountSelected}
      >
      </bbva-button-default>
      <bbva-link 
        id="continue-step-two"
        class="u-display--table u-margin--center u-margin-top--1-5 u-margin-bottom--1" 
        text="${this.t("bbva-multistep-profile-recipients-keep-selection-title")}"
        @click=${this._keepContinueStepTwo}
      ></bbva-link>
      `}renderContentStepTwo(){return this.changeRecipients?this.changeStepAccountSeletecStep():this._showAccountSelected()}get classStepHeight(){return this.recipientsList.length>this.maxRecipientsLength?"animation padding-button-fixed recipient-bbva-expandable-step-height":this.recipientsList.length<this.maxRecipientsLength&&!this.isNativeIos?"recipient-bbva-expandable-step-height-2":""}_renderAccountSelectedStep(){return k`
      <bbva-expandable-step
        ?hide-padding-left=${this.secondStepCompleted||this.changeRecipients}
        hide-padding-top
        aria-disabled="${this.stepDisable}"
        id="step-2"
        header="${this.t("bbva-multistep-profile-recipients-sub-title")}"
        step="2"
        total-steps="${this.totalSteps}"
        class=${this.recipientsList.length>this.maxRecipientsLength?"animation padding-button-fixed recipient-bbva-expandable-step-height":"recipient-bbva-expandable-step-height-2"}
        disabled-target=".action"
        ?completed=${this.secondStepCompleted}
        edit-label="bbva-multistep-profile-recipients-step-edit-label"
        @expandable-step-edit-step="${this._onEditStep}"
        current-step-label="${this.t("bbva-multistep-profile-recipients-subheader-steps",{step:"2",total:this.totalSteps})}"
      >
        <div class="content" >
          ${this.renderContentStepTwo()}
        </div>
        <div class="summary" slot="summary" ambient="dark">
          ${!1===this.changeRecipients?this._showSummaryStepAccountSelected(!0):""}
       </div>
      </bbva-expandable-step>
    `}_renderErrorModalUserBlackList(){return k`
      <bbva-help-modal
        id="modal-error-black-list-recipient"
        fixed-footer
        hide-content-padding-top
        full-height
        accessibility-text-icon-right-primary="entendido"
        header-type="modal"
        button-text="${this.t("bbva-multistep-profile-recipients-exit-button-message")}"
        header-text="${this.t("bbva-multistep-profile-recipients-title")}"
        @help-modal-footer-button-click="${this._modalExitButton}">
        <div slot="slot-title">
          <div class="image-svg">
            <bbva-core-icon
              class="title-icon"
              src="./images/errors/error.svg"
              size="80"
            ></bbva-core-icon>
          </div>
          <span class="title-text-recipient-modal">
            ${this.t("bbva-multistep-profile-recipients-title-error-registry")}
          </span>
        </div>
        <div class="content" slot="slot-content">
          <p class="text-content-recipient-modal-error">
            ${this.t("bbva-multistep-profile-recipients-informative-error-registry")}
          </p>
        </div>
      </bbva-help-modal>
    `}openModalUserIsInBlackLists(){this.fireEvent("multistep-profile-recipients-hide-confirm-button",!0),this._modalError.open()}_modalExitButton(){this.fireEvent("multistep-profile-recipients-click-exit-modal-button")}handleAddRecipients(){this.recipientsList&&this.fireEvent("multistep-profile-recipients-handle-add",this.recipientsList)}addNewRecipient(t){let e=t;t.params&&(e=t.params),this.recipientsList=[...this.recipientsList,e]}getHasRecipients(t){this.hasRecipients=t.params}render(){return k`
    <bbva-expandable-multistep  has-animation>
      ${this._renderAccountListStep()}
      ${this._renderAccountSelectedStep()}
      ${this._renderInformativeModalRecipient()}
      ${this._modalDelete()}
      ${this._renderErrorModalUserBlackList()}
    </bbva-expandable-multistep>
    `}}customElements.define(Gt.is,Gt),customElements.define(Xt.is,Xt),customElements.define(Yt.is,Yt);
