import{z as t,a8 as a,ac as e,ad as r,ab as i,ar as o,a9 as n,aa as c,bf as s,bc as l,bd as d,al as b,a_ as g,a as p,aJ as v,aS as h,an as u,L as m,bh as y,S as $,bg as x,ae as k,b4 as f,h as S,ak as _,av as C,i as T,V as L,l as w,r as P,p as A,n as B,b8 as q,g as V,ag as z,f as E}from"./952f98a9.js";import{f as I,B as F,g as M,e as H}from"./b42a85fd.js";import{bb as D,bc as N,bd as j}from"./7f3d7ca9.js";const R=new o;var W=t`:host {
  display: block;
  position: relative;
  box-sizing: border-box;
  --_list-card-subcategory-line-color: var(--bbva-list-card-subcategory-line-dark-mode-color, var(--bbva-list-card-subcategory-line-color, var(--colorsSecondary500, ${a(n.secondary500)})));
  --_list-card-heading-color: var(--bbva-list-card-heading-dark-mode-color, var(--bbva-list-card-heading-color, var(--colorsPrimaryMedium, ${a(n.primaryMedium)})));
  --_list-card-heading-active-color: var(--bbva-list-card-heading-active-dark-mode-color, var(--bbva-list-card-heading-active-color, var(--colorsSecondary500, ${a(n.secondary500)})));
  --_list-card-heading-no-link-color: var(--bbva-list-card-heading-no-link-dark-mode-color, var(--bbva-list-card-heading-no-link-color, var(--colorsSecondary600, ${a(n.secondary600)})));
  --_list-card-num-product-color: var(--bbva-list-card-num-product-dark-mode-color, var(--bbva-list-card-num-product-color, var(--colorsSecondary600, ${a(n.secondary600)})));
  --_list-card-percentage-color: var(--bbva-list-card-percentage-dark-mode-color, var(--bbva-list-card-percentage, var(--colorsSecondary600, ${a(n.secondary600)})));
  --_list-card-percentage-negative-color: var(--bbva-list-card-percentage-negative-dark-mode-color, var(--bbva-list-card-percentage-negative, var(--colorsTertiaryType1Dark, ${a(n.tertiaryType1Dark)})));
  --_list-card-percentage-positive-color: var(--bbva-list-card-percentage-positive-dark-mode-color, var(--bbva-list-card-percentage-positive, var(--colorsTertiaryType6Dark, ${a(n.tertiaryType6Dark)})));
  --_list-card-percentage-description-color: var(--bbva-list-card-description-dark-mode-color, var(--bbva-list-card-description-color, var(--colorsSecondary500, ${a(n.secondary500)})));
  --_list-card-credit-balance-color: var(--bbva-list-card-credit-balance-dark-mode-color, var(--bbva-list-card-credit-balance-color, var(--colorsSecondary600, ${a(n.secondary600)})));
  --_list-card-status-color: var(--bbva-list-card-status-dark-mode-color, var(--bbva-list-card-status-color, var(--colorsSecondary600, ${a(n.secondary600)})));
  --_list-card-description-color: var(--bbva-list-card-description-dark-mode-color, var(--bbva-list-card-description-color, var(--colorsSecondary500, ${a(n.secondary500)})));
  --_list-card-bg-active-color: var(--bbva-list-card-bg-active-dark-mode-color, var(--bbva-list-card-bg-active-color, var(--colorsSecondary100, ${a(n.secondary100)})));
  --_list-card-no-link-active-color: var(--bbva-list-card-no-link-active-dark-mode-color, var(--bbva-list-card-no-link-active-color, var(--colorsPrimaryCore, ${a(n.primaryCore)})));
  --_list-card-long-amount-margin-bottom: var(--bbva-list-card-long-amount-margin-bottom, 0);
  --skeleton-quote-color: var(--bbva-list-card-skeleton-quote-dark-mode-color, var(--bbva-list-card-skeleton-quote-color, var(--colorsSecondary200, ${a(n.secondary200)})));
  --skeleton-quote-bg: var(--bbva-list-card-skeleton-quote-bg, transparent);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
  margin: 0;
  padding: 0;
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

.container {
  display: flex;
  align-items: baseline;
  justify-content: space-between;
  position: relative;
  outline: none;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 15) * 1em);
  font-size: var(--typographyTypeSmall, ${a(e.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(r.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${a(i.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${a(i.book.fontWeight)});
}

:host([hide-top-padding]) .container {
  padding-top: 0;
}

:host([hide-bottom-padding]) .container {
  padding-bottom: 0;
}

.subcategory {
  position: absolute;
  width: 1rem;
  min-width: 1rem;
  height: 1rem;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

:host([subcategory]) .content-button, :host([indentation]) .content-button, .subcard .content-button {
  padding-left: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 15) * 1em);
}

.subcategory-line {
  position: absolute;
  width: 100%;
  height: 100%;
  border-left: 1px solid var(--_list-card-subcategory-line-color);
  border-bottom: 1px solid var(--_list-card-subcategory-line-color);
}

.content-button {
  flex-grow: 1;
  max-width: 100%;
}

.subcard .content-button {
  justify-content: flex-start;
  display: flex;
}

.header {
  display: flex;
  justify-content: space-between;
  align-items: baseline;
}

.heading {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(i.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(i.medium.fontWeight)});
  font-size: var(--typographyTypeMedium, ${a(e.typeMedium)});
  line-height: var(--lineHeightTypeMedium, ${a(r.typeMedium)});
  color: var(--_list-card-heading-color);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1em);
}

:host([variant=card]) {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1em);
  -webkit-box-shadow: var(--boxShadowType2, ${a(s.type2)});
  -moz-box-shadow: var(--boxShadowType2, ${a(s.type2)});
  box-shadow: var(--boxShadowType2, ${a(s.type2)});
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.container:not(.card) .content {
  display: flex;
  justify-content: space-between;
}
.container.card .content {
  display: flex;
}
.container.card .content:not(.compact) {
  justify-content: space-between;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}
.container.card .content:not(.compact) .card-image {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}
.container.card .content.compact {
  justify-content: left;
}

.column {
  display: flex;
  flex-direction: column;
  overflow: hidden;
}
.column.vertical-aligned {
  flex-direction: initial;
}

.row {
  display: flex;
  flex-direction: row;
  align-items: center;
  overflow: hidden;
}

.row > .heading,
.row > [data-tag-name=bbva-badge-default] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-clip-entities] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

.num-product {
  display: flex;
  height: 1.5rem;
  align-items: center;
  color: var(--_list-card-num-product-color);
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${a(i.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${a(i.bookItalic.fontWeight)});
}

.percentage {
  display: flex;
  align-items: center;
  justify-content: flex-end;
  font-size: var(--typographyTypeXSmall, ${a(e.typeXSmall)});
  line-height: var(--lineHeightTypeXSmall, ${a(r.typeXSmall)});
  color: var(--_list-card-percentage-color);
}

.negative,
.positive {
  font-size: var(--typographyTypeSmall, ${a(e.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(r.typeSmall)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${a(i.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${a(i.bookItalic.fontWeight)});
}

.negative {
  color: var(--_list-card-percentage-negative-color);
}

.positive {
  color: var(--_list-card-percentage-positive-color);
}

.description {
  color: var(--_list-card-percentage-description-color);
}

.credit-balance {
  font-size: var(--typographyTypeXSmall, ${a(e.typeXSmall)});
  line-height: var(--lineHeightTypeXSmall, ${a(r.typeXSmall)});
  color: var(--_list-card-credit-balance-color);
}

.margin-bottom {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

.status {
  color: var(--_list-card-status-color);
}

.text-extended {
  color: var(--_list-card-description-color);
}

.text-amount {
  text-align: right;
}

.card-container {
  overflow: initial;
}

.wrapper {
  display: flex;
  align-items: center;
}

.mask {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-button-alert] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

.no-link .heading, :host([no-link]) .heading {
  color: var(--_list-card-heading-no-link-color);
}

:host([expired]) .heading {
  color: var(--_list-card-heading-active-color);
}
:host([expired]) .num-product {
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${a(i.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${a(i.bookItalic.fontWeight)});
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
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px, calc((45% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (8px/ 2)) 8px, calc((20% * 2) + (8px/ 2)) 8px, 100% 1px, calc((45% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (8px/ 2)) 8px, calc((20% * 2) + (8px/ 2)) 8px;
  background-position: 0 0px, 100% 0px, 0 40px, 100% 40px, 0 64px, 100% 64px, 0 88px, 0 105px, 100% 105px, 0 129px, 100% 129px;
}

:host([show-card]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((40% * 2) + (16px/ 2)) 16px, 60px 40px, calc((15% * 2) + (16px/ 2)) 16px, calc((35% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px;
  background-position: 0 0px, 0 32px, 0 80px, 100% 32px, 100% 56px;
}

:host([loading]) {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
  pointer-events: none;
}
:host([loading]) .container > * {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

:host([show-card][loading]) .container {
  min-height: 5.9375rem;
}

:host(:not([show-card])[loading]) .container {
  min-height: 9.0625rem;
}

:host(:not([no-link]):not([button-active]):not([expired])) .container:not(.no-link):active {
  background: var(--_list-card-bg-active-color);
}
:host(:not([no-link]):not([button-active]):not([expired])) .container:not(.no-link):active .heading {
  color: var(--_list-card-no-link-active-color);
}

:host([amount-variant=long]) .text-amount {
  text-align: left;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}
:host([amount-variant=long]) .percentage {
  justify-content: flex-start;
}
:host([amount-variant=long]) .card-flex {
  display: flex;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
  align-items: center;
}
:host([amount-variant=long]) .card-flex .num-product {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}
:host([amount-variant=long]) [data-tag-name=bbva-amount] {
  margin-bottom: var(--_list-card-long-amount-margin-bottom);
}

:host(:not([num-product])[amount-variant=long]) .card-flex {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
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
${R.mediaRules()}`;var X=t`[ambient^=light] {
  --bbva-list-card-subcategory-line-color: initial;
  --bbva-list-card-heading-color: initial;
  --bbva-list-card-num-product-color: initial;
  --bbva-list-card-percentage: initial;
  --bbva-list-card-percentage-negative: initial;
  --bbva-list-card-percentage-positive: initial;
  --bbva-list-card-description-color: initial;
  --bbva-list-card-credit-balance-color: initial;
  --bbva-list-card-status-color: initial;
  --bbva-list-card-description-color: initial;
  --bbva-list-card-heading-active-color: initial;
  --bbva-list-card-bg-active-color: initial;
  --bbva-list-card-no-link-active-color: initial;
  --skeleton-quote-bg: initial;
  --bbva-list-card-skeleton-quote-color: initial;
}
${(new o).mediaRules()}`;const J=new o;var O=t`[ambient^=dark] {
  --bbva-list-card-subcategory-line-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-card-heading-color: var(--colorsPrimarySubdued, ${a(n.primarySubdued)});
  --bbva-list-card-heading-active-color: var(--colorsPrimarySubduedLight, ${a(n.primarySubduedLight)});
  --bbva-list-card-heading-no-link-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-card-num-product-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-card-percentage: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-card-percentage-negative: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-card-percentage-positive: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-card-description-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-card-credit-balance-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-card-status-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-card-description-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-card-bg-active-color: var(--colorsPrimaryCoreDark, ${a(n.primaryCoreDark)});
  --bbva-list-card-no-link-active-color: var(--colorsPrimarySubduedLight, ${a(n.primarySubduedLight)});
  --bbva-list-card-skeleton-quote-color: var(--colorsPrimaryMedium, ${a(n.primaryMedium)});
}
${J.mediaRules()}`;const U={light:t`
    ${X}
    ${I.light}
    ${l.light}
    ${d.light}
    ${D.light}
    ${b.light}
    ${g.light}
  `,dark:t`
    ${O}
    ${I.dark}
    ${l.dark}
    ${d.dark}
    ${D.dark}
    ${b.dark}
    ${g.dark}
  `},G=(t,a)=>a?t:void 0;class K extends(p(v(h(u(m))))){static get is(){return"bbva-list-card"}static get scopedElements(){return{"bbva-amount":F,"bbva-badge-default":y,"bbva-badge-variability":$,"bbva-button-alert":N,"bbva-clip-card":x,"bbva-clip-entities":k,"bbva-divider":f}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},secondaryAmount:{type:Number,attribute:"secondary-amount"},tertiaryAmount:{type:Number,attribute:"tertiary-amount"},buttonActive:{type:Boolean,attribute:"button-active",reflect:!0},buttonText:{type:String,attribute:"button-text"},badgeText:{type:String,attribute:"badge-text"},badgeType:{type:String,attribute:"badge-type"},cardImage:{type:String,attribute:"card-image"},cardStatus:{type:String,attribute:"card-status"},cardType:{type:String,attribute:"card-type"},cardVariant:{type:String,attribute:"card-variant"},cardTitle:{type:String,attribute:"card-title"},contentText:{type:String,attribute:"content-text"},contentTextExtra:{type:String,attribute:"content-text-extra"},creditBalance:{type:String,attribute:"credit-balance"},secondaryCurrencyCode:{type:String,attribute:"secondary-currency-code"},tertiaryCurrencyCode:{type:String,attribute:"tertiary-currency-code"},description:{type:String},entity:{type:String},entityAccessibilityText:{type:String,attribute:"entity-accessibility-text"},expired:{type:Boolean,reflect:!0},loading:{type:Boolean,reflect:!0},secondaryLanguage:{type:String,attribute:"secondary-language"},tertiaryLanguage:{type:String,attribute:"tertiary-language"},secondaryLocalCurrency:{type:String,attribute:"secondary-local-currency"},tertiaryLocalCurrency:{type:String,attribute:"tertiary-local-currency"},numProduct:{type:String,attribute:"num-product"},subcategory:{type:Boolean},subCards:{type:Array},footerTextAmount:{type:String,attribute:"footer-text-amount"},showCard:{type:Boolean,attribute:"show-card",reflect:!0},showEllipsis:{type:Boolean,attribute:"show-ellipsis",reflect:!0},textExtended:{type:String,attribute:"text-extended"},noLink:{type:Boolean,attribute:"no-link"},isNegative:{type:Boolean,attribute:"is-negative"},percentage:{type:Number},percentSymbol:{type:String},variant:{type:String},amountVariant:{type:String,reflect:!0,attribute:"amount-variant"},visibleChars:{type:Number,attribute:"visible-chars"},payCompatibility:{type:String,attribute:"pay-compatibility"},compactMode:{type:Boolean,attribute:"compact-mode"},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},secondaryDecimalsHidden:{type:Boolean,attribute:"secondary-decimals-hidden"},tertiaryDecimalsHidden:{type:Boolean,attribute:"tertiary-decimals-hidden"}}}constructor(){super(),this.secondaryCurrencyCode=this.currencyCode,this.tertiaryCurrencyCode=this.currencyCode,this.isNegative=!1,this.noLink=!1,this.loading=!1,this.secondaryLocalCurrency=this.localCurrency,this.secondaryLanguage=this.language,this.tertiaryLocalCurrency=this.localCurrency,this.tertiaryLanguage=this.language,this.subcategory=!1,this.subCards=[],this.showCard=!1,this.showEllipsis=!1,this.percentSymbol="%",this.variant="",this.visibleChars=5,this.expired=!1,this.amountVariant="default",this.cardVariant="default",this.payCompatibility="",this.compactMode=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.decimalsHidden=!1,this.secondaryDecimalsHidden=!1,this.tertiaryDecimalsHidden=!1}static _hasCard(t){return t.showCard||t.cardImage||t.cardType}get _hasAmount(){return void 0!==this.amount&&null!==this.amount}get _hasLink(){return!(this.noLink||this.expired)}get _statusPercentage(){return this.percentage<0?"decrease":"increase"}get _isLongAmount(){return"long"===this.amountVariant}_getAmount(t){return this._hasAmount?S`
          <bbva-amount
            ?decimals-hidden="${this.decimalsHidden}"
            data-tag-name="bbva-amount"
            id="${t}"
            variant="xl"
            .amount="${this.amount}"
            .localCurrency="${this.localCurrency}"
            .currencyCode="${this.currencyCode}"
            .language="${this.language}"
            tabindex="0"
          >
          </bbva-amount>
        `:S`
          <span class="status">${this.t("bbva-list-card-not-available","_Not Available")}</span>
        `}static get styles(){return[super.styles,_("bbva-global-dividers-shared-styles"),W,_("bbva-list-card-shared-styles"),U.dark,U.light]}static _title(t){return S`
      <p
        class="heading${C({ellipsis:!!t.showEllipsis,"margin-bottom":t._isLongAmount&&t.numProduct&&!K._hasCard(t)})}"
        tabindex="0"
      >
        ${t.cardTitle}
      </p>
    `}get _header(){const t=this._isLongAmount?"":S`${this._getAmount("amountHeader")}`;return S`
      <div class="header">
        ${K._title(this)} ${K._hasCard(this)?"":t}
      </div>
    `}get _content(){return S`
      <div class="content">
        <div class="column" tabindex="0">
          ${this._isLongAmount?this._contentLeftLongAmount:this._contentLeft}
        </div>
        ${this._isLongAmount?"":S`
              <div
                class="column text-amount${C({negative:this.isNegative})}"
                tabindex="0"
              >
                ${this._contentRight}
              </div>
            `}
      </div>
    `}get _numProduct(){return S`
      <span
        class="num-product${C({"margin-bottom":this.badgeText&&this.textExtended})}"
        ?hidden=${!this.numProduct}
      >
        ${this.entity?S`
              <bbva-clip-entities
                data-tag-name="bbva-clip-entities"
                size="small"
                .entity="${this.entity}"
                >${this.t(this.entityAccessibilityText)}</bbva-clip-entities
              >
            `:""}
        ${this._getMaskElement(this.numProduct,"•",!0,this.visibleChars)}
      </span>
    `}static _contentCardImage(t){return S`<bbva-clip-card
      data-tag-name="bbva-clip-card"
      size="medium"
      class="${C({"card-image":!t._isLongAmount})}"
      .cardImage="${t.cardImage}"
      .cardType="${t.cardType}"
      .variant="${t.cardVariant||"default"}"
      .status="${t.cardStatus}"
      .payCompatibility=${t.payCompatibility}
      ?hidden="${!K._hasCard(t)}"
    ></bbva-clip-card>`}get _contentLeft(){return S`
      ${K._contentCardImage(this)}
      <div>
        ${this._numProduct}
        <bbva-badge-default
          .text="${this.badgeText}"
          type="${T(this.badgeType)}"
          ?hidden="${!this.badgeText}"
        ></bbva-badge-default>
        <p class="description" ?hidden="${!this.description}">${this.description}</p>
      </div>
    `}get _contentCompact(){return S`
      <div class="content compact">
        <div class="column" tabindex="0">${K._contentCardImage(this)}</div>
        <div class="column ${C({"vertical-aligned":!this.badgeText})}">
          <div class="row">
            ${K._title(this)}
            ${this._getMaskElement(this.numProduct,"•",!0,this.visibleChars)}
          </div>
          <div class="row" ?hidden=${!this.badgeText}>
            <bbva-badge-default
              .text="${this.badgeText}"
              type="${T(this.badgeType)}"
              ?hidden="${!this.badgeText}"
            ></bbva-badge-default>
          </div>
        </div>
      </div>
    `}get _contentLeftLongAmount(){return S`<div class="card-flex">
        ${K._contentCardImage(this)} ${this._numProduct}
      </div>
      <div>
        <div class="column text-amount${C({negative:this.isNegative})}">
          ${this._contentRight}
        </div>
        <p
          class="description${C({"margin-bottom":this.badgeText})}"
          ?hidden="${!this.description}"
        >
          ${this.description}
        </p>
        <bbva-badge-default
          data-tag-name="bbva-badge-default"
          .text="${this.badgeText}"
          type="${T(this.badgeType)}"
          ?hidden="${!this.badgeText}"
        ></bbva-badge-default>
      </div> `}get _contentAmount(){return this._isLongAmount?S`${this._getAmount("amount")}`:S`${K._hasCard(this)?this._getAmount("amount"):""}`}get _contentPercentage(){return S`<p
      class="percentage ${C({negative:!K._hasCard(this)&&this.percentage<0,positive:!K._hasCard(this)&&this.percentage>0,"margin-bottom":this.percentage&&!this.description})}"
      ?hidden=${!this.percentage}
    >
      <bbva-badge-variability
        data-tag-name="bbva-badge-variability"
        .status="${this._statusPercentage}"
        ?hidden="${!this._statusPercentage||K._hasCard(this)}"
      ></bbva-badge-variability>
      <span>${this.percentage}${this.percentSymbol}</span>
    </p>`}get _contentTextTemplate(){const t=this._isLongAmount?!this._isLongAmount:this.contentTextExtra;return S`<p
      class="description ${C({"margin-bottom":t||this.footerTextAmount})}"
      ?hidden="${!this.contentText}"
    >
      ${this.contentText}
    </p>`}get _contentRight(){return S`
      ${this._contentAmount}
      ${this.percentage?this._contentPercentage:this._contentTextTemplate}
      ${this.creditBalance?S`<p class="credit-balance" ?hidden="${!this.creditBalance}">
              ${this.creditBalance}
            </p>`:S`<bbva-amount
              ?decimals-hidden="${this.secondaryDecimalsHidden}"
              data-tag-name="bbva-amount"
              variant="x"
              .amount="${this.secondaryAmount}"
              ?hidden="${!this.secondaryAmount&&0!==this.secondaryAmount}"
              .localCurrency="${this.secondaryLocalCurrency}"
              .currencyCode="${this.secondaryCurrencyCode}"
              .language="${this.secondaryLanguage}"
            ></bbva-amount>`}
      </bbva-amount>
      <p
        class="description ${C({"margin-bottom":this.percentage||this.footerTextAmount})}"
        ?hidden="${!this.contentTextExtra}"
      >
        ${this.contentTextExtra}
      </p>
      <bbva-amount
        ?decimals-hidden="${this.tertiaryDecimalsHidden}"
        data-tag-name="bbva-amount"
        variant="x"
        .amount="${this.tertiaryAmount}"
        ?hidden="${!this.tertiaryAmount&&0!==this.tertiaryAmount}"
        .localCurrency="${this.tertiaryLocalCurrency}"
        .currencyCode="${this.tertiaryCurrencyCode}"
        .language="${this.tertiaryLanguage}"
      >
      </bbva-amount>
      <p class="description">${this.footerTextAmount}</p>
    `}get _footer(){return S`
      <slot name="footer">
        <p class="text-extended" ?hidden="${!this.textExtended}">${this.textExtended}</p>
        ${this.buttonText?S`
              <bbva-button-alert
                data-tag-name="bbva-button-alert"
                text="${this.buttonText}"
                .active="${this.buttonActive}"
                ?hidden="${!this.buttonText}"
                @focusin="${()=>{this.buttonActive=!0}}"
                @focusout="${()=>{this.buttonActive=!1}}"
                @click="${this._innerButtonClick}"
              ></bbva-button-alert>
            `:""}
      </slot>
    `}_contentInline(t){return S`
      <div class="subcategory" ?hidden="${!t.subcategory}">
        <div class="subcategory-line"></div>
      </div>
      <div class="content-button">
        <div class="column card-container">${K._contentCardImage(t)}</div>
        <div class="column">
          <div class="row">
            ${K._title(t)}
            ${this._getMaskElement(t.numProduct,"•",!0,this.visibleChars)}
          </div>
          <div class="row">
            <bbva-badge-default
              data-tag-name="bbva-badge-default"
              .text="${t.badgeText}"
              type="${T(t.badgeType)}"
              ?hidden="${!t.badgeText}"
            ></bbva-badge-default>
          </div>
        </div>
      </div>
    `}get _subCards(){return this.subCards.map(((t,a)=>S`
          <bbva-divider data-tag-name="bbva-divider" size="fit"></bbva-divider>
          <div
            class="subcard container${C({"no-link":t.noLink})}"
            role="${T(G("button",!t.noLink))}"
            aria-label="${T(G(t.accessibilityText,!t.noLink))}"
            @click="${()=>this._buttonSubcardClick(t,a)}"
          >
            ${this._contentInline(t)}
          </div>
        `))}_getMaskElement(t,a,e,r){if(t){const i=L(t,a,e,r);return S`
        <div class="wrapper num-product">
          <span class="mask">${i[0]}</span>
          <span class="number">
            <span class="sr-only">${this.t("bbva-list-card-number-accessibility")}</span>
            ${i.substr(1)}
          </span>
        </div>
      `}return S``}_buttonClick(t){t&&"BBVA-BUTTON-ALERT"===t.target.tagName?this._innerButtonClick():this._hasLink&&this.dispatchEvent(new CustomEvent("list-card-item-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonSubcardClick(t,a){t.noLink||this.dispatchEvent(new CustomEvent("list-card-item-subcard-click",{detail:a,bubbles:!0,composed:!0}))}_innerButtonClick(){this.dispatchEvent(new CustomEvent("list-card-alert-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return S`
      <div
        class="container ${C({card:K._hasCard(this)})}"
        role="${T(G("link",this._hasLink))}"
        tabindex="${T(G("0",this._hasLink))}"
        aria-label="${T(G(this.accessibilityText,this._hasLink))}"
        @click="${this._buttonClick}"
      >
        <div class="subcategory" ?hidden="${!this.subcategory}">
          <div class="subcategory-line"></div>
        </div>
        <div class="content-button" role="group">
          ${this.compactMode?S` ${this._contentCompact} ${this._footer} `:S` ${this._header} ${this._content} ${this._footer} `}
        </div>
        <div class="skeleton"></div>
      </div>
      <div class="column">${this._subCards}</div>
    `}}V("colors.secondary500"),V("colors.primarySubdued"),V("colors.primaryMediumLight"),V("colors.primaryCoreLightened"),V("colors.primaryCoreLightened"),V("colors.cool20"),V("colors.tertiaryType1Light"),V("colors.tertiaryType6"),V("colors.cool20"),V("colors.primaryCoreLightened"),V("colors.cool20"),V("colors.cool20"),V("colors.cool60"),V("colors.primaryMediumLight"),V("colors.cool50");const Q=new o;var Y=t`:host {
  display: flex;
  box-sizing: border-box;
  position: relative;
  min-height: var(--bbva-list-info-min-height, 5.25rem);
  padding: var(--bbva-list-info-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem));
  color: var(--bbva-list-info-dark-mode-color, var(--bbva-list-info-color, var(--colorsSecondary600, ${a(n.secondary600)})));
  --_list-info-icon-color: var(--bbva-list-info-icon-dark-mode-color, var(--bbva-list-info-icon-color, var(--colorsSecondary600, ${a(n.secondary600)})));
  --_list-info-skeleton-quote-color: var(--bbva-list-info-skeleton-quote-dark-mode-color, var(--bbva-list-info-skeleton-quote-color, var(--colorsSecondary200, ${a(n.secondary200)})));
  --_list-info-skeleton-quote-bg: var(--bbva-list-info-skeleton-quote-bg-dark-mode-color, var(--bbva-list-info-skeleton-quote-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-core-icon] {
  flex: none;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
  color: var(--_list-info-icon-color);
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
  background-image: linear-gradient(var(--_list-info-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_list-info-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_list-info-skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_list-info-skeleton-quote-bg);
  background-size: 24px 24px, 75% 16px, 55% 16px;
  background-position: 16px 16px, 50px 20px, 50px 46px;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

::slotted(*) {
  margin: 0;
  font-size: var(--typographyTypeSmall, ${a(e.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(r.typeSmall)});
}
${Q.mediaRules()}`;var Z=t`[ambient^=light] {
  --bbva-list-info-color: initial;
  --bbva-list-info-icon-color: initial;
  --bbva-list-info-skeleton-quote-color: initial;
}
${(new o).mediaRules()}`;const tt=new o;const at={dark:t`
    ${t`[ambient^=dark] {
  --bbva-list-info-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-info-icon-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-list-info-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${a(n.primaryCoreDark)});
}
${tt.mediaRules()}`}
  `,light:t`
    ${Z}
  `};class et extends(p(u(m))){static get is(){return"bbva-list-info"}static get scopedElements(){return{"bbva-core-icon":H,"bbva-text":z}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},loading:{type:Boolean,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},message:{type:String}}}constructor(){super(),this.icon="",this.iconSize=24,this.loading=!1,this.hidePaddingTop=!1,this.hidePaddingBottom=!1}static get styles(){return[_("bbva-global-dividers-shared-styles"),Y,_("bbva-list-info-shared-styles"),at.light,at.dark]}render(){return S`
      <bbva-core-icon
        aria-hidden="true"
        .icon="${this.icon}"
        .size="${this.iconSize}"
      ></bbva-core-icon>

      <div class="content-text">
        ${this.message?S`<bbva-text unset .text="${this.message}" size="S"></bbva-text>`:S`<slot></slot>`}
      </div>

      <div class="skeleton"></div>
    `}}V("colors.primaryCoreLightened"),V("colors.secondary300"),V("colors.cool50");export{K as B,et as a};
