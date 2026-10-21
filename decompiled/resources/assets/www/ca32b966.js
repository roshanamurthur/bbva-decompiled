import{z as i,a8 as t,ac as e,ad as a,ab as r,bf as n,a9 as o,aa as s,au as l,bd as c,a as d,aS as p,L as m,aw as u,S as b,ak as h,h as y,av as g,aV as v}from"./952f98a9.js";var f=i`:host {
  --_list-definition-amount-skeleton-color: var(--bbva-list-definition-amount-sekeleton-dark-mode-color, var(--bbva-list-definition-amount-skeleton-color, var(--colorsSecondary200, ${t(o.secondary200)})));
  --_list-definition-amount-skeleton-quote-bg: var(--bbva-list-definition-amount-skeleton-bg-dark-mode-color, var(--bbva-list-definition-amount-skeleton-bg, transparent));
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  align-items: center;
  --_list-definition-amount-title-color: var(--bbva-list-definition-amount-title-dark-mode-color, var(--bbva-list-definition-amount-title-color, var(--colorsSecondary500, ${t(o.secondary500)})));
  --_list-definition-amount-description-color: var(--bbva-list-definition-amount-description-dark-mode-color, var(--bbva-list-definition-amount-description-color, var(--colorsSecondary500, ${t(o.secondary500)})));
  --_list-definition-amount-secondary-amount-color: var(--bbva-list-definition-amount-secondary-amount-dark-mode-color, var(--bbva-list-definition-amount-secondary-amount-color, var(--colorsSecondary500, ${t(o.secondary500)})));
  --_list-definition-amount-card-bg-color: var(--bbva-list-definition-amount-card-bg-dark-mode-color, var(--bbva-list-definition-amount-card-bg, var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)})));
  --_list-definition-amount-list-border: var(--bbva-list-definition-amount-list-border-dark-mode-color, var(--bbva-list-definition-amount-list-border, var(--colorsSecondary100, ${t(o.secondary100)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

:host([description-italic]) [class=description] {
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${t(r.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${t(r.bookItalic.fontWeight)});
}

*,
*:before,
*:after {
  box-sizing: inherit;
  margin: 0;
  padding: 0;
}

.list {
  display: flex;
  flex-direction: column;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 15) * 1em);
  font-size: var(--typographyTypeSmall, ${t(e.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${t(a.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(r.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${t(r.book.fontStyle)});
}
.list .title {
  color: var(--_list-definition-amount-title-color);
}
.list .description-wrapper {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
  color: var(--_list-definition-amount-description-color);
  display: inline;
}
.list .description-wrapper [data-tag-name=bbva-badge-variability] {
  display: inline;
}
.list .description-wrapper--ellipsis {
  display: inline-flex;
  justify-content: center;
  width: 100%;
  flex-wrap: wrap;
  flex-wrap: initial;
}
.list .description-wrapper--ellipsis .description {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
  margin: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem) 0 0;
}
.list .description-wrapper--ellipsis .description--switch-position {
  margin: 0 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}
.list .description-wrapper .description--switch-position {
  margin: 0 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}
.list .description-wrapper [data-tag-name=bbva-amount] {
  --bbva-amount-color: var(--_list-definition-amount-secondary-amount-color);
}
.list.no-title {
  flex-direction: column-reverse;
}

.amount {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 15) * 1em);
}

.secondary-amount {
  padding-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 15) * 1em);
}

:host([center]) .list {
  width: 100%;
  align-items: center;
}
:host([center]) .title, :host([center]) .description-wrapper {
  text-align: center;
}

:host([two-column]) {
  flex-direction: unset;
  align-items: center;
  min-width: 50%;
}
:host([two-column]) .list {
  width: 100vw;
}
:host([two-column]) .list:nth-child(2) {
  border-left: 3px solid var(--_list-definition-amount-list-border);
}

:host([variant=card]) {
  background-color: var(--_list-definition-amount-card-bg-color);
  box-shadow: var(--boxShadowType1, ${t(n.type1)});
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  height: var(--bbva-list-definition-amount-skeleton-height, 4.75rem);
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-definition-amount-skeleton-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-definition-amount-skeleton-color) 50%);
  background-color: var(--_list-definition-amount-skeleton-bg);
  background-size: calc((20% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 65% 44px, 160% 16px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
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
`,$=i`[ambient^=light] {
  --bbva-list-definition-amount-title-color: initial;
  --bbva-list-definition-amount-description-color: initial;
  --bbva-list-definition-amount-card-bg: initial;
  --bbva-list-definition-amount-secondary-amount-color: initial;
  --bbva-list-definition-amount-skeleton-color: initial;
  --bbva-list-definition-amount-skeleton-bg: initial;
}
`,w=i`[ambient^=dark] {
  --bbva-list-definition-amount-title-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-definition-amount-description-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-definition-amount-card-bg: var(--colorsPrimaryCore, ${t(o.primaryCore)});
  --bbva-list-definition-amount-secondary-amount-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-definition-amount-skeleton-color: var(--colorsPrimaryMedium, ${t(o.primaryMedium)});
  --bbva-list-definition-amount-skeleton-bg: initial;
}
`;const S={dark:i`
    ${l.dark}
    ${c.dark}
    ${w}
  `,light:i`
    ${l.light}
    ${c.light}
    ${$}
  `};class k extends(d(p(m))){static get is(){return"bbva-list-definition-amount"}static get scopedElements(){return{"bbva-amount":u,"bbva-badge-variability":b}}static get properties(){return{title:{type:String},contentTitle:{type:String,attribute:"content-title"},variantAmount:{type:String,attribute:"variant-amount"},description:{type:String},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},decimalDigits:{type:Number,attribute:"decimal-digits"},descriptionItalic:{type:Boolean,attribute:"description-italic"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},unit:{type:String,attribute:"unit"},symbol:{type:String,attribute:"symbol"},secondaryAmount:{type:Number,attribute:"secondary-amount"},secondaryDecimalDigits:{type:Number,attribute:"secondary-decimal-digits"},secondarySymbol:{type:String,attribute:"secondary-symbol"},secondaryDecimalsHidden:{type:Boolean,attribute:"secondary-decimals-hidden"},secondaryCurrencyCode:{type:String,attribute:"secondary-currency-code"},secondaryLanguage:{type:String,attribute:"secondary-language"},secondaryLocalCurrency:{type:String,attribute:"secondary-local-currency"},status:{type:String},loading:{type:Boolean,reflect:!0},twoColumn:{type:Boolean,attribute:"two-column",reflect:!0},items:{type:Array},switchPositionDescription:{type:Boolean,attribute:"switch-position-description"}}}constructor(){super(),this.variantAmount="xl",this.decimalDigits=2,this.decimalsHidden=!1,this.descriptionItalic=!1,this.symbol="",this.secondarySymbol="",this.secondaryDecimalsHidden=!1,this.secondaryCurrencyCode=this.currencyCode,this.secondaryLocalCurrency=this.localCurrency,this.secondaryLanguage=this.language,this.secondaryDecimalDigits=this.decimalDigits,this.status="",this.loading=!1,this.twoColumn=!1,this.items=[],this.descriptionEllipsis=!1,this.switchPositionDescription=!1}update(i){super.update(i),i.has("unit")&&(this.symbol=this.unit),i.has("title")&&this._titleContent()}_titleContent(){this.title&&(this.contentTitle=this.title,this.title="",this.removeAttribute("title"))}static get styles(){return[f,S.light,S.dark,h("bbva-list-definition-amount-shared-styles")]}static _showDescription(i,t){return t?y`<span
          class="description ${g({"description--switch-position":t})}"
          >${i}</span
        >`:v}_setAmount(i={}){return y`
      <bbva-amount
        ?decimals-hidden="${i.decimalsHidden||this.decimalsHidden}"
        variant="${i.variantAmount||this.variantAmount}"
        amount="${i.amount||this.amount}"
        currency-code="${i.currencyCode||this.currencyCode}"
        local-currency="${i.localCurrency||this.localCurrency}"
        language="${i.language||this.language}"
        decimal-digits="${i.decimalDigits||this.decimalDigits}"
        .symbol="${i.symbol||this.symbol}"
      >
      </bbva-amount>
    `}get _renderSecondaryAmount(){return this.secondaryAmount?y` <bbva-amount
          class="${g({"secondary-amount":""===this.status})}"
          variant="m"
          ?decimals-hidden="${this.secondaryDecimalsHidden}"
          .amount="${this.secondaryAmount}"
          .localCurrency="${this.secondaryLocalCurrency}"
          .currencyCode="${this.secondaryCurrencyCode}"
          .language="${this.secondaryLanguage}"
          .decimalDigits="${this.secondaryDecimalDigits}"
          .symbol="${this.secondarySymbol}"
        >
        </bbva-amount>`:y``}get _renderBadgeVariability(){return this.status?y` <bbva-badge-variability .status=${this.status}></bbva-badge-variability> `:y``}_hasDescription(i={}){const t=i.description||this.description,e=i.status||this.status,a=i.secondaryCurrency||this.secondaryCurrency;return t||e||a}_renderTitleDescription(i={}){const t=i.title||this.contentTitle,e=i.description||this.description;return t?y` ${t} `:this._hasDescription(i)?y`
        ${k._showDescription(e,!this.switchPositionDescription)}
        ${this._renderBadgeVariability} ${this._renderSecondaryAmount}
        ${k._showDescription(e,this.switchPositionDescription)}
      `:v}_renderTpl(i={}){const t=i.title||this.contentTitle,e=i.description||this.description;return y`
      ${this.contentTitle||this._hasDescription(i)?y`
            <dl
              class="list ${!this.contentTitle&&this._hasDescription(i)?"no-title":""}"
              id="list"
            >
              <dt
                class="${g({title:t,"description-wrapper":this._hasDescription(i),"description-wrapper--ellipsis":this.descriptionEllipsis})}"
              >
                ${this._renderTitleDescription(i)}
              </dt>
              <dd class="value">${this._setAmount(i)}</dd>
              <dd
                class="description-wrapper ${g({"description-wrapper--ellipsis":this.descriptionEllipsis})}"
                ?hidden="${!this._hasDescription(i)||!t}"
              >
                ${k._showDescription(e,!this.switchPositionDescription)}
                ${this._renderBadgeVariability} ${this._renderSecondaryAmount}
                ${k._showDescription(e,this.switchPositionDescription)}
              </dd>
            </dl>
          `:y` <span class="amount"> ${this._setAmount(i)} </span> `}
    `}render(){return y`
      ${this.twoColumn?this.items.map((i=>this._renderTpl(i))):this._renderTpl()}
    `}}export{k as B,S as b};
